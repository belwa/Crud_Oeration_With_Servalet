<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%!
public int addTwoNumber(int a, int b){
	
	return a+b;
}
%>

<%
int sum = addTwoNumber(123,123);
out.print(sum);
%>


</body>
</html>