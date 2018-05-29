<%@page pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/views/common/head.jsp"%>
</head>
<body>
    <%@include file="/WEB-INF/views/common/navigator.jsp"%>

    <div class="container">

        <h1>Student Edit Page</h1>

        <form:form action="<spring:url value="/student/edit"/>" method="POST" modelAttribute="studentDto">
            <div class="form-group">
                <label for="username">Full Name:</label>
                <form:input path="fullName" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="username">Gender:</label>
                <form:radiobuttons path="gender" items="${gendersMap}" cssClass="form-check-label"/>
            </div>

             <div class="form-group">
                <label for="username">Classes:</label>
                <c:forEach items="${classDtoList}" var="item">
                <div class="form-check form-check-inline">
                  <form:checkbox path="classes" id="classes${index}" value="${item.id}" cssClass="form-check-input"/>
                  <label class="form-check-label" for="defaultCheck1">${item.name}</label>
                </div>
                </c:forEach>
            </div>

            <form:button name="submit" value="submit">Submit</form:button>
        </form:form>
    </div>
</body>
</html>