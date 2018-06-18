package com.hotmail.ch.leon.web.action;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hotmail.ch.leon.web.app.ApplCommonBean;
import com.hotmail.ch.leon.web.form.T01AbstractForm;

public abstract class T01AbstractAction extends Action {
	
	private ApplCommonBean _applCommonBean = null;
	
	public ActionForward execute (ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		_applCommonBean = new ApplCommonBean (mapping,form,req,res);
		
		T01AbstractForm t01Form = (T01AbstractForm)form;
		if (t01Form == null) {
			Method m = getClass().getMethod("execute", ApplCommonBean.class);
			m.invoke(this,_applCommonBean);
		} else {
			String _event = t01Form.get_EventID();
			
			String methodName = "do" + _event;		
			Method m = getClass().getMethod(methodName, ApplCommonBean.class);
			m.invoke(this,_applCommonBean);
		}
		
		return (_applCommonBean.getForward());
	}

}
