<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String login=(String)session.getAttribute("loginname");
	if(login==null)
	{
		response.sendRedirect("loginpage");
	}
%>
