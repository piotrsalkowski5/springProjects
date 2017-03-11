<%@page import="pl.piotrsalkowski.Operations"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<style>

 body
{
background-color:tan;
} 
table
{
background-color:#3d4543;
height:300px;
width:250px;
border-radius:10px;
position:relative;
top:80px;
left:40%;
} 

.display
{
background-color:#222;
width:220px;
position:relative;
left:8px;
top:20px;
height:40px;
position:relative;
height:35px;
color:black;
background-color:#bccd95;
font-size:21px;
}
 
.keys
{
position:absolute;
top:15px;
}
.button
{
width:40px;
height:30px;
border:none;
border-radius:8px;
margin-left:12px;
cursor:pointer;
border-top:2px solid transparent;
font-size: 21px;
}
.button.gray
{
color:white;
background-color:#6f6f6f;
border-bottom:black 2px solid;
border-top:2px #6f6f6f solid;
}
.button.pink
{
color:black;
background-color:#ff4561;
border-bottom:black 2px solid;
}
.button.white
{
color:black;
background-color:white;
border-bottom:black 2px solid;
border-top:2px 303030 solid;
}
.button.orange
{
color:black;
background-color:orange;
border-bottom:black 2px solid;
border-top:2px FF9933 solid;
}
.gray:active
{
border-top:black 2px solid;
border-bottom:2px #6f6f6f solid;
}
.pink:active
{
border-top:black 2px solid;
border-bottom:#ff4561 2px solid;
}
.black:active
{
border-top:black 2px solid;
border-bottom:#303030 2px solid;
}
.orange:active
{
border-top:black 2px solid;
border-bottom:FF9933 2px solid;
}

</style>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>
	<jsp:useBean id="operations" class="pl.piotrsalkowski.Operations"
		scope="session"></jsp:useBean>

	<div id="CalculatorBody">
		<center>
			<form action="http://localhost:8080/CalculatorJSP/Kalkulator"
				method="post">
				<center>
				<table cellspacing="2" class="keys">
					<tr>
						<td colspan="4"><input name="displayContent" class="display" type="text"
							value="<%=operations.getDisplay()%>" readonly /></td>
					</tr>
					</tr>
					<tr>
						<td><input type=submit value="0" name="button0" class="button gray"></td>
						<td><input type=submit value="1" name="button1" class="button gray"></td>
						<td><input type=submit value="2" name="button2" class="button gray"></td>
						<td><input type=submit value="+" name="buttonAddition" class="button pink"></td>
					</tr>
					<tr>
						<td><input type=submit value="3" name="button3" class="button gray"></td>
						<td><input type=submit value="4" name="button4" class="button gray"></td>
						<td><input type=submit value="5" name="button5" class="button gray"></td>
						<td><input type=submit value="-" name="buttonSubstraction" class="button pink"></td>
					</tr>
					<tr>
						<td><input type=submit value="6" name="button6" class="button gray"></td>
						<td><input type=submit value="7" name="button7" class="button gray"></td>
						<td><input type=submit value="8" name="button8" class="button gray"></td>
						<td><input type=submit value="*" name="buttonMultiplication" class="button pink"></td>
					</tr>
					<tr>
						<td><input type=submit value="9" name="button9" class="button gray"></td>
						<td><input type=submit value="C" name="buttonCE" class="button white"></td>
						<td><input type=submit value="=" name="buttonEqual" class="button orange"></td>
						<td><input type=submit value="/" name="buttonDivision" class="button pink"></td>
					</tr>
				</table>
				</center>
			</form>
		</center>
	</div>
</body>
</html>