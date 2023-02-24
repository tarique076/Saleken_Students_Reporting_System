<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Students</title>
</head>

<style>
* {
	text-align: center;
}

h1 {
	color: grey;
	font-family: cursive;
	margin-bottom: 50px;
}

div{
	width: 30%;
	margin: auto;
	box-shadow: rgba(0, 0, 0, 0.56) 0px 22px 70px 4px;
	padding: 50px 20px 50px 20px;
	border-radius: 5%;
}

input{
	width: 90%;
	padding: 10px;
	border: 2px solid;
	margin: 7px;
	border-radius: 5%;
}

button{
	margin-top: 20px;
	padding: 10px;
	width: 100%;
}

button:hover{
	font-weight: bold;
	background-color: skyblue;
}

</style>
<body>

<h1>Add Student Details</h1>

<div>
<form method="post">
    <input type="number" name="roll_no" placeholder="Roll No.">
    <br>
    <input type="text" name="name" placeholder="Name">
    <br>
    <input type="number" name="englishMarks" placeholder="English Marks">
    <br>
    <input type="number" name="mathsMarks" placeholder="Maths Marks">
    <br>
    <input type="number" name="scienceMarks"placeholder="Science Marks">
    <br>
    <input type="number" name="semester" placeholder="Semester">
    <br>
    <button>Submit</button>
</form>
</div>
</body>
</html>