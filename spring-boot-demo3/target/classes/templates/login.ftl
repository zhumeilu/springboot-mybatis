<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<h3>信息：${msg!"无"}</h3>
<form action="/login" method="post">
用户名:<input type="text" name="username"><br>
密码：<input type="password" name="password" >
<input type="submit" value="提交 ">
</form>
</body>
</html>