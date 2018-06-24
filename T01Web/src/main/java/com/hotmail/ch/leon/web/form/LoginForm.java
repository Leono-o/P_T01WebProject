package com.hotmail.ch.leon.web.form;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;

public class LoginForm extends T01AbstractForm {

	private static final long serialVersionUID = 1L;

	/** 用户名 */
	private String userName = null;


	/** 密码 */
	private String pswd = null;


	/** 用户名 的取得 */
	public String getUserName() {
		return userName;
	}


	/** 用户名 的赋值 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/** 密码 的取得 */
	public String getPswd() {
		return pswd;
	}


	/** 密码 的赋值 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	@Override
	public String getClassName() {
		return "LoginForm";
	}

}
