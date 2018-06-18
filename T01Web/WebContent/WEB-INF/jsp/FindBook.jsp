<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-nested.tld" prefix="nested" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>检索书类</title>

<script type="text/javascript" src="scripts/T01Common.js"></script>

</head>
<body>
<jsp:include page="/WEB-INF/jsp/Header.jsp"></jsp:include>
<!-- 消息区域 -->
<html:errors/>

<h1>检索</h1>

<html:form action="/FindBookAction">
<!-- 检索区域 -->
<table>
	<tr>
		<td>
			<Label><html:radio property="searchType" value="1" />按种类</Label>
		</td>
		<td>
			<html:select property="bookType">
			<html:optionsCollection property="bookType_list" />
			</html:select>
			
		</td>
	</tr>
	<tr>
		<td>
			<Label><html:radio property="searchType" value="2" />按关键字</Label>
		</td>
		<td>
			出版年份：<html:text property="produceYear"/>
			书名：<html:text property="bookName"/>
		</td>
	</tr>
</table>

<html:submit onclick="setEventID('E01')">检索</html:submit>
<html:submit onclick="setEventID('E02')">清除</html:submit>



<!-- 结果区域 -->
<nested:notEmpty property="findBookTbl01DetailVOList">
	<table>
		<thead><tr>
			<th>No.</th>
			<th>选择</th>
			<th>书号</th>
			<th>种类</th>
			<th>书名</th>
			<th>出版日期</th>
		</thead>
		<tbody>
		
		<nested:iterate indexId="tbl01" name="FindBookForm" property="findBookTbl01DetailVOList">
			<tr>
				<td>${tbl01+1}</td>
				<td><nested:checkbox property="select"/></td>
				<td><nested:write property="bookID"/></td>
				<td><nested:write property="bookType"/></td>	
				<td><nested:write property="bookName"/></td>
				<td><nested:write property="produceYear"/></td>		
			</tr>
		</nested:iterate>
		
		</tbody>
	</table>
	
	<html:submit onclick="setEventID('E03')">编辑</html:submit>
	
</nested:notEmpty>	



<jsp:include page="/WEB-INF/jsp/T01Common.jsp"></jsp:include>
</html:form>
</body>
</html>