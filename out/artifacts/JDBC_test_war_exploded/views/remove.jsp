<%--
  Created by IntelliJ IDEA.
  User: fanzi
  Date: 14.02.2018
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Удаление</title>
    </head>
    <body>
    <div>
        <h1>Клиника домашних животных</h1>
    </div>

    <div>
        <div>
            <div>
                <h2>Удалить клиента</h2>
            </div>

            <form method="post">
                <label>Имя клиента:
                    <input type="text" name="clientName"><br>
                </label>
                <button type="submit">Удалить</button>
            </form>
        </div>
    </div>

    <div>
        <button onclick="location.href='/'">Вернуться на главную страницу</button>
    </div>
    </body>
</html>
