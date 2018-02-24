<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loan Apply</title>
</head>
<body>
<form action="LoanServe1" method="post">
<p align="left"><b><u>Apply For Loan</u></b>
<table>
<tr>
<td><label>LOAN AMOUNT</label></td>
<td><input type="text" name="lnamt"></td></tr>
<tr>
<td><label>DATE OF REQUEST</label></td>
<td><input type="text" name="doreq"></td></tr>
<tr>
<td><label>PERIOD</label></td>
<td><select name="period">
<option value="1">1st</option>
<option value="2">2nd</option>
<option value="3">3rd</option>
<option value="4">4th</option>
<option value="5">5th</option>
<option value="6">6th</option>
<option value="7">7th</option>
<option value="8">8th</option>
<option value="9">9th</option>
<option value="10">10th</option>
</select>
<tr>
<td><label>CID</label></td>
<td><input type="text" name="cid"></td></tr>
<tr>
<td><input type="submit" value="APPLY"></td></tr>
</table>
</form>
</body>
</html>