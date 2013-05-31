<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<%@ page import="test.beans.PrintPersons" %>
<%@ page import="pojos.j2eedemo.TB_Person" %>
<%
PrintPersons pp=new PrintPersons();
TB_Person person=new TB_Person();
person.setAge("12");
person.setName("Tom");
person.setSex("M");
pp.addPerson(person);
List<TB_Person> list=pp.query("from TB_Person");
for(TB_Person p:list){
	out.write(p.getName()+"<br>");
}
pp.close();
%>