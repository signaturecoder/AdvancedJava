<%@page import="master1.DTO.RD_DTO1"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master1.DUO.RdDUO1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border =2>
<tr>
<td>RDID</td>
<td>RD_AMT</td>
<td>ACC_NO</td>
<td>NO_OF_MONTH</td>
<td>BOOKING_DATE</td>
<%
RdDUO1 rddao = new RdDUO1();
ArrayList result = rddao.ShowRdData();
Iterator itr = result.iterator();
while(itr.hasNext()){
	RD_DTO1 rddto =(RD_DTO1)itr.next();
%>
<tr>
<td><%=rddto.getRdid() %></td>
<td><%=rddto.getRdamt() %></td>
<td><%=rddto.getSavaccno() %></td>
<td><%=rddto.getNom() %></td>
<td><%=rddto.getBdt() %></td>
</tr>
<%}%>
</body>
</html>