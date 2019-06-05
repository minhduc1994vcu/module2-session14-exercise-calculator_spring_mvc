
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>calculator</h1>
  <form method="post">
    <input type="text" name="first_operand" value=${operand1}>
    <input type="text" name="second_operand"value=${operand2}>
    <br><br>
    <input type="submit" value="add(+)" name="operator"/>
    <input type="submit" value="sub(-)" name="operator">
    <input type="submit" value="mul(x)" name="operator">
    <input type="submit" value="div(/)" name="operator">
  </form>
  <span>Result ${expression} : ${result}</span>
  </body>
</html>
