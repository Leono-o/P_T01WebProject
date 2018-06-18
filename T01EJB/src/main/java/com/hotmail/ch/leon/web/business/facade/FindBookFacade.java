package com.hotmail.ch.leon.web.business.facade;

import com.hotmail.ch.leon.web.business.bdto.FindBookBDTO;
import com.hotmail.ch.leon.web.business.logic.FindBookLogic;

public class FindBookFacade {
	
	public static FindBookBDTO initFindBook(FindBookBDTO inBdto) {
		
		
		FindBookBDTO outBdto = FindBookLogic.init(inBdto);

		return outBdto;
	}
	
	public static FindBookBDTO findBook(FindBookBDTO inBdto) {
		
		FindBookBDTO outBdto = FindBookLogic.findBook(inBdto);

		return outBdto;
		
	}
	
	public static FindBookBDTO clear(FindBookBDTO inBdto) {
		
		
		FindBookBDTO outBdto = FindBookLogic.init(inBdto);
		return outBdto;
	}
	
	public static FindBookBDTO update(FindBookBDTO inBdto) {
		
		
		//FindBookBDTO outBdto = inBdto;
		FindBookBDTO outBdto = inBdto;
		return outBdto;
	}
	
	
}
