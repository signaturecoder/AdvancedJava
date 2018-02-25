<%@page import="master1.DTO.LoanDTO1"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master1.DUO.LoanDAO1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOAN DETAILS</title>
</head>
<body>
<table border =2>
<tr>
<td>LNID</td>
<td>LN_AMT</td>
<td>DATE OF REQ</td>
<td>PERIOD</td>
<td>CID</td>
<%
LoanDAO1 lndao = new LoanDAO1();
ArrayList result = lndao.ShowLnData();
Iterator itr = result.iterator();
while(itr.hasNext())
{
	LoanDTO1 lndto = (LoanDTO1)itr.next();
%>
<tr>
<td><%=lndto.getLnid() %></td>
<td><%=lndto.getLnamt() %></td>
<td><%=lndto.getDoreq() %></td>
<td><%=lndto.getPeriod() %></td>
<td><%=lndto.getCid() %></td>
</tr>
<%}%>
</body>
</html>