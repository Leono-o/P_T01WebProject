package com.hotmail.ch.leon.web.business.bdto;

import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;


public class FindBookBDTO {

	private String searchType	 = null;							
	private String bookType		 = null;	
	private List<LabelValueBDTO> bookType_list = null;
	private String produceYear	 = null;							
	private String bookName		 = null;
	
	private List<FindBookResultSubBDTO> findBookResultSubBDTOList = null;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public List<LabelValueBDTO> getBookType_list() {
		return bookType_list;
	}

	public void setBookType_list(List<LabelValueBDTO> bookType_list) {
		this.bookType_list = bookType_list;
	}

	public String getProduceYear() {
		return produceYear;
	}

	public void setProduceYear(String produceYear) {
		this.produceYear = produceYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<FindBookResultSubBDTO> getFindBookResultSubBDTOList() {
		return findBookResultSubBDTOList;
	}

	public void setFindBookResultSubBDTOList(List<FindBookResultSubBDTO> findBookResultSubBDTOList) {
		this.findBookResultSubBDTOList = findBookResultSubBDTOList;
	}

	
	

}
