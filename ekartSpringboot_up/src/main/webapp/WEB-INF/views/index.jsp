<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
  <h1>Spring Boot - MVC web application example</h1>
  <hr>

  <div class="form">
  <form action="./login" method="post">
		<table>
			<tr>
			<th colspan="2"> Login Page</th>
			</tr>
			<tr>
			<td> <label>User Name</label> </td>
			<td> <input type="text" id="un" name="un"/> </td>
			</tr>
			<tr>
			<td> <label>Password</label> </td>
			<td> <input type="password" id="pw" name="pw"/> </td>
			</tr>
			<tr>
			<td colspan="2" align="center"> <button> <strong>Login </strong> </button> </td>
			</tr>
		</table>
	</form>
  </div>

</body>
</html>