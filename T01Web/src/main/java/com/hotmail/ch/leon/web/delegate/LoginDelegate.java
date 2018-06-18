package com.hotmail.ch.leon.web.delegate;

import com.hotmail.ch.leon.web.business.bdto.FindBookBDTO;
import com.hotmail.ch.leon.web.business.facade.FindBookFacade;
import com.hotmail.ch.leon.web.delegate.bt.FindBookBDTOToFindBookForm;
import com.hotmail.ch.leon.web.form.FindBookForm;
import com.hotmail.ch.leon.web.form.LoginForm;

public class LoginDelegate {

	public static FindBookForm doE01(LoginForm inForm) {
		
		FindBookBDTO outBdto = FindBookFacade.initFindBook(null);
		
		FindBookForm outForm = FindBookBDTOToFindBookForm.convert(outBdto);
		

		return outForm;
		
	}
}
