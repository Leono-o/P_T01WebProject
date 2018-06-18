<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="UTF-8"%>

<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<html:form>
Hello <bean:write name="loginUser" property="userName"/>!
</html:form>
