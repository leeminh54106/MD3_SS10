<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/25/2024
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculate</title>
</head>
<body>
<form action="/calculate-servlet" method="post">
    <label for="">first number</label>
    <input type="text" name="firstNumber" />

    <label for="">operator</label>
    <select name="operator" id="">
        <option value="plus">plus</option>
        <option value="minus">minus</option>
        <option value="multi">multi</option>
        <option value="divide">divide</option>
    </select>

    <label for="">Second number</label>
    <input type="text" name="secondNumber">
    <button type="submit">Calculate</button>
</form>
</body>
</html>

