%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">
<html>
<body>
<div align="center">
<h1>Love Calculator</h1>
<hr>
<h2> The love Calculator Predict :</h2>
<h3>${matchDtoConfig.userName} & ${matchDtoConfig.crushName} are </h3>
<h2> ${matchDtoConfig.appResult}</h2>
</div>
<p>
<a href="/web-01/Email" ><h3> Send Result To Your Email</h3></a>
</body>
</html>
