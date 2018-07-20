<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: fanzi
  Date: 13.02.2018
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Список</title>
    </head>

    <body>
        <div>
            <h1>Клиника домашних животных</h1>
        </div>

        <div>
            <div>
                <div>
                    <h2>Список клиентов</h2>
                </div>
                <%
                    List<String> names = (List<String>) request.getAttribute("userNames");
                    List<String> petName = (List<String>) request.getAttribute("petName");
                    List<String> kindPet = (List<String>) request.getAttribute("kindPet");

                    if (names != null && !names.isEmpty()) {
                        out.println("<ui>");
                        for (int i = 0; i < names.size(); i++) {
                            out.println("<li>" + "Клиент " + names.get(i) + " и его " + kindPet.get(i).toLowerCase() + " по кличке " + petName.get(i) + "</li>");
                        }
                        out.println("</ui>");
                    } else out.println("<p>Клиентов пока нет</p>");
                %>
                <br>
            </div>
        </div>

        <div>
            <button onclick="location.href='/'">Вернуться на главную страницу</button>
        </div>
    </body>
</html>
