<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateAccount1" method="post">
<table>
<tr>
<td><label>ACCOUNT NO</label></td>
<td><input type="text" name="accno"></td></tr>
<tr>
<td><label>ACCOUNT TYPE</label></td>
<td><select name="accp">
<option value="CURRENT">CURRENT</option>
<option value="SAVINGS">SAVINGS</option>
<option value="RECURRING DEPOSIT">RECURRING DEPOSIT</option>
<option value="FIXED DEPOSIT">FIXED DEPOSIT</option>
</select>
</td>
</tr>
<tr>
<td><label>CUSTOMER ID</label></td>
<td><input type="text" name="cid"></td></tr>
<tr>
<td><label>BALANCE</label></td>
<td><input type="text" name="bal"></td></tr>
<tr>
<td><input type="submit" value="UPDATE"></td></tr>
</table>
</form>
</body>
</html>