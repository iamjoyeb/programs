<!-- 6. Write a PHP script to print the multiplication table for a given number. -->
<html>
	<head>
	</head>
		<body>
			<form method="POST">
				<h3> Enter Value To Print Multiplication of Number: </h3>
				Enter value <input type="text" name="no1">
				<input type="submit" name="check" value="Print Multiplication of Number"><br>
			</form>
			<?php
				if (isset($_POST['check'])) {
					$a = $_POST['no1'];
                    for ($i=1; $i<=10; $i++){
                        echo $a."*".$i."=".$a*$i."<br>";
                    }
				}
			?>
		</body>
</html>
<!-- Output:
  Enter Value To Print Multiplication of Number:
  Enter value: 5
  [Print Multiplication of Number]
  Result:
    5*1=5
    5*2=10
    5*3=15
    5*4=20
    5*5=25
    5*6=30
    5*7=35
    5*8=40
    5*9=45
    5*10=50
-->