<html>
<body bgcolor="honeydew">
<%@ page import="java.util.Date" %>
<fieldset>
<h2>Books Informations are Updated Successfully </h2> <br>

<h4>Book: ${lib_details.bookName} </h4>
<h4>Author:${lib_details.authorName} </h4>
<h4>Price:${lib_details.price} </h4>
<h4>Pages:${lib_details.page} </h4>
<br>
<strong>Current Time is</strong>: <%=new Date() %>
<br>
<br>

<p text-align="Left"><a href="http://localhost:8080/Login?" >Home</a></p>
<p text-align="Right"><a href="http://localhost:8080/update.jsp?" >Back</a></p>
</fieldset>
</body>
</html>