<?php
// Registration form: submits values to welcome.php using POST.
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 680px; margin: 2rem auto; padding: 0 1rem; }
        label { display: block; margin-top: 1rem; }
        input, select, textarea { box-sizing: border-box; width: 100%; padding: .6rem; margin-top: .3rem; }
        button { margin-top: 1.2rem; padding: .7rem 1.2rem; cursor: pointer; }
    </style>
</head>
<body>
    <h1>Registration Form</h1>
    <form action="welcome.php" method="post">
        <label for="name">Full name</label>
        <input id="name" name="name" type="text" required maxlength="100">

        <label for="email">Email</label>
        <input id="email" name="email" type="email" required maxlength="150">

        <label for="phone">Phone</label>
        <input id="phone" name="phone" type="tel" maxlength="30">

        <label for="gender">Gender</label>
        <select id="gender" name="gender" required>
            <option value="">Select one</option>
            <option value="Female">Female</option>
            <option value="Male">Male</option>
            <option value="Other">Other</option>
            <option value="Prefer not to say">Prefer not to say</option>
        </select>

        <label for="dob">Date of birth</label>
        <input id="dob" name="dob" type="date">

        <label for="course">Course</label>
        <input id="course" name="course" type="text" maxlength="100">

        <label for="address">Address</label>
        <textarea id="address" name="address" rows="3" maxlength="500"></textarea>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
