package com.hotmail.ch.leon.web.action;

import com.hotmail.ch.leon.web.app.ApplCommonBean;
import com.hotmail.ch.leon.web.consts.Huamian;
import com.hotmail.ch.leon.web.form.JiansuoForm;
import com.hotmail.ch.leon.web.form.LoginForm;

public class WelcomeAction extends T01AbstractAction {	
	
	public void execute (ApplCommonBean applCommonBean) {
		
		LoginForm outForm = new LoginForm();
		applCommonBean.setOutForm("LoginForm", outForm);
		
		applCommonBean.setAttribute("loginUser", null);
		applCommonBean.setForward(Huamian.LOGIN);
		
	}

}
