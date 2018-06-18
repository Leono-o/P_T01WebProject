package com.hotmail.ch.leon.web.delegate;

import com.hotmail.ch.leon.web.business.bdto.JiansuoBDTO;
import com.hotmail.ch.leon.web.business.facade.JiansuoFacade;
import com.hotmail.ch.leon.web.delegate.bt.JiansuoBDTOToJiansuoForm;
import com.hotmail.ch.leon.web.delegate.bt.JiansuoFormToJiansuoBDTO;
import com.hotmail.ch.leon.web.form.JiansuoForm;

public class JiansuoDelegate {

	/**
	 * 检索
	 * 
	 * @param inForm
	 * @return
	 */
	public static JiansuoForm doE01(JiansuoForm inForm) {
		
		JiansuoBDTO inBdto = JiansuoFormToJiansuoBDTO.convert(inForm);
		
		JiansuoBDTO outBdto = JiansuoFacade.jiansuo(inBdto);
		
		JiansuoForm outForm = JiansuoBDTOToJiansuoForm.convert(outBdto);
		
		
		return outForm;
		
	}
	
	/**
	 * 清除
	 * 
	 * @param inForm
	 * @return
	 */
	public static JiansuoForm doE02(JiansuoForm inForm) {
		
		JiansuoBDTO inBdto = JiansuoFormToJiansuoBDTO.convert(inForm);
		
		JiansuoBDTO outBdto = JiansuoFacade.clear(inBdto);
		
		JiansuoForm outForm = JiansuoBDTOToJiansuoForm.convert(outBdto);
		
		
		return outForm;
		
	}
	
	/**
	 * 登录
	 * 
	 * @param inForm
	 * @return
	 */
	public static JiansuoForm doE03(JiansuoForm inForm) {
		
		JiansuoBDTO inBdto = JiansuoFormToJiansuoBDTO.convert(inForm);
		
		JiansuoBDTO outBdto = JiansuoFacade.update(inBdto);
		
		JiansuoForm outForm = JiansuoBDTOToJiansuoForm.convert(outBdto);
		
		
		return outForm;
		
	}
}
