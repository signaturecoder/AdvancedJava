<%@page import="master1.DTO.AccountDTO1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master1.DUO.AccountDUO1"%>
<%@page import="java.util.Iterator"%>
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
<td>ACCOUNT NO</td>
<td>ACCOUNT TYPE</td>
<td>CUSTOMER ID</td>
<td>BALANCE</td>
</tr>
<%
AccountDUO1 acduo = new AccountDUO1();
ArrayList results = acduo.getDetailData();
Iterator itr1 = results.iterator();
while(itr1.hasNext()){
	AccountDTO1 acdto = (AccountDTO1)itr1.next();
	System.out.println("THE BALANCE IS:"+acdto.getBal());
%>
<tr>
<td><%=acdto.getAccno()%></td>
<td><%=acdto.getAccp()%></td>
<td><%=acdto.getCid()%></td>
<td><%=acdto.getBal()%></td>
</tr>
<%}%>
</table>
</body>
</html>