<%-- 
    Document   : arithmaticcalculator
    Created on : 18-Sep-2018, 7:34:19 AM
    Author     : Mason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            First Number: <input type="text" name="first" value="${firstNum}"><br>
            Second Number: <input type="text" name="second" value="${secondNum}"><br>
            <input type="submit" value="+" name="add">
            <input type="submit" value="-" name="sub">
            <input type="submit" value="*" name="mul">
            <input type="submit" value="%" name="mod">
        </form>
        <div>
            ${message}
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>
