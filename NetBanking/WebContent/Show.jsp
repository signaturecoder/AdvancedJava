<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="master1.DUO.AccountDUO1"%>
<%@page import="master1.DTO.CID_ACCNO_REPORTDTO"%>
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
<td>CNAME</td>
<td>CPHONE</td>
<td>CEMAIL</td>
<td>AGE</td>
<td>PAN</td>
<td>GENDER</td>
</tr>
<%
AccountDUO1 acduo = new AccountDUO1();
ArrayList result = acduo.showData();
Iterator itr = result.iterator();
while(itr.hasNext()){
	CID_ACCNO_REPORTDTO addto = (CID_ACCNO_REPORTDTO)itr.next();
	System.out.println("hello");
%>
<tr>
<td><%=addto.getAccno()%></td>
<td><%=addto.getAccp()%></td>
<td><%=addto.getCid()%></td>
<td><%=addto.getBal()%></td>
<td><%=addto.getCname()%></td>
<td><%=addto.getCphone()%></td>
<td><%=addto.getCemail()%></td>
<td><%=addto.getAge()%></td>
<td><%=addto.getPan()%></td>
<td><%=addto.getGender()%></td>
</tr>
<%}%>
</table>

</body>
</html>