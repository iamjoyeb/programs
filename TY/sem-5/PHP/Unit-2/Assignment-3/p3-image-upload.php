<?php
// Accept only JPG/JPEG and PNG images, verify their actual image content, then display them.
$message = '';
$imageUrl = '';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if (!isset($_FILES['image_file']) || $_FILES['image_file']['error'] !== UPLOAD_ERR_OK) {
        $message = 'Upload failed. Please select an image.';
    } elseif ($_FILES['image_file']['size'] > 5 * 1024 * 1024) {
        $message = 'Image is too large. Maximum size is 5 MB.';
    } else {
        $tmp = $_FILES['image_file']['tmp_name'];
        $originalName = basename($_FILES['image_file']['name']);
        $extension = strtolower(pathinfo($originalName, PATHINFO_EXTENSION));
        $allowedExtensions = ['jpg', 'jpeg', 'png'];
        $imageInfo = @getimagesize($tmp);
        $allowedMimeTypes = ['image/jpeg', 'image/png'];
        $mimeType = $imageInfo['mime'] ?? '';

        if (!in_array($extension, $allowedExtensions, true) ||
            !in_array($mimeType, $allowedMimeTypes, true) ||
            !is_uploaded_file($tmp)) {
            $message = 'Invalid file. Only real JPG, JPEG, and PNG images are allowed.';
        } else {
            $uploadDir = __DIR__ . '/uploads/';
            if (!is_dir($uploadDir) && !mkdir($uploadDir, 0755, true)) {
                $message = 'Could not create upload directory.';
            } else {
                $safeName = bin2hex(random_bytes(8)) . '.' . ($mimeType === 'image/png' ? 'png' : 'jpg');
                $destination = $uploadDir . $safeName;
                if (move_uploaded_file($tmp, $destination)) {
                    $imageUrl = 'uploads/' . $safeName;
                    $message = 'Image uploaded successfully.';
                } else {
                    $message = 'Could not save the image.';
                }
            }
        }
    }
}
function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Image Upload</title>
</head>
<body>
    <h1>Upload JPG, JPEG, or PNG</h1>
    <?php if ($message !== ''): ?><p><?= e($message) ?></p><?php endif; ?>
    <form method="post" enctype="multipart/form-data">
        <label for="image_file">Choose image (maximum 5 MB)</label>
        <input id="image_file" type="file" name="image_file" accept=".jpg,.jpeg,.png,image/jpeg,image/png" required>
        <button type="submit">Upload Image</button>
    </form>

    <?php if ($imageUrl !== ''): ?>
        <h2>Uploaded image</h2>
        <img src="<?= e($imageUrl) ?>" alt="Uploaded image" style="max-width: 100%; height: auto;">
    <?php endif; ?>

    <p><a href="index.php">Registration form</a> | <a href="upload.php">General file upload</a></p>
</body>
</html>
