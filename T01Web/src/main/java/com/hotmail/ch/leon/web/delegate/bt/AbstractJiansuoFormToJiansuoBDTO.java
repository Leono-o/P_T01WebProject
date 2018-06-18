package com.hotmail.ch.leon.web.delegate.bt;

import java.util.ArrayList;
import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoResultSubBDTO;
import com.hotmail.ch.leon.web.form.JiansuoForm;
import com.hotmail.ch.leon.web.util.PageUtil;
import com.hotmail.ch.leon.web.vo.JiansuoTbl01DetailVO;


public class AbstractJiansuoFormToJiansuoBDTO {
	public static JiansuoBDTO convert(JiansuoForm orgForm) {
		
		JiansuoBDTO tarBdto = new JiansuoBDTO();
		tarBdto.setType(orgForm.getType());
		tarBdto.setStoreCd(orgForm.getStoreCd());
		tarBdto.setStoreNm(orgForm.getStoreNm());
		tarBdto.setStoreNm_list((List<LabelValueBDTO>)PageUtil.fromList(orgForm.getStoreNm_list(),LabelValueBDTO.class));
		
		List<JiansuoResultSubBDTO> jiansuoResultSubBDTOList = new ArrayList<JiansuoResultSubBDTO>();
		tarBdto.setJiansuoResultSubBDTOList(jiansuoResultSubBDTOList);
		List<JiansuoTbl01DetailVO> jiansuoTbl01DetailVOList = orgForm.getJiansuoTbl01DetaiVoList();
		if (jiansuoTbl01DetailVOList != null) {
			for (JiansuoTbl01DetailVO jiansuoTbl01DetailVO : jiansuoTbl01DetailVOList) {
				JiansuoResultSubBDTO jiansuoResultSubBDTO = new JiansuoResultSubBDTO();
				jiansuoResultSubBDTO.setCheck(jiansuoTbl01DetailVO.isCheck());
				jiansuoResultSubBDTO.setStoreCd(jiansuoTbl01DetailVO.getStoreCd());
				jiansuoResultSubBDTO.setStoreNm(jiansuoTbl01DetailVO.getStoreNm());
				jiansuoResultSubBDTOList.add(jiansuoResultSubBDTO);
			}
		}
		
		return tarBdto;
	}
}
