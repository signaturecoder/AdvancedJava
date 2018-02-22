<%@page import="java.util.Iterator"%>
<%@page import="master1.DUO.FdDAO1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master1.DTO.FD_DTO1"%>
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
<td>FDID</td>
<td>FD_AMT</td>
<td>ACC_NO</td>
<td>NO_OF_YEAR</td>
<td>BOOKING_DATE</td>
<td>INTEREST RATE</td>
<td>MATURITY VALUE</td>
<%
FdDAO1 fddao = new FdDAO1();
ArrayList result = fddao.ShowFdData();
Iterator itr = result.iterator();
while(itr.hasNext()){
       FD_DTO1 fddto=(FD_DTO1)itr.next();
%>
<tr>
<td><%=fddto.getFdid() %></td>
<td><%=fddto.getFdamt() %></td>
<td><%=fddto.getSavaccno() %></td>
<td><%=fddto.getNoy() %></td>
<td><%=fddto.getBdt() %></td>
<td><%=6.5 %></td>
<td><%=fddto.getFdamt()+(fddto.getFdamt()*0.065*fddto.getNoy()) %>
</tr>
<%} %>
</body>
</html>