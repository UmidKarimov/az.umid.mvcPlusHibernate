<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<body>
<h2>Employee</h2>
<br>

<form:form action="saveEmployee" modelAttribute="newEmployee">
    Name<form:input path="name"/><br>

    Surname<form:input path="surname"/><br>

    Department<form:input path="department"/><br>

    Salary<form:input path="salary"/><br>

    <input type="submit" value="Submit">

</form:form>

</body>
</html>