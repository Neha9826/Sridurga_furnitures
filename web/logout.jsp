<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function goBack()
            {
                window.history.back();
            }
            setTimeout("goBack()",0);
            </script>
    </head>
    <body onload="goBack()">
        
        
        <%
           response.sendRedirect("about.jsp?l=1");
        %>
    </body>
</html>
