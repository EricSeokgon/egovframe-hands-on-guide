<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employee</title>
  </head>

  <body>
      <div>NAME: <c:out value="${param.name}" />
      </div>
      <div>COMPANY: <c:out value="${param.company}" />
      </div>
      <div>PHONE: <c:out value="${param.phone}" />
      </div>
      <div>EMAIL: <c:out value="${param.email}" />
      </div>
  </body>

  </html>