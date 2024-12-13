<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login-Page</title>
</head>
<body>

<%
String message = (String) request.getAttribute("msg");
if(message != null){
%>

<h4 style="color:red;"><%=message%></h4>

<% 
}

%>

<form action="loginUser" method="get">
 <label for="userEmail">USEREMAIL:</label><br>
  <input type="email"  placeholder="Enter user email" name="userEmail"><br>
 
   <label for="userEmail">USERPASSWORD:</label><br>
  <input type="PASSWORD"  placeholder="Enter user password" name="password"><br>
   
  <input type="submit" value="LOGIN">
  
  </form>

</body>
</html>