package com.hotmail.ch.leon.web.action;

import com.hotmail.ch.leon.web.app.ApplCommonBean;
import com.hotmail.ch.leon.web.consts.Huamian;
import com.hotmail.ch.leon.web.delegate.LoginDelegate;
import com.hotmail.ch.leon.web.form.FindBookForm;
import com.hotmail.ch.leon.web.form.LoginForm;

public class LoginAction extends T01AbstractAction {
	
	/**
	 * 初始化
	 * @param applCommonBean
	 */
	public void doE00 (ApplCommonBean applCommonBean) {
		
		LoginForm outForm = new LoginForm();
		applCommonBean.setAttribute("loginUser", null);
		
		applCommonBean.setOutForm("LoginForm", outForm);
		applCommonBean.setForward(Huamian.LOGIN);
		
	}
	
	/**
	 * 登录
	 * @param applCommonBean
	 */
	public void doE01 (ApplCommonBean applCommonBean) {
		
		LoginForm inForm = (LoginForm)applCommonBean.getInFormClone();
		FindBookForm outForm = LoginDelegate.doE01(inForm);
		
		applCommonBean.setAttribute("loginUser", inForm);
		
		applCommonBean.setOutForm("FindBookForm", outForm);
		applCommonBean.setForward(Huamian.FINDBOOK);
		
	}
}
