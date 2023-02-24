<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average</title>
</head>
<style>
h1 {
	text-align: center;
	color: grey;
	font-family: cursive;
	margin-bottom: 50px;
	color: grey;
}

div {
	width: 40%;
	margin: auto;
	text-align: center;
}

input {
	width: 90%;
	border: 2px solid;
	padding: 10px;
	margin-bottom: 20px;
}

button {
	width: 30%;
	padding: 5px;
}

button:hover {
	font-weight: bold;
	background-color: skyblue;
}
</style>
<body>

	<h1>Average marks in a Subject</h1>
	<div>

		<form method="post">
			<input type="text" name="subject"
				placeholder="Subject Name (English or Maths or Science)"> <br>

			<button>Submit</button>
		</form>
	</div>

</body>
</html>