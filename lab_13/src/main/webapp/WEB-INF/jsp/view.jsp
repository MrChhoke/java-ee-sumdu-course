<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="students" scope="request" type="java.util.List"/>
<html>
<head>
    <title>StudentPage</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <style>
        body {
            height: 100vh;
        }

        .container {
            height: 100%;
        }
    </style>
</head>
<body>
<div class="container d-flex align-items-center justify-content-center">
    <div class="d-flex" style="column-gap: 35px">
        <div>
            <form method="post">
                <div class="input-group mb-3">
                    <span class="input-group-text">Name</span>
                    <input type="text" class="form-control" name="name">
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text">Surname</span>
                    <input type="text" class="form-control" name="surname">
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text">Age</span>
                    <input type="number" class="form-control" name="age">
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text">Email</span>
                    <input type="email" class="form-control" name="email">
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text">Group</span>
                    <input type="text" class="form-control" name="group">
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text">Faculty</span>
                    <input type="text" class="form-control" name="faculty">
                </div>
                <div class="d-flex flex-row-reverse">
                    <button type="submit" class="btn btn-success">Send</button>
                </div>
            </form>
        </div>
        <c:if test="${students.size() > 0}">
            <div>
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Surname</th>
                        <th scope="col">Age</th>
                        <th scope="col">Email</th>
                        <th scope="col">Group</th>
                        <th scope="col">Faculty</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="student" items="${students}">
                        <tr>
                            <th><c:out value="${student.name}"/></th>
                            <th><c:out value="${student.surname}"/></th>
                            <th><c:out value="${student.age}"/></th>
                            <th><c:out value="${student.email}"/></th>
                            <th><c:out value="${student.group}"/></th>
                            <th><c:out value="${student.faculty}"/></th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>
    </div>
</div>
</body>
</html>