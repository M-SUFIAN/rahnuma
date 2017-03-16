<?php
require"init.php";
$user_name=$_POST["login_name"];
$user_pass=$_POST["login_pass"];

$sql_query="select name from guides where user_name like'$user_name'and user_pass like '$user_pass';";

$result=mysqli_query($con,$sql_query);
if(mysqli_num_rows($result)>0)
{
$row=mysqli_fetch_assoc($result);
$name=$row["name"];
echo "<h3>HELLO WELCOME ".$name ."</h3>";
}
else
{
echo"no info is avaliable Login Failed";
}


?>