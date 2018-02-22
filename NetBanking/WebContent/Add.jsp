<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master1.DTO.CustomerDTO1"%>
<%@page import="master1.DUO.CustomerDUO1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<td>CUSTOMER ID</td>
<td>CUSTOMER NAME</td>
<td>CUSTOMER PHONE</td>
<td>CUSTOMER EMAIL</td>
<td>HOUSE NO</td>
<td>STREET</td>
<td>PIN</td>
<td>AGE</td>
<td>PAN</td>
<td>OCCUPATION</td>
<td>GENDER</td>
<%
CustomerDUO1 cduo=new CustomerDUO1();
ArrayList result = cduo.getData();
Iterator itr = result.iterator();
while(itr.hasNext()){
	CustomerDTO1 cdtoo=(CustomerDTO1)itr.next();
%>
<tr>
<td><%=cdtoo.getCid()%></td>
<td><%=cdtoo.getCname()%></td>
<td><%=cdtoo.getCphone()%></td>
<td><%=cdtoo.getCemail()%></td>
<td><%=cdtoo.getChouse()%></td>
<td><%=cdtoo.getCstreet()%></td>
<td><%=cdtoo.getCpin()%></td>
<td><%=cdtoo.getCage()%></td>
<td><%=cdtoo.getCpan()%></td>
<td><%=cdtoo.getCocco()%></td>
<td><%=cdtoo.getCgender()%></td>
</tr>
<%}%>
</table>
</body>
</html>