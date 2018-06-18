package com.hotmail.ch.leon.web.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoResultSubBDTO;
import com.hotmail.ch.leon.web.business.logic.JiansuoLogic;

public class JiansuoFacade {
	
	public static JiansuoBDTO initJiansuo(JiansuoBDTO inBdto) {
		
		
		JiansuoBDTO outBdto = JiansuoLogic.init(inBdto);

		return outBdto;
	}
	
	public static JiansuoBDTO jiansuo(JiansuoBDTO inBdto) {
		
		JiansuoBDTO outBdto = JiansuoLogic.jiansuo(inBdto);

		return outBdto;
		
	}
	
	public static JiansuoBDTO clear(JiansuoBDTO inBdto) {
		
		
		JiansuoBDTO outBdto = JiansuoLogic.init(inBdto);

		return outBdto;
	}
	
	public static JiansuoBDTO update(JiansuoBDTO inBdto) {
		
		
		JiansuoBDTO outBdto = inBdto;

		return outBdto;
	}
	
	
}
