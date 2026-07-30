<!-- Q3. Write a PHP script to demonstrate the use of break statement in a for loop. -->
<?php
	for($i=1;$i<=10;$i++){
		if($i==5){
			echo "Break Method Executed:<br>";
			break;
		}
		echo $i."<br>";
	}
?>

<!--
Output:
1
2
3
4
Break Method Executed
-->