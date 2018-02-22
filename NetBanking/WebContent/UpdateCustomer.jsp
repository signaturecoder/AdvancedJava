<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateCustomer1" method="post">
<table>
<tr>
<td><label>CUSTOMER ID</label></td>
<td><input type="text" name="cid"></td></tr>
<tr>
<td><label>CUSTOMER NAME</label></td>
<td><input type="text" name="cname"></td></tr>
<tr>
<td><label>CUSTOMER PHONE</label></td>
<td><input type="text" name="cphone"></td></tr>
<tr>
<td><label>CUSTOMER EMAIL</label></td>
<td><input type="text" name="cemail"></td></tr>
<tr>
<td><label>HOUSE NO</label></td>
<td><input type="text" name="chouse"></td></tr>
<tr>
<td><label>STREET</label></td>
<td><input type="text" name="cstreet"></td></tr>
<tr>
<td><label>PINCODE</label></td>
<td><input type="text" name="cpin"></td></tr>
<tr>
<td><label>AGE</label></td>
<td><input type="text" name="cage"></td></tr>
<tr>
<td><label>PAN NO</label></td>
<td><input type="text" name="cpan"></td></tr>
<tr>
<td><label>OCCUPATION</label></td>
<td><select name="cocco">
<option value="STUDENT">STUDENT</option>
<option value="BUISNESS">BUISNESS</option>
<option value="TEACHER">TEACHER</option>
<option value="HOUSEWIFE">HOUSEWIFE</option>
</select>
</td>
</tr>
<tr>
<td><label>GENDER</label></td>
<td><select name="cgender">
<option value="M">MALE</option>
<option value="F">FEMALE</option>
</select>
</td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td></tr>
</table>
</form>
</body>
</html>