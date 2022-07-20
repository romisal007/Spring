<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.rohit.spring.springmvc.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
List<Employee> emplist=(List<Employee>) request.getAttribute("employees");
for(Employee emp: emplist){
		out.println(emp.getId());
		out.println(emp.getName());
		out.println(emp.getSalary());
}

%>
 
</body>
</html>