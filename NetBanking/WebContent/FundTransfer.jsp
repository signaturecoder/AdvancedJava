<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FundTransferServe1" method="post">
<table>
<tr>
<td><label>SOURCE ACCNO</label></td>
<td><input type="text" name="saccno"></td></tr>
<tr>
<td><label>BENEFICIARY/ACCNO</label></td>
<td><input type="text" name="bnf"></td></tr>
<tr>
<td><label>AMOUNT</label></td>
<td><input type="text" name="amt"></td></tr>
<tr>
<td><label>DATE OF TRANSACTION</label></td>
<td><input type="text" name="dt"></td></tr>
<tr>
<td><input type="submit" value="TRANSFER"></td></tr>
</table>
</form>
</body>
</html>