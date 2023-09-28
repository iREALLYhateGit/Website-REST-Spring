<html lang="en">
<head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>ldinka's life</title>
    <link href="/static/css/main.css" type = "text/css" rel = "stylesheet">

</head>
<body>
    <h1>
        get ${counter} page
    </h1>
    <form action="/signIn" method="get">
          <button>
              sign up
          </button>
    </form>
    <table>
        <th>
            id
        </th>
        <th>
            name
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
                    ${account.name}
                </td>
                <td>
                    ${account.password}
                </td>
            </tr>
        </#list>
    </table>
    <ul>
        <li><a href="#"><i class="fa-brands fa-instagram instagram">inst</i></a></li>
        <li><a href="#"><i class="fa-brands fa-whatsapp whatsapp"></i>wh</a></li>
        <li><a href="#"><i class="fa-brands fa-twitter twitter">tg</i></a></li>
    </ul>
</body>
</html>