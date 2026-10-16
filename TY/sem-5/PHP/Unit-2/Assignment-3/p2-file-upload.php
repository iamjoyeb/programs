<?php
// Demonstrates uploading a general file. This is a teaching example.
$message = '';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if (!isset($_FILES['uploaded_file']) || $_FILES['uploaded_file']['error'] !== UPLOAD_ERR_OK) {
        $message = 'Upload failed. Please choose a file and try again.';
    } elseif ($_FILES['uploaded_file']['size'] > 5 * 1024 * 1024) {
        $message = 'File is too large. Maximum size is 5 MB.';
    } else {
        $uploadDir = __DIR__ . '/uploads/';
        if (!is_dir($uploadDir) && !mkdir($uploadDir, 0755, true)) {
            $message = 'Could not create upload directory.';
        } else {
            $originalName = basename($_FILES['uploaded_file']['name']);
            $extension = strtolower(pathinfo($originalName, PATHINFO_EXTENSION));
            $safeName = bin2hex(random_bytes(8)) . ($extension !== '' ? '.' . $extension : '');
            $destination = $uploadDir . $safeName;

            if (is_uploaded_file($_FILES['uploaded_file']['tmp_name']) &&
                move_uploaded_file($_FILES['uploaded_file']['tmp_name'], $destination)) {
                $message = 'File uploaded successfully as: ' . $safeName;
            } else {
                $message = 'Could not save the uploaded file.';
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
    <title>File Upload</title>
</head>
<body>
    <h1>Upload a File</h1>
    <?php if ($message !== ''): ?><p><?= e($message) ?></p><?php endif; ?>
    <form method="post" enctype="multipart/form-data">
        <label for="uploaded_file">Choose a file (maximum 5 MB)</label>
        <input id="uploaded_file" type="file" name="uploaded_file" required>
        <button type="submit">Upload</button>
    </form>
    <p><a href="index.php">Registration form</a> | <a href="image_upload.php">Image upload example</a></p>
</body>
</html>
