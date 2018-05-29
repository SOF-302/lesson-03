<%@page pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/views/common/head.jsp"%>
</head>
<body>
    <div class="container">

        <h1>Login Page</h1>

        <c:url value="/auth/login" var="login"/>
        <form:form action="${login}" method="POST" modelAttribute="loginForm">
            <div class="form-group">
                <label for="username">Email address:</label>
                <form:input path="username" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <form:password path="password" cssClass="form-control"/>
            </div>
            <div class="form-group form-check">
                <label class="form-check-label">
                    <form:checkbox path="remember" cssClass="form-check-input"/>
                    Remember me
                </label>
            </div>
            <form:button name="submit" value="submit">Submit</form:button>
        </form:form>
    </div>
</body>
</html>