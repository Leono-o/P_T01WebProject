package com.hotmail.ch.leon.web.delegate.bt;

import java.util.ArrayList;
import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;
import com.hotmail.ch.leon.web.business.bdto.FindBookBDTO;
import com.hotmail.ch.leon.web.business.bdto.FindBookResultSubBDTO;
import com.hotmail.ch.leon.web.form.FindBookForm;
import com.hotmail.ch.leon.web.util.PageUtil;
import com.hotmail.ch.leon.web.vo.FindBookTbl01DetailVO;


public class AbstractFindBookFormToFindBookBDTO {
	public static FindBookBDTO convert(FindBookForm orgForm) {
		
		FindBookBDTO tarBDTO = new FindBookBDTO();
		
		tarBDTO.setSearchType(orgForm.getSearchType());
		tarBDTO.setBookType(orgForm.getBookType());
		tarBDTO.setBookType_list((List<LabelValueBDTO>)PageUtil.fromList(orgForm.getBookType_list(),LabelValueBDTO.class) );
		tarBDTO.setProduceYear(orgForm.getProduceYear());
		tarBDTO.setBookName(orgForm.getBookName());

			
		List<FindBookResultSubBDTO> findBookResultSubBDTOList = new ArrayList<FindBookResultSubBDTO>();
		tarBDTO.setFindBookResultSubBDTOList(findBookResultSubBDTOList);
		List<FindBookTbl01DetailVO> findBookTbl01DetaiVOList = orgForm.getFindBookTbl01DetailVOList();
		if (findBookTbl01DetaiVOList != null) {
			for (FindBookTbl01DetailVO findBookTbl01DetaiVO : findBookTbl01DetaiVOList) {
				FindBookResultSubBDTO findBookResultSubBDTO = new FindBookResultSubBDTO();
				findBookResultSubBDTO.setSelect(findBookTbl01DetaiVO.isSelect());
				findBookResultSubBDTO.setBookID(findBookTbl01DetaiVO.getBookID());
				findBookResultSubBDTO.setBookType(findBookTbl01DetaiVO.getBookType());
				findBookResultSubBDTO.setBookName(findBookTbl01DetaiVO.getBookName());
				findBookResultSubBDTO.setProduceYear(findBookTbl01DetaiVO.getProduceYear());
				findBookResultSubBDTOList.add(findBookResultSubBDTO);
			}
		}		
		
		return tarBDTO;
	}
}
