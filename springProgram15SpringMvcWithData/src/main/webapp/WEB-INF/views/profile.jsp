<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>

	<h2> Welcome : User</h2>
	<%-- <h3> Name : ${model_name}</h3>
	<h3> Email Id : ${model_email}</h3>
	<h3> Phone No : ${model_phno}</h3> --%>
	
	<h3> Name : ${user.getName()}</h3>
	<h3> Email Id : ${user.getEmail()}</h3>
	<h3> Phone No : ${user.getPhoneNo()}</h3>

</body>
</html>