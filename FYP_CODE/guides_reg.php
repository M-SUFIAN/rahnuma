<?php
require"init.php";
$name=$_POST["user"];
$user_name=$_POST["user_name"];
$user_pass=$_POST["user_pass"];

echo '<h3>DATA jslksajkldjlksj $name   </h3>';

$sql_query="INSERT INTO guides values('$name','$user_name','$user_pass');";

if(mysqli_query($con,$sql_query))
{
echo"<h3>DATA INSERTED</h3>";
}
else
{
echo"<h3>DATA Insertion failed</he>".mysqli_error($con);
}

?> 
