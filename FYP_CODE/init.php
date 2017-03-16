<?php
$db_name="rahnuma";
$mysql_username="root";
$mysql_pass="";
$server_name="localhost";

$con=mysqli_connect($server_name,$mysql_username,$mysql_pass,$db_name);

if(!$con)
{
//echo"connection error......".mysqli_connect_error();
}
else
{
//echo"<h3>Database connected</h3>";
}
?>