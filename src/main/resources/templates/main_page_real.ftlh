<html lang="en">
<head>
        <meta charset="UTF-16">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>ldinka's life</title>
    <link href="/static/css/main.css" type = "text/css" rel = "stylesheet">

</head>
<body>
<div class = "kok">
    <h1 class="sr">
        get ${counter} page
    </h1>
    <form class="sr" action="/signIn" method="get">
          <button>
              sign in
          </button>
    </form>
    <table class = "pop">
        <th>
            id
        </th>
        <th>
            email
        </th>
        <th>
            password
        </th>
        <#list accounts as account>
            <tr>
                <td>
                    ${account.id}
                </td>
                <td>
                    ${(account.email)!"null"}
                </td>
                <td>
                    ${account.password}
                </td>
            </tr>
        </#list>
    </table>
    <footer class="footer">
        <div class="waves">
            <div class="wave" id="wave1"></div>
            <div class="wave" id="wave2"></div>
            <div class="wave" id="wave3"></div>
            <div class="wave" id="wave4"></div>
        </div>
        <ul class="social-icon">
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-vk"></ion-icon>
                </a></li>
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-twitter"></ion-icon>
                </a></li>
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-linkedin"></ion-icon>
                </a></li>
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-instagram"></ion-icon>
                </a></li>
        </ul>
        <ul class="menu">
            <li class="menu__item"><a class="menu__link" href="#">Home</a></li>
            <li class="menu__item"><a class="menu__link" href="#">About</a></li>
            <li class="menu__item"><a class="menu__link" href="#">Services</a></li>
            <li class="menu__item"><a class="menu__link" href="#">Team</a></li>
            <li class="menu__item"><a class="menu__link" href="#">Contact</a></li>

        </ul>
        <p>&copy;2023 Tyagelsky Artyom | All Rights Reserved</p>
    </footer>
    </div>
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>