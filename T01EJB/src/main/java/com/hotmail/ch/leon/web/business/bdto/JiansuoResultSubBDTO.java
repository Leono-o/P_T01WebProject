package com.hotmail.ch.leon.web.business.bdto;

import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;


public class JiansuoResultSubBDTO {

	private boolean check = false;
	
	private String storeCd = null;
	
	private String storeNm = null;

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
	
	public String getStoreCd() {
		return storeCd;
	}

	public void setStoreCd(String storeCd) {
		this.storeCd = storeCd;
	}

	public String getStoreNm() {
		return storeNm;
	}

	public void setStoreNm(String storeNm) {
		this.storeNm = storeNm;
	}	
		
	

}
