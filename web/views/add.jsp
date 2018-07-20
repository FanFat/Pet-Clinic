<%--
  Created by IntelliJ IDEA.
  User: fanzi
  Date: 13.02.2018
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Добавление</title>
    </head>

    <body>
        <div>
            <h1>Клиника домашних животных</h1>
        </div>

        <div>
            <%
                if (request.getAttribute("userName") != null) {
                    out.println("<p>Клиент '" + request.getAttribute("userName") + "' добавлен!</p>");
                }
            %>
            <div>
                <div>
                    <h2>Добавить клиента</h2>
                </div>

                <form method="post">
                    <label>Имя клиента:
                        <input type="text" name="clientName"><br>
                    </label>
                    <label>Имя питомца:
                        <input type="text" name="petName"><br>
                    </label>
                    <label>Тип животного:
                        <select name="kindPet" id="">
                            <option value="Cat">Кошка</option>
                            <option value="Dog">Собака</option>
                        </select>
                    </label>
                    <button type="submit">Добавить</button>
                </form>
                <br>
            </div>
        </div>

        <div>
            <button onclick="location.href='/'">Вернуться на главную страницу</button>
        </div>
    </body>
</html>
