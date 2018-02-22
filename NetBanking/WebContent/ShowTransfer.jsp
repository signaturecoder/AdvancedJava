<%@page import="master1.DTO.FundTransferDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master1.DUO.FundTransferDAO1"%>
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
<td>TRANSID</td>
<td>SOURCE ACCNO</td>
<td>BENEFICIARY ACCNO</td>
<td>AMOUNT</td>
<td>DATE OF TRANSACTION</td>
<%
FundTransferDAO1 ftdao = new FundTransferDAO1();
ArrayList result = ftdao.ShowTransferData();
Iterator itr = result.iterator();
while(itr.hasNext()){
         FundTransferDTO ftdto = (FundTransferDTO)itr.next();	
%>
<tr>
<td><%=ftdto.getTransid() %></td>
<td><%=ftdto.getSaccno() %></td>
<td><%=ftdto.getBnf() %></td>
<td><%=ftdto.getAmt() %></td>
<td><%=ftdto.getDt() %></td>
</tr>
<%}%>
</body>
</html>