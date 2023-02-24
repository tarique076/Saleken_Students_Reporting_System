<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
* {
	text-align: center;
}

h1 {
	color: grey;
	font-family: cursive;
	margin-bottom: 50px;
}

h2{
	margin-bottom: 40px;
	color: rgb(13, 29, 77);
}
h2:hover { 
	transform : scale( 1.2);
	trnsition: smooth;
}
div{
	width: 40%;
	margin: auto;
	box-shadow: rgba(0, 0, 0, 0.56) 0px 22px 70px 4px;
	padding: 50px 0 50px 0;
	border-radius: 5%;
}
</style>
<meta charset="ISO-8859-1">
<title>Student Reporting System</title>
</head>
<body>
	<h1>Student Reporting System</h1>
	<div>
		<h2>
			<a href="/addStudent"> Add Student details</a>
		</h2>
		<h2>
			<a href="/getClassPercentage"> Check class percentage</a>
		</h2>
		<h2>
			<a href="/subjectAvg"> Check Average Marks for a subject.</a>
		</h2>
		<h2>
			<a href="/topTwoStudents"> Check Top two students</a>
		</h2>
		<h2>
			<a href="/getAllStudents"> View Students</a>
		</h2>
	</div>

</body>
</html>