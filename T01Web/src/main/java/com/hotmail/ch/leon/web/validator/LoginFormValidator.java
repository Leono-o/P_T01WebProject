package com.hotmail.ch.leon.web.validator;

import java.util.List;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.util.LabelValueBean;
import com.hotmail.ch.leon.web.common.util.DateUtil; 
import com.hotmail.ch.leon.web.common.util.StringUtil;
import com.hotmail.ch.leon.web.form.T01AbstractForm; 
import com.hotmail.ch.leon.web.form.LoginForm;

public class LoginFormValidator {

    public static ActionErrors checkE00 (T01AbstractForm form) {

        ActionErrors actionErrors = new ActionErrors();
        LoginForm inForm = (LoginForm)form;

        String name = null;
        String attrib = null;
        String value = null;
        List<LabelValueBean>listPullDown = null;

        return actionErrors;
    }

    public static ActionErrors checkE01 (T01AbstractForm form) {

        ActionErrors actionErrors = new ActionErrors();
        LoginForm inForm = (LoginForm)form;

        String name = null;
        String attrib = null;
        String value = null;
        List<LabelValueBean>listPullDown = null;

        // 【用户名】
        value = inForm.getUserName();
        name = "用户名";
        // 必须check
        if (StringUtil.isEmpty(value)) {
            actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.noInput", name));
        }

        // 【密码】
        value = inForm.getPswd();
        name = "密码";
        // 必须check
        if (StringUtil.isEmpty(value)) {
            actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.noInput", name));
        }
        // 最小位数check
        if (!StringUtil.isEmpty(value)) {
            if (value.length() < 8) {
                actionErrors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.lengthMin", new String[]{name, "8"}));
            }
        }

        return actionErrors;
    }

}
