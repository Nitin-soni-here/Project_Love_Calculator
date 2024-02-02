<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Context-Type" context="text/html; charset=UTF-8">

<style type="text/css">
.errors{
color: red;
position:fixed;
text-align: left;
margin-left:30px;}
</style>
</head>
<body>



<h1 align="center">Love Calculator</h1>
<hr>
</br>
<div align="center">
<p>
<h3> Login Form..!!</h3>
<p>
 <c:if test="${param.error!=null}">
 <i style="color:red;"> Username or a password is incorrect</i>
 </c:if>

 <c:if test="${param.login!=null}">
 <i Style="color:red;"> Registration Successful</i>
 </c:if>

<form:form method="POST">
<label for="n">Name :</label>
<input type="text" id="n" name="username" placeholder="UserName"/>
</p>

<p>
<label for="cn">Password : </label>
<input type="password" id="cn" name="password" placeholder="Password"/>
</p>

<p>
<input type="checkbox" name="termAndCondition"/>
<label> Agree Terms & Conditions </label>
</p>
<input type="submit" value="Sign Up"/>
</div>
</form:form>

<div align="center">
<p>
<form:form action="Registration" method="get" modelAttribute="registrationDtoConfig"  >
<input type="submit" value="Registration"/>
</form:form>
</p>
</di>