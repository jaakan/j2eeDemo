<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="pojos.j2eedemo.TB_Person" %>
    <%@ page import="java.util.*" %>
<%
List<TB_Person> list=(List<TB_Person>) request.getAttribute("list"); 
for(TB_Person p:list){
	out.print(p.getName());
}
%>