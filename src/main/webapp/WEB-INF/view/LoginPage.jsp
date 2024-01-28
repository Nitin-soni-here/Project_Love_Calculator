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
<div align="left">
<p>
<form:form action="ContactSupport" method="get" modelAttribute="communicationDTO"  >
<input type="submit" value="Contact Support"/>
</form:form>
</p>
</div>
<div align="center">
<p>
<h3> Login Form..!!</h3>
<p>
<form:form action="second" method="get" modelAttribute="matchDtoConfig" >
<label for="n">Name :</label>
<form:input id="n" path="userName" placeholder="Romeo"/>
<form:errors path="userName" cssClass="errors"/>
</p>
<p>
<label for="cn">Crush Name : </label>
<form:input id="cn" path="crushName" placeholder="Juliet"/>
</p>
<p>
<form:checkbox path="termAndCondition"/>
<label> Agree Terms & Conditions </label>
<form:errors path="termAndCondition" cssClass="errors"/>
</p>

<input type="submit" value="Match"/>
</div>
</form:form>


<div align="center">
<p>
<form:form action="Registration" method="get" modelAttribute="registrationDtoConfig"  >
<input type="submit" value="Registration"/>
</form:form>
</p>
</div>





</body>
</html>
