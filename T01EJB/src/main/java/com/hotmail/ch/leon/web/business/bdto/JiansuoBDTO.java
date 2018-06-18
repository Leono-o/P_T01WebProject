package com.hotmail.ch.leon.web.business.bdto;

import java.util.List;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;


public class JiansuoBDTO {

	private String type = null;
	
	private String storeCd = null;
	
	private String storeNm = null;
	
	private List<LabelValueBDTO> storeNm_list = null;
	
	private List<JiansuoResultSubBDTO> jiansuoResultSubBDTOList = null;

	public List<LabelValueBDTO> getStoreNm_list() {
		return storeNm_list;
	}

	public void setStoreNm_list(List<LabelValueBDTO> storeNm_list) {
		this.storeNm_list = storeNm_list;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public List<JiansuoResultSubBDTO> getJiansuoResultSubBDTOList() {
		return jiansuoResultSubBDTOList;
	}

	public void setJiansuoResultSubBDTOList(List<JiansuoResultSubBDTO> jiansuoResultSubBDTOList) {
		this.jiansuoResultSubBDTOList = jiansuoResultSubBDTOList;
	}
	
	

}
