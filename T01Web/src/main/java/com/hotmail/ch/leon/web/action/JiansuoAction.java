package com.hotmail.ch.leon.web.action;

import com.hotmail.ch.leon.web.app.ApplCommonBean;
import com.hotmail.ch.leon.web.consts.Huamian;
import com.hotmail.ch.leon.web.delegate.JiansuoDelegate;
import com.hotmail.ch.leon.web.delegate.LoginDelegate;
import com.hotmail.ch.leon.web.form.JiansuoForm;
import com.hotmail.ch.leon.web.form.LoginForm;

public class JiansuoAction extends T01AbstractAction {
	
	/**
	 * 检索
	 * 
	 * @param applCommonBean
	 */
	public void doE01 (ApplCommonBean applCommonBean) {
		
		
		JiansuoForm inForm = (JiansuoForm)applCommonBean.getInFormClone();
		
		JiansuoForm outForm = JiansuoDelegate.doE01(inForm);
		
		applCommonBean.setOutForm("JiansuoForm", outForm);
		

		applCommonBean.setForward(Huamian.JIANSUO);
		
	}
	
	/**
	 * 清除
	 * 
	 * @param applCommonBean
	 */
	public void doE02 (ApplCommonBean applCommonBean) {
		
		
		JiansuoForm inForm = (JiansuoForm)applCommonBean.getInFormClone();
		
		JiansuoForm outForm = JiansuoDelegate.doE02(inForm);
		
		applCommonBean.setOutForm("JiansuoForm", outForm);
		

		applCommonBean.setForward(Huamian.JIANSUO);
		
	}
	
	/**
	 * 登录
	 * 
	 * @param applCommonBean
	 */
	public void doE03 (ApplCommonBean applCommonBean) {
		
		
		JiansuoForm inForm = (JiansuoForm)applCommonBean.getInFormClone();
		
		JiansuoForm outForm = JiansuoDelegate.doE03(inForm);
		
		applCommonBean.setOutForm("JiansuoForm", outForm);
		

		applCommonBean.setForward(Huamian.JIANSUO);
		
	}
	
}
