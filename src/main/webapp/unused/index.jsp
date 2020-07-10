<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="ui" uri="http://xmlns.jcp.org/jsf/facelets"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Login Sachbearbeiter</title>
    <!--<link rel="stylesheet" type="text/css" href="main.css"/>-->
    <jsp:include page="../main.css"/>
</head>
<body>
<!--<a href="/QuickServlet">Click here to send GET request</a>-->


<br/><br/>
<div id="headertext">
    <div style="color: #ffffff; text-align: center;"><h1>Login</h1></div>
</div>

<div style="text-align: center;">
    <div style="color: darkblue; display: inline-block;">


            <br/>
            <div style="border-radius: 15px; background-color: orange; width: 300px;height: 100px;  position: relative; text-align: center; padding-top: 30px;">



            <!--    <view>
                    <form action="QuickServlet" method="post">
                        <message for="lastName">Hi</message>
                        <inputText value=""></inputText>

                        <outputText>Hi</outputText>
                        <commandButton type="submit" value="Login" style="background-color: darkgreen; color: #ffffff; width: 100px; height: 30px;"/>

                    </form>
                </view>-->

                <div style="font-weight: bold; color: darkblue;">Username: </div>
                <br/>
                <div style="font-weight: bold; color: darkblue;">Password: <inputText size="15"/></div>
            </div>
            <br/><br/>
            <!--<commandButton type="submit" value="Login" style="background-color: darkgreen; color: #ffffff; width: 100px; height: 30px;"/>-->



    </div>
</div>

<div id="newsLogin">
    <div id="newsLoginHead">
        <div style="text-align: center; font-weight: bold; font-size: 40px;">News</div><br/>
    </div>
    <div>
        <b style="font-family: Arial;">- Neue Version V1.0</b>
        <div style="margin-left: 5px; margin-right: 5px; font-family: 'News Gothic MT';">
            Fehler wurden behoben und Sachbearbeiter sowie Administratoren können sich anmelden.
        </div>
    </div>
    <div>
        <b style="font-family: Arial;">- Neue Version V0.5</b>
        <div style="margin-left: 5px; margin-right: 5px; font-family: 'News Gothic MT';">
            Es gibt noch diverse Komplikationsprobleme mit Java Versionen.
        </div>
    </div>

</div>

<!---->
<!--<p id="test"><b>Eingegebener Benutzername:</b></p>-->
<!--<facet name="footer"></facet>-->
<!--<outputText id="warningDose" escape="false" styleClass="redText" value="">Hi</outputText>-->


</body>
</html>