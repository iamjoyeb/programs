<?php
// Question 2: Search products by product name.
require __DIR__ . '/db.php';

$search = trim((string)($_GET['name'] ?? ''));
$stmt = $conn->prepare(
    'SELECT prodid, prodname, prodcompnay, prodprice FROM products WHERE prodname LIKE ? ORDER BY prodname'
);
$pattern = '%' . $search . '%';
$stmt->bind_param('s', $pattern);
$stmt->execute();
$result = $stmt->get_result();

function e(string $value): string {
    return htmlspecialchars($value, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}
?>
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Product Search</title></head>
<body>
<h1>Search Products</h1>
<form method="get">
    <label for="name">Product name:</label>
    <input id="name" name="name" value="<?= e($search) ?>" placeholder="e.g. Laptop">
    <button type="submit">Search</button>
    <a href="q2_products.php">Show all</a>
</form>
<table border="1" cellpadding="8" cellspacing="0">
    <tr><th>Product ID</th><th>Product Name</th><th>Company</th><th>Price</th></tr>
    <?php if ($result->num_rows > 0): ?>
        <?php while ($row = $result->fetch_assoc()): ?>
        <tr>
            <td><?= (int)$row['prodid'] ?></td>
            <td><?= e($row['prodname']) ?></td>
            <td><?= e($row['prodcompnay']) ?></td>
            <td><?= number_format((float)$row['prodprice'], 2) ?></td>
        </tr>
        <?php endwhile; ?>
    <?php else: ?>
        <tr><td colspan="4">No matching products found.</td></tr>
    <?php endif; ?>
</table>
<p><a href="index.php">Home</a></p>
</body>
</html>
