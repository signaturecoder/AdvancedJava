<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTER</title>
</head>
<body>
<form action="RegisterServe1" method="post">
<table>

<tr>
<td><label>CID</label></td>
<td><input type="text" name="cid"></td>
<td><a href="Add.jsp">Details</a></td>
</tr>
<tr>
<td><label>PASSWORD</label></td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</form>
</body>
</html>