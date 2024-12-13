<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Registration Form</h3>
<div>
  <form action="userRegistration" method="get">
    <label for="userId">USER_ID:</label><br>
    <input type="text" id="userId" placeholder="Enter user ID" name="userId"><br>
    
    <label for="userName">USER_NAME:</label><br>
    <input type="text" id="userName" placeholder="Enter the user name" name="userName"><br>
    
    <label for="userEmail">USER_EMAIL:</label><br>
    <input type="email" id="userEmail" placeholder="Enter user email" name="userEmail"><br>
    
    <label for="userDob">USER_DOB:</label><br>
    <input type="date" id="userDob" name="userDob"><br>

    <label>USER_GENDER:</label><br>
    <input type="radio" id="male" name="gender" value="Male"> 
    <label for="male">Male</label>
    <input type="radio" id="female" name="gender" value="Female"> 
    <label for="female">Female</label><br>
    
        
    <label for="userPassword">USER_PASSWORD</label><br>
    <input type="password" id="userPassword" name="userPassword"><br>
    
    
    
    <input type="submit" name="submit" value="Register"><br>
  </form>
</div>


</body>
</html>