<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grade Results</title>
</head>
<body>
	<h2>Your Grades are as follows</h2>
	<%!
		String inputMarks;
		int marks;
		String grade;
	%>
	<%
		inputMarks = request.getParameter("txtGrade");
		marks = Integer.parseInt(inputMarks);
		if(marks > 100 || marks < 0 ) {
			out.println("Marks Out of range");
		}else {
			if (marks >= 90 && marks <= 100) {
	            grade = "O";
	        } else if (marks >= 80 && marks <= 89) {
	            grade = "A+";
	        } else if (marks >= 70 && marks <= 79) {
	            grade = "A";
	        } else if (marks >= 60 && marks <= 69) {
	            grade = "B+";
	        } else if (marks >= 50 && marks <= 59) {
	            grade = "B";
	        } else if (marks >= 45 && marks <= 49) {
	            grade = "C";
	        } else if (marks >= 40 && marks <= 44) {
	            grade = "P";
	        } else if (marks >= 0 && marks <= 39) {
	            grade = "F";
	        } else {
	            grade = "Invalid marks";
	        }
		%>
			<p>Your marks: <%= marks %></p>
			<p>Your Grades	<%= grade %></p>	<% 
		}
	%>
	
</body>
</html>