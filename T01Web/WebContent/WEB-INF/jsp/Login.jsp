<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>

<html>

<head >
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>登录</title>

<script type="text/javascript" src="scripts/T01Common.js"></script>

</head>
<body>
<!-- 消息区域 -->
<html:errors/>

<html:form action="/LoginAction">

用户名: <html:text property="userName"/>
密码: <html:text property="pswd"/>

<input type="submit" onclick="setEventID('E01')" value="Login">

<jsp:include page="/WEB-INF/jsp/T01Common.jsp"></jsp:include>
</html:form>
</body>
</html>