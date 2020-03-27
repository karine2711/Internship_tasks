<%--<jsp:useBean id="author" scope="request" type="model.Author"/>--%>

<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Spring MVC</title>
    <meta charset="utf-8">
</head>
<body>
<div>
<form action="create" method="get"  >
    <header>Author</header>
    <label>
        Name:
        <input type="text" name="name" placeholder="name">
    </label>
    <label>
        Surname:
        <input type="text" name="surname"placeholder="surname">
    </label>
    <input type="submit"/>
</form>

</div>

${requestScope.author.name}
${requestScope.author.surname}

</body>
</html>