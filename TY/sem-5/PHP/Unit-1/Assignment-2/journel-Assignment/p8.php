<!-- Q8. Write a PHP script to accept 10 numbers from the user and display them in ascending order. -->
<html>
	<head>
	</head>
	<body>
		<form method="POST">
		<?php
		for($i=1;$i<=10;$i++)
		{
			echo "Number:".($i).":<input type='text' name='num[]'><br><br>";
		}
		?>
			<input type="Submit" name="check" value="Click"><br>
		</form>
	</body>
</html>

<?php
	if(isset($_POST['check']))
	{
		$number=$_POST['num'];
		
		sort($number);
		
		echo "<b><h> Number in Ascending Order:</b></h><br>";
		foreach($number as $value)
		{
			echo $value."<br>";
		}
	}
?>

<!--
Output:
Number 1: 45
Number 2: 12
Number 3: 78
Number 4: 3
Number 5: 56
Number 6: 23
Number 7: 91
Number 8: 8
Number 9: 34
Number 10: 67

Number in Ascending Order:
3
8
12
23
34
45
56
67
78
91
-->