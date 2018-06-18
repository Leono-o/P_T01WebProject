package com.hotmail.ch.leon.web.form;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;

import com.hotmail.ch.leon.web.util.PageUtil;
import com.hotmail.ch.leon.web.vo.JiansuoTbl01DetailVO;

public class JiansuoForm extends T01AbstractForm {
	
	private static final long serialVersionUID = 1L;

	private String type = null;
	
	private String storeCd = null;
	
	private String storeNm = null;
	
	private List<LabelValueBean> storeNm_list = null;
	
	private List<JiansuoTbl01DetailVO> jiansuoTbl01DetaiVoList = null;

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

	public List<LabelValueBean> getStoreNm_list() {
		return storeNm_list;
	}

	public void setStoreNm_list(List<LabelValueBean> storeNm_list) {
		this.storeNm_list = storeNm_list;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		JiansuoForm outForm = (JiansuoForm)super.clone();
		outForm.setStoreNm_list(PageUtil.copyList(storeNm_list));
		outForm.setJiansuoTbl01DetaiVoList(PageUtil.copyList2(jiansuoTbl01DetaiVoList));
		return outForm;
	}

	public List<JiansuoTbl01DetailVO> getJiansuoTbl01DetaiVoList() {
		return jiansuoTbl01DetaiVoList;
	}

	public void setJiansuoTbl01DetaiVoList(List<JiansuoTbl01DetailVO> jiansuoTbl01DetaiVoList) {
		this.jiansuoTbl01DetaiVoList = jiansuoTbl01DetaiVoList;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		if (jiansuoTbl01DetaiVoList != null) {
			for (JiansuoTbl01DetailVO elm : jiansuoTbl01DetaiVoList) {
				elm.setCheck(false);
			}
		}
		super.reset(mapping, request);
	}

	@Override
	public String getClassName() {
		return "JiansuoForm";
	}
}
