<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Include and Require</title>
</head>
<body>
    <?php
    // include: emits a warning if the file is missing and execution generally continues.
    include __DIR__ . '/header.php';

    echo '<p>This text appears after include.</p>';

    // require: stops execution with a fatal error if the required file is missing.
    require __DIR__ . '/footer.php';
    ?>
    <p><a href="index.php">Registration form</a></p>
</body>
</html>
