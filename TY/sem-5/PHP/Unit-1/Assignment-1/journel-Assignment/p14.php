<!-- 14. Write a PHP script to reverse a number. --> 
<html>
	<head>
	</head>
		<body>
			<form method="POST">
				<h3> Enter Value To Get Reverse Number: </h3>
				Enter value:  <input type="text" name="no1"><br>
				<input type="submit" name="check" value="Get Reverse Number"><br>
			</form>
			<?php
				if (isset($_POST['check'])) {
					$a = $_POST['no1'];
                    $rev=0;
                        while($a>0){
                            $d=$a%10;
                            $rev=($rev*10)+$d;
                            $a=(int)($a/10);
                        }
                    echo "Reverse Number is: ".$rev;
				}
			?>
		</body>
</html>
<!-- Output:
  Enter Value To Get Reverse Number:
  Enter value: 1234
  [Get Reverse Number]
  Result: Reverse Number is: 4321

  Enter value: 5678
  [Get Reverse Number]
  Result: Reverse Number is: 8765
-->
