package com.hotmail.ch.leon.web.form;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.hotmail.ch.leon.web.common.throwable.EIRuntimeException;

public abstract class T01AbstractForm extends ActionForm  implements Cloneable {
	
	private static final long serialVersionUID = 1L;

	private String _EventID = null;
	

	public String get_EventID() {
		return _EventID;
	}

	public void set_EventID(String eventID) {
		this._EventID = eventID;
	}

	public abstract String getClassName();
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		String formClassName = getClassName();
		String validatorClassName = new StringBuilder("com.hotmail.ch.leon.web.validator.").append(formClassName).append("Validator").toString();
		
		ActionErrors actionErrors= null;

		try {
			Class formValidator = Class.forName(validatorClassName);
			String methodNm = new StringBuilder("check").append(_EventID).toString();
			Method 	method = formValidator.getMethod(methodNm, T01AbstractForm.class);
			actionErrors = (ActionErrors)method.invoke(null, this);
			if (actionErrors == null || actionErrors.size() == 0) {
				return null;
			}
			
		} catch (ClassNotFoundException e) {
			// Validator类不存在，不做check
		} catch (NoSuchMethodException e) {
			// Check方法不存在，不做check
		} catch (SecurityException e) {
			actionErrors = new ActionErrors();
			actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.system.validator"));
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			actionErrors = new ActionErrors();
			actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.system.validator"));
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			actionErrors = new ActionErrors();
			actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.system.validator"));
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			actionErrors = new ActionErrors();
			actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.system.validator"));
			e.printStackTrace();
		}
		
		return actionErrors;
	}

}
