<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	h1 {
	text-align: center;
	color: grey;
	font-family: cursive;
	margin-bottom: 50px;
	color: grey;
}

h2 {
	text-align: center;
}
div {
	margin: auto;
	width: 150px;
	height: 150px;
	font-size: 30px;
	background-color: lightblue;
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
<body>

<h1>Average marks of entered subject</h1>

<div>
	<h2>${average}</h2>
</div>

</body>
</html>