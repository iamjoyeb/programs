<?php
// Show submitted registration values safely in an HTML table.
if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    http_response_code(405);
    exit('Please submit the registration form first. <a href="index.php">Go to form</a>');
}

$fields = [
    'Full name' => $_POST['name'] ?? '',
    'Email' => $_POST['email'] ?? '',
    'Phone' => $_POST['phone'] ?? '',
    'Gender' => $_POST['gender'] ?? '',
    'Date of birth' => $_POST['dob'] ?? '',
    'Course' => $_POST['course'] ?? '',
    'Address' => $_POST['address'] ?? '',
];

function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 800px; margin: 2rem auto; padding: 0 1rem; }
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #999; padding: .7rem; text-align: left; vertical-align: top; }
        th { width: 30%; }
    </style>
</head>
<body>
    <h1>Welcome, <?= e((string)$fields['Full name']) ?>!</h1>
    <table>
        <thead><tr><th>Field</th><th>Submitted value</th></tr></thead>
        <tbody>
        <?php foreach ($fields as $label => $value): ?>
            <tr>
                <th><?= e($label) ?></th>
                <td><?= nl2br(e((string)$value)) ?></td>
            </tr>
        <?php endforeach; ?>
        </tbody>
    </table>
    <p><a href="index.php">Back to registration form</a></p>
</body>
</html>
