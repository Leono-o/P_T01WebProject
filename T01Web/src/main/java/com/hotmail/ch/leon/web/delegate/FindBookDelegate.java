package com.hotmail.ch.leon.web.delegate;

import com.hotmail.ch.leon.web.business.bdto.FindBookBDTO;
import com.hotmail.ch.leon.web.business.facade.FindBookFacade;
import com.hotmail.ch.leon.web.delegate.bt.FindBookBDTOToFindBookForm;
import com.hotmail.ch.leon.web.delegate.bt.FindBookFormToFindBookBDTO;
import com.hotmail.ch.leon.web.form.FindBookForm;

public class FindBookDelegate {

	/**
	 * 检索
	 * 
	 * @param inForm
	 * @return
	 */
	public static FindBookForm doE01(FindBookForm inForm) {
		
		FindBookBDTO inBdto = FindBookFormToFindBookBDTO.convert(inForm);
		
		FindBookBDTO outBdto = FindBookFacade.findBook(inBdto);
		
		FindBookForm outForm = FindBookBDTOToFindBookForm.convert(outBdto);
		
		return outForm;
		
	}
	
	/**
	 * 清除
	 * 
	 * @param inForm
	 * @return
	 */
	public static FindBookForm doE02(FindBookForm inForm) {
		
		FindBookBDTO inBdto = FindBookFormToFindBookBDTO.convert(inForm);
		
		FindBookBDTO outBdto = FindBookFacade.clear(inBdto);
		
		FindBookForm outForm = FindBookBDTOToFindBookForm.convert(outBdto);
		
		return outForm;
		
	}
	
	/**
	 * 编辑
	 * 
	 * @param inForm
	 * @return
	 */
	public static FindBookForm doE03(FindBookForm inForm) {
		
		FindBookBDTO inBdto = FindBookFormToFindBookBDTO.convert(inForm);
		
		FindBookBDTO outBdto = FindBookFacade.update(inBdto);
		
		FindBookForm outForm = FindBookBDTOToFindBookForm.convert(outBdto);
		
		return outForm;
		
	}
}
