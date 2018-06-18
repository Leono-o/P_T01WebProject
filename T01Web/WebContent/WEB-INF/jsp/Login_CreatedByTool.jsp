<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-nested.tld" prefix="nested" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>登录</title>
    <script type="text/javascript" src="scripts/T01Common.js"></script>
</head>
<body>
    <jsp:include page="/WEB-INF/jsp/Header.jsp"></jsp:include>
    <!-- 消息区域 -->
    <html:errors/>
    <h1>登录</h1>
    <!-- 表单区域 -->
    <html:form action="/LoginAction">

        用户名：<html:text property="userName"/>
        密码：<html:text property="pswd"/>

    <html:submit onclick="setEventID('E01')">登录</html:submit>
    <jsp:include page="/WEB-INF/jsp/T01Common.jsp"></jsp:include>
    </html:form>
</body>
</html>
