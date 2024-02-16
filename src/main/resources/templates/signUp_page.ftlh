<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-16">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Signing Up</title>
    <link href="/static/css/pop.css" type = "text/css" rel = "stylesheet">

</head>
<body>
<div class="container">
    <form action="/signUp/verifyAccount" method="post">
        <p>Welcome</p>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <input name="email" placeholder="email"><br>
        <input type="submit" value="Create Account"><br>
        <a href="/signIn">Already have an account?</a>
    </form>

    <div class="drops">
        <div class="drop drop-1"></div>
        <div class="drop drop-2"></div>
        <div class="drop drop-3"></div>
        <div class="drop drop-4"></div>
        <div class="drop drop-5"></div>
    </div>

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="/static/js/signIn.js" type="text/javascript"></script>
</body>
</html>