package com.hotmail.ch.leon.web.delegate.bt;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.util.LabelValueBean;

import com.hotmail.ch.leon.web.business.bdto.FindBookBDTO;
import com.hotmail.ch.leon.web.business.bdto.FindBookResultSubBDTO;
import com.hotmail.ch.leon.web.form.FindBookForm;
import com.hotmail.ch.leon.web.util.PageUtil;
import com.hotmail.ch.leon.web.vo.FindBookTbl01DetailVO;


public class AbstractFindBookBDTOToFindBookForm {
	public static FindBookForm convert(FindBookBDTO orgBdto) {
		
		FindBookForm tarForm = new FindBookForm();
		
		tarForm.setSearchType(orgBdto.getSearchType());
		tarForm.setBookType(orgBdto.getBookType());
		tarForm.setBookType_list((List<LabelValueBean>)PageUtil.fromList(orgBdto.getBookType_list(),LabelValueBean.class) );
		tarForm.setProduceYear(orgBdto.getProduceYear());
		tarForm.setBookName(orgBdto.getBookName());

		List<FindBookTbl01DetailVO> findBookTbl01DetaiVOList = new ArrayList<FindBookTbl01DetailVO>();
		tarForm.setFindBookTbl01DetailVOList(findBookTbl01DetaiVOList);
		List<FindBookResultSubBDTO> findBookResultSubBDTOList = orgBdto.getFindBookResultSubBDTOList();
		if (findBookResultSubBDTOList != null) {
			for (FindBookResultSubBDTO findBookResultSubBDTO : findBookResultSubBDTOList) {
				FindBookTbl01DetailVO findBookTbl01DetailVO = new FindBookTbl01DetailVO();
				findBookTbl01DetailVO.setSelect(findBookResultSubBDTO.isSelect());
				findBookTbl01DetailVO.setBookID(findBookResultSubBDTO.getBookID());
				findBookTbl01DetailVO.setBookType(findBookResultSubBDTO.getBookType());
				findBookTbl01DetailVO.setBookName(findBookResultSubBDTO.getBookName());
				findBookTbl01DetailVO.setProduceYear(findBookResultSubBDTO.getProduceYear());
				findBookTbl01DetaiVOList.add(findBookTbl01DetailVO);
			}
		}		
		
		return tarForm;
	}
}
