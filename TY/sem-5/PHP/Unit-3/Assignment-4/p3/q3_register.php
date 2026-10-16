<?php
// Question 3: Compare password and confirm password.
// This is a classroom demonstration; it does not store a user account.
$error = '';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $password = (string)($_POST['password'] ?? '');
    $confirm = (string)($_POST['confirm_password'] ?? '');

    if ($password !== '' && hash_equals($password, $confirm)) {
        header('Location: q3_success.php');
        exit;
    }
    $error = 'Password and confirm password do not match.';
}
function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Password Check</title></head>
<body>
<h1>Compare Passwords</h1>
<?php if ($error !== ''): ?><p style="color:red"><?= e($error) ?></p><?php endif; ?>
<form method="post">
    <label for="password">Password:</label>
    <input id="password" name="password" type="password" required>
    <br><br>
    <label for="confirm_password">Confirm password:</label>
    <input id="confirm_password" name="confirm_password" type="password" required>
    <br><br>
    <button type="submit">Submit</button>
</form>
<p><a href="index.php">Home</a></p>
</body>
</html>
