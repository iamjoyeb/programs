<?php
// Question 4: List users with Edit and Delete actions.
require __DIR__ . '/db.php';

if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['delete_id'])) {
    $id = filter_var($_POST['delete_id'], FILTER_VALIDATE_INT);
    if ($id !== false && $id !== null && $id > 0) {
        $stmt = $conn->prepare('DELETE FROM users WHERE id = ?');
        $stmt->bind_param('i', $id);
        $stmt->execute();
    }
    header('Location: q4_users.php');
    exit;
}

$result = $conn->query('SELECT id, name, email FROM users ORDER BY id');

function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>User Management</title></head>
<body>
<h1>User Details</h1>
<table border="1" cellpadding="8" cellspacing="0">
    <tr><th>ID</th><th>Name</th><th>Email</th><th>Action</th></tr>
    <?php while ($row = $result->fetch_assoc()): ?>
    <tr>
        <td><?= (int)$row['id'] ?></td>
        <td><?= e($row['name']) ?></td>
        <td><?= e($row['email']) ?></td>
        <td>
            <a href="q4_edit.php?id=<?= (int)$row['id'] ?>">Edit</a>
            <form method="post" style="display:inline" onsubmit="return confirm('Delete this user?');">
                <input type="hidden" name="delete_id" value="<?= (int)$row['id'] ?>">
                <button type="submit">Delete</button>
            </form>
        </td>
    </tr>
    <?php endwhile; ?>
</table>
<p><a href="index.php">Home</a></p>
</body>
</html>
