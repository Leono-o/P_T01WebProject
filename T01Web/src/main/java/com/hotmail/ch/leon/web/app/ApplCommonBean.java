package com.hotmail.ch.leon.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hotmail.ch.leon.web.form.T01AbstractForm;

public class ApplCommonBean {
	
	private ActionMapping _mapping = null;
	private T01AbstractForm _form = null;
	HttpServletRequest _req = null;
	
	private ActionForward _forward = null;
	
	public ApplCommonBean(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) {
		_mapping = mapping;
		_form = (T01AbstractForm)form;
		_req = req;
	}
	
	public ActionForm getInFormClone() {
		if (_form == null) {
			return null;
		}
		try {
			return (ActionForm)_form.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void setOutForm(String formName, T01AbstractForm form) {
		setAttribute(formName, form);
	}
	
	public void setAttribute(String key, Object obj) {
		HttpSession session = _req.getSession();
		session.setAttribute(key, obj);
	}
	
	public Object getAttribute(String key) {
		HttpSession session = _req.getSession();
		return session.getAttribute(key);
	}
	
	public void setForward(String huamian) {
		_forward =  _mapping.findForward(huamian);
	}
	
	public ActionForward getForward() {
		return _forward;
	}
}
