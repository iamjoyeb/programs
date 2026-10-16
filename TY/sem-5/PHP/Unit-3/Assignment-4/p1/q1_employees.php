<?php
// Question 1: Display employees from highest to lowest salary.
require __DIR__ . '/db.php';

$employeeConn = new mysqli($host, $username, $password, 'emp');
$employeeConn->set_charset('utf8mb4');
$result = $employeeConn->query(
    'SELECT Emp_name, designation, salary FROM emp_detail ORDER BY salary DESC'
);

function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Employees by Salary</title></head>
<body>
<h1>Employee Details (High to Low Salary)</h1>
<table border="1" cellpadding="8" cellspacing="0">
    <tr><th>Employee Name</th><th>Designation</th><th>Salary</th></tr>
    <?php while ($row = $result->fetch_assoc()): ?>
    <tr>
        <td><?= e($row['Emp_name']) ?></td>
        <td><?= e($row['designation']) ?></td>
        <td><?= number_format((float)$row['salary'], 2) ?></td>
    </tr>
    <?php endwhile; ?>
</table>
<p><a href="index.php">Home</a></p>
</body>
</html>
