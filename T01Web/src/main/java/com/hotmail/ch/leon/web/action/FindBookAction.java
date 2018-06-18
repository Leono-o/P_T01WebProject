package com.hotmail.ch.leon.web.action;

import com.hotmail.ch.leon.web.app.ApplCommonBean;
import com.hotmail.ch.leon.web.consts.Huamian;
import com.hotmail.ch.leon.web.delegate.FindBookDelegate;
import com.hotmail.ch.leon.web.form.FindBookForm;

public class FindBookAction extends T01AbstractAction {
	
	/**
	 * 检索
	 * 
	 * @param applCommonBean
	 */
	public void doE01 (ApplCommonBean applCommonBean) {
		
		
		FindBookForm inForm = (FindBookForm)applCommonBean.getInFormClone();
		
		FindBookForm outForm = FindBookDelegate.doE01(inForm);
		
		applCommonBean.setOutForm("FindBookForm", outForm);
		

		applCommonBean.setForward(Huamian.FINDBOOK);
		
	}
	
	/**
	 * 清除
	 * 
	 * @param applCommonBean
	 */
	public void doE02 (ApplCommonBean applCommonBean) {
		
		
		FindBookForm inForm = (FindBookForm)applCommonBean.getInFormClone();
		
		FindBookForm outForm = FindBookDelegate.doE02(inForm);
		
		applCommonBean.setOutForm("FindBookForm", outForm);
		

		applCommonBean.setForward(Huamian.FINDBOOK);
		
	}
	
	/**
	 * 编辑
	 * 
	 * 
	 * @param applCommonBean
	 */
	public void doE03 (ApplCommonBean applCommonBean) {
		
		
		FindBookForm inForm = (FindBookForm)applCommonBean.getInFormClone();
		
		FindBookForm outForm = FindBookDelegate.doE03(inForm);
		
		applCommonBean.setOutForm("FindBookForm", outForm);
		

		applCommonBean.setForward(Huamian.FINDBOOK);
		
	}
	
}
