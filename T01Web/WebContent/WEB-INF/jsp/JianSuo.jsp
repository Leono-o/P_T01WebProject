<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-nested.tld" prefix="nested" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>检索</title>

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
			<Label><html:radio property="type" value="1" />店铺号码</Label>
		</td>
		<td>
			<html:text property="storeCd"/>
		</td>
	</tr>
	<tr>
		<td>
			<Label><html:radio property="type" value="2" />店铺区域</Label>
		</td>
		<td>
			<html:select property="storeNm">
			<html:optionsCollection property="storeNm_list" />
			</html:select>
		</td>
	</tr>
</table>

<html:submit onclick="setEventID('E01')">检索</html:submit>
<html:submit onclick="setEventID('E02')">清除</html:submit>
<html:submit onclick="setEventID('E03')">登录</html:submit>

<!-- 结果区域 -->
<nested:notEmpty property="jiansuoTbl01DetaiVoList">
	<table>
		<thead><tr>
			<th>No.</th>
			<th>选择</th>
			<th>编号</th>
			<th>名称</th>
		</thead>
		<tbody>
		
		<nested:iterate indexId="tbl01" name="JiansuoForm" property="jiansuoTbl01DetaiVoList">
			<tr>
				<td>${tbl01}</td>
				<td><nested:checkbox property="check"/></td>
				<td><nested:write property="storeCd"/></td>
				<td><nested:write property="storeNm"/></td>		
			</tr>
		</nested:iterate>
		
		</tbody>
	</table>
</nested:notEmpty>	

<jsp:include page="/WEB-INF/jsp/T01Common.jsp"></jsp:include>
</html:form>
</body>
</html>