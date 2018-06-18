package com.hotmail.ch.leon.web.delegate.bt;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.util.LabelValueBean;

import com.hotmail.ch.leon.web.business.bdto.JiansuoBDTO;
import com.hotmail.ch.leon.web.business.bdto.JiansuoResultSubBDTO;
import com.hotmail.ch.leon.web.form.JiansuoForm;
import com.hotmail.ch.leon.web.util.PageUtil;
import com.hotmail.ch.leon.web.vo.JiansuoTbl01DetailVO;


public class AbstractJiansuoBDTOToJiansuoForm {
	public static JiansuoForm convert(JiansuoBDTO orgBdto) {
		
		JiansuoForm tarForm = new JiansuoForm();
		
		tarForm.setType(orgBdto.getType());
		tarForm.setStoreCd(orgBdto.getStoreCd());
		tarForm.setStoreNm(orgBdto.getStoreNm());
		tarForm.setStoreNm_list((List<LabelValueBean>)PageUtil.fromList(orgBdto.getStoreNm_list(),LabelValueBean.class) );
		
		List<JiansuoTbl01DetailVO> jiansuoTbl01DetaiVoList = new ArrayList<JiansuoTbl01DetailVO>();
		tarForm.setJiansuoTbl01DetaiVoList(jiansuoTbl01DetaiVoList);
		List<JiansuoResultSubBDTO> JiansuoResultSubBDTOList = orgBdto.getJiansuoResultSubBDTOList();
		if (JiansuoResultSubBDTOList != null) {
			for (JiansuoResultSubBDTO jiansuoResultSubBDTO : JiansuoResultSubBDTOList) {
				JiansuoTbl01DetailVO jiansuoTbl01DetailVO = new JiansuoTbl01DetailVO();
				jiansuoTbl01DetailVO.setCheck(jiansuoResultSubBDTO.isCheck());
				jiansuoTbl01DetailVO.setStoreCd(jiansuoResultSubBDTO.getStoreCd());
				jiansuoTbl01DetailVO.setStoreNm(jiansuoResultSubBDTO.getStoreNm());
				jiansuoTbl01DetaiVoList.add(jiansuoTbl01DetailVO);
			}
		}		
		
		return tarForm;
	}
}
