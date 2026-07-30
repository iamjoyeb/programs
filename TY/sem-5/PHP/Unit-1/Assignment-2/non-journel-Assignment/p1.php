<!-- Q1. Write a PHP script to sort an array of elements in ascending order. -->
<?php
	$cars=array("C","A","B");
	sort($cars);
	echo "Sorted Value <br>";
	foreach($cars as $values){
		echo $values."<br>";
	}
?>

<!--
Output:
Sorted Value
A
B
C
-->
