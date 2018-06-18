package com.hotmail.ch.leon.web.business.logic;

import java.util.ArrayList;
import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;
import com.hotmail.ch.leon.web.business.bdto.FindBookBDTO;
import com.hotmail.ch.leon.web.business.bdto.FindBookResultSubBDTO;

public class FindBookLogic {
	
	public static FindBookBDTO init(FindBookBDTO inBdto) {
		
		FindBookBDTO outBdto = new FindBookBDTO();
		
		List<LabelValueBDTO> bookType_list = new ArrayList<LabelValueBDTO>();
		bookType_list.add(new LabelValueBDTO("计算机","0"));
		bookType_list.add(new LabelValueBDTO("电子电路","1"));
		
		outBdto.setBookType_list(bookType_list);
		
		return outBdto;
	}
	
	public static FindBookBDTO findBook(FindBookBDTO inBdto) {
		
		FindBookBDTO outBdto = inBdto;
		
		List<FindBookResultSubBDTO> findBookResultSubBdtoList = new ArrayList<FindBookResultSubBDTO>();
		FindBookResultSubBDTO subBdto = new FindBookResultSubBDTO();
		subBdto.setBookID("111");
		subBdto.setBookType("AA");
		subBdto.setBookName("Book 1");
		subBdto.setProduceYear("2018-02-03");
		findBookResultSubBdtoList.add(subBdto);
		subBdto = new FindBookResultSubBDTO();
		subBdto.setBookID("222");
		subBdto.setBookType("BB");
		subBdto.setBookName("Book 2");
		subBdto.setProduceYear("2018-02-04");
		findBookResultSubBdtoList.add(subBdto);
		subBdto = new FindBookResultSubBDTO();
		subBdto.setBookID("333");
		subBdto.setBookType("CCC");
		subBdto.setBookName("Book 3");
		subBdto.setProduceYear("2017-04-05");
		findBookResultSubBdtoList.add(subBdto);
		
		outBdto.setFindBookResultSubBDTOList(findBookResultSubBdtoList);
		return outBdto;
	}
	
	
	
}
