<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">
<html>
<head>
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

<div align="right">
<a href="/web-01/first"> <h2> Login Page </h2> </a>
</div>

<form:form action="successfull" method="get" modelAttribute="registrationDtoConfig"  >
<div align="center">
<h3> Registration Form...!!</h3>
<p>
<label for="n">Name :</label>
<form:input id="n" path="name" placeholder="UserName"/>
<form:errors path="name" cssClass="errors"/>
</p>

<p>
<label for="ei">EmailId :</label>
<form:input id="ei" path="emailId" placeholder="Email Address"/>
<form:errors path="emailId" cssClass="errors"/>
</p>

<p>
<label for="p">Password :</label>
<form:password id="p" path="password" placeholder='Password'/>
<form:errors path="password" cssClass="errors"/>
</p>

<p>
<label>Gender :</label>
Male<form:radiobutton path="gender" value="male"/>
Female<form:radiobutton path="gender" value="female"/>
<form:errors path="gender" cssClass="errors"/>

</p>

<p>
<label>Country :</label>
<form:select path="country">
<form:option value="Ind" label="India"/>
<form:option value="pak" label="Pakistan"/>
<form:option value="USA" label="USA"/>
<form:option value="germany" label="Germany"/>
<form:option value="china" label="China"/>
<form:option value="Indo" label="Indonesia"/>
</form:select>
<form:errors path="country" cssClass="errors"/>

</p>
<p>
<input type="Submit" value="Register"/>
</br>

</p>
</div>
</form:form>
</br>
</br>
</br>
<form:form action="successfull" method="get" modelAttribute="registrationDtoConfig"  >
<div align="center">
<h3>Communication Support </h3>

<label for="em"> EmailId : </label>
<form:input id="em" path="communicationDTO.emailId" placeholder="Nitinsoni01031997@gmail.com"/>
<form:errors path="communicationDTO.emailId" cssClass="errors"/>

<label for="ph"> Mobile No. : </label>
<form:input id="ph" path="communicationDTO.phone" placeholder="91-7737691232"/>
<form:errors path="communicationDTO.phone" cssClass="errors"/>

<p>
<input type="Submit" value="Submit"/>

</p>
</div>
</form:form>
</body>
</html>