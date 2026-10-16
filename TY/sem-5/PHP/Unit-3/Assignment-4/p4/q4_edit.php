<?php
// Question 4: Edit a user's name and email.
require __DIR__ . '/db.php';

$id = filter_var($_GET['id'] ?? $_POST['id'] ?? null, FILTER_VALIDATE_INT);
if (!$id || $id < 1) {
    http_response_code(400);
    exit('Invalid user ID. <a href="q4_users.php">Back to users</a>');
}

$error = '';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $name = trim((string)($_POST['name'] ?? ''));
    $email = trim((string)($_POST['email'] ?? ''));

    if ($name === '' || !filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $error = 'Please enter a name and a valid email address.';
    } else {
        $stmt = $conn->prepare('UPDATE users SET name = ?, email = ? WHERE id = ?');
        $stmt->bind_param('ssi', $name, $email, $id);
        $stmt->execute();
        header('Location: q4_users.php');
        exit;
    }
}

$stmt = $conn->prepare('SELECT name, email FROM users WHERE id = ?');
$stmt->bind_param('i', $id);
$stmt->execute();
$user = $stmt->get_result()->fetch_assoc();
if (!$user) {
    http_response_code(404);
    exit('User not found. <a href="q4_users.php">Back to users</a>');
}

function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Edit User</title></head>
<body>
<h1>Edit User</h1>
<?php if ($error !== ''): ?><p style="color:red"><?= e($error) ?></p><?php endif; ?>
<form method="post">
    <input type="hidden" name="id" value="<?= (int)$id ?>">
    <label for="name">Name:</label>
    <input id="name" name="name" value="<?= e((string)($_POST['name'] ?? $user['name'])) ?>" required>
    <br><br>
    <label for="email">Email:</label>
    <input id="email" name="email" type="email" value="<?= e((string)($_POST['email'] ?? $user['email'])) ?>" required>
    <br><br>
    <button type="submit">Save Changes</button>
    <a href="q4_users.php">Cancel</a>
</form>
</body>
</html>
