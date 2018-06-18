<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-nested.tld" prefix="nested" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>书类检索</title>
    <script type="text/javascript" src="scripts/T01Common.js"></script>
</head>
<body>
    <jsp:include page="/WEB-INF/jsp/Header.jsp"></jsp:include>
    <!-- 消息区域 -->
    <html:errors/>
    <h1>书类检索</h1>
    <!-- 表单区域 -->
    <html:form action="/FindBookAction">

        类型：<Label><html:radio property="searchType" value="0" />选择</Label>
        种类：<html:select property="bookType">
                    <html:optionsCollection property="bookType_list" />
                </html:select>
        出版年份：<html:text property="produceYear"/>
        书名：<html:text property="bookName"/>

    <nested:iterate indexId="tbl01" name="FindBookForm" property="fiindBookTbl01DetailVOList">
        ${tbl01}
        选择：<Label><nested:checkbox property="select"/>选择</Label>
        书号：<nested:write property="bookID"/>
        种类：<nested:write property="bookType"/>
        书名：<nested:write property="bookName"/>
        年份：<nested:write property="produceYear"/>
    </nested:iterate>

    <html:submit onclick="setEventID('E01')">检索</html:submit>
    <html:submit onclick="setEventID('E02')">清除</html:submit>
    <html:submit onclick="setEventID('E03')">编辑</html:submit>
    <jsp:include page="/WEB-INF/jsp/T01Common.jsp"></jsp:include>
    </html:form>
</body>
</html>
