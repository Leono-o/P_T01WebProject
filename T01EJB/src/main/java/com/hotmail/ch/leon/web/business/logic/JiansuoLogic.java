package com.hotmail.ch.leon.web.business.logic;

import java.util.ArrayList;
import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoResultSubBDTO;

public class JiansuoLogic {
	
	public static JiansuoBDTO init(JiansuoBDTO inBdto) {
		
		JiansuoBDTO outBdto = new JiansuoBDTO();
		
		List<LabelValueBDTO> storeNm_list = new ArrayList<LabelValueBDTO>();
		storeNm_list.add(new LabelValueBDTO("北京","0"));
		storeNm_list.add(new LabelValueBDTO("上海","1"));
		
		outBdto.setStoreNm_list(storeNm_list);
		
		return outBdto;
	}
	
	public static JiansuoBDTO jiansuo(JiansuoBDTO inBdto) {
		
		JiansuoBDTO outBdto = inBdto;
		
		List<JiansuoResultSubBDTO> jiansuoResultSubBdtoList = new ArrayList<JiansuoResultSubBDTO>();
		JiansuoResultSubBDTO jiansuoResultSubBDTO = new JiansuoResultSubBDTO();
		jiansuoResultSubBDTO.setCheck(false);;
		jiansuoResultSubBDTO.setStoreCd("01");
		jiansuoResultSubBDTO.setStoreNm("上海");
		jiansuoResultSubBdtoList.add(jiansuoResultSubBDTO);
		jiansuoResultSubBDTO = new JiansuoResultSubBDTO();
		jiansuoResultSubBDTO.setCheck(false);;
		jiansuoResultSubBDTO.setStoreCd("02");
		jiansuoResultSubBDTO.setStoreNm("北京");
		jiansuoResultSubBdtoList.add(jiansuoResultSubBDTO);

		outBdto.setJiansuoResultSubBDTOList(jiansuoResultSubBdtoList);
		return outBdto;
	}
	
	
	
}
