package com.hotmail.ch.leon.web.vo;

import com.hotmail.ch.leon.web.form.JiansuoForm;
import com.hotmail.ch.leon.web.util.PageUtil;

public class JiansuoTbl01DetailVO extends T01AbstractVO {

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

	@Override
	public Object clone() throws CloneNotSupportedException {
		JiansuoTbl01DetailVO outForm = (JiansuoTbl01DetailVO)super.clone();
		outForm.setCheck(check);
		outForm.setStoreCd(storeCd);
		outForm.setStoreNm(storeNm);
		return outForm;
	}	
	
	
	
}
