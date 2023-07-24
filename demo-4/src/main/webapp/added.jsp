<html>
<head>
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi ${studentDetails.studentName},${studentDetails.rollNo} </h3><br>

<h4>Got and Added</h4>

<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>