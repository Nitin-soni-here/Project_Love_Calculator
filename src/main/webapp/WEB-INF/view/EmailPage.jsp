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
<form:form action="ShowEmailPage" method="get" modelAttribute="emailDTO">
<p>
<h2> Hello,${matchDtoConfig.userName} </h2>
<h2>Send Result To Your Email</h2>
</p>
</br>
<p>
<label for="ue"> EmailId : </label>
<form:input id="ue" path="userEmail" placeholder="xyz@gmail.com"/>
<form:errors path="userEmail" cssClass="errors"/>
</p>
<p>
<input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>