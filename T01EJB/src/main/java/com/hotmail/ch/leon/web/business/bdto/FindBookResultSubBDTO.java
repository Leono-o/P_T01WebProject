package com.hotmail.ch.leon.web.business.bdto;

import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;


public class FindBookResultSubBDTO {

	private boolean select		 = false;						
	private String bookID	 = null;							
	private String bookType	 = null;							
	private String bookName	 = null;							
	private String produceYear	 = null;
	public boolean isSelect() {
		return select;
	}
	public void setSelect(boolean select) {
		this.select = select;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(String produceYear) {
		this.produceYear = produceYear;
	}


}
