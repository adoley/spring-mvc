<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!--This tag is for form:error -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Details</title>
</head>
<body>
<body>
<!--For binding realted error -->
<form:errors path="individual.*"/>
<form action="/spring/binding/submit" method="post">
    <p>
        first name : <input type="text" name="firstName">
    </p>
    <p>
        Last name : <input type="text" name="lastName">
    </p>
    <input type="submit" value="submit">
</form>

</body>
</body>
</html>
