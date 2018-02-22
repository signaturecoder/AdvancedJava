<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RdServe1" method="post">
<table>
<tr>
<td><label>RD AMOUNT</label></td>
<td><input type="text" name="rdamt"></td></tr>
<tr>
<td><label>SB A/C NO</label></td>
<td><input type="text" name="savaccno"></td></tr>
<tr>
<td><label>NO OF MONTH</label></td>
<td><select name="nom">
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
<option value="11">11th</option>
<option value="12">12th</option>
</select>
<tr>
<td><label>BOOKING DOT</label></td>
<td><input type="text" name="bdt"></td></tr>
<tr>
<td><input type="submit" value="BOOK"></td></tr>
</table>
</form>
</body>
</html>