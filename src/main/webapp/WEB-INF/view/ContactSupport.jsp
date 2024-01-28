<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">
<html>
<body>

<h1 align="center">Love Calculator</h1>
<hr>
</br>
<div align="right">
<a href="/web-01/first"> <h2> Login Page </h2> </a>
</div>
<div align="center">
<form:form action="ShowContactSupportPage" method="get" modelAttribute="communicationDTO"  >
<h2> Contact Support</h2>
Need Help..?
</br>
Join Our Facebook Group
</br>
<p>
 Want Call..
 </p>
 <p>
<label for="em"> EmailId : </label>
<form:input id="em" path="emailId" placeholder="Email Address"/>
<label for="ph"> Mobile No. : </label>
<form:input id="ph" path="phone" placeholder="Contact No."/>
</p>
<p>
<input type="submit" value="Submit"/>
</br>


</p>
</form:form>
</br>
<p>
If you like our service, You can follow us at
</br>
<h4> Facebook  <a href="https://www.facebook.com/nitin.soni.948494"> Nitin Soni</a></h4>
<h4> Instagram  <a href="https://www.instagram.com/nitinsoni0103/"> Nitin_Soni</a></h4>
</p>
</div>
</body>
</html>