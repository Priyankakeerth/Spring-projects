
<html>
<head>
<link rel="Stylesheet" href="styles.css">
</head>
<body bgcolor="#66CDAA" >





<h1 >Welcome to the Add page</h1>
<fieldset>
<form action="info">
<div id="additiondesign">
        <label for="book">Book Name:</label>
		<input type="text" name="bookName" 
		pattern="(?=.*[a-z])(?=.*[A-Z]).{5,20}" title = "Must contain at least one capital letter">
		<br><br>
		
		<label for="author">Author Name:</label>
		<input type="text" name="authorName"
		pattern="(?=.*[a-z])(?=.*[A-Z]).{2,20}" title = "Must contain at least one capital letter">
		<br><br>
		
		<label for="pages">Pages:</label>
		<input type="number" name="page"
		  pattern="(?=.[0-9]){1,5}" title = "Numbers only allowed">
		  <br><br>
		<label for="price">Price:</label>
		<input type="number" name="price" 
		  pattern="(?=.[0-9]){1,5}" title = "Numbers only allowed">
		 <br><br>
		</div>
		
		<input type="submit" value=Submit>
		
		<p text-align="Center"><a href="http://localhost:8080/Login?" >Home</a></p>
		</form>

		</fieldset>
		<br>	<br>	<br>	<br>	<br>	<br>	<br>	<br>
		<p>Note: Office Employee only allowed to Add and Update book Details.
		</body>
		</html>