package com.hotmail.ch.leon.web.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.util.LabelValueBean;

import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;
import com.hotmail.ch.leon.web.vo.T01AbstractVO;

public class PageUtil {
	
	public static List<LabelValueBean> copyList(List<LabelValueBean> listOrg) {
		if (listOrg == null) {
			return null;
		}
		
		List<LabelValueBean> listTar = new ArrayList<LabelValueBean>();
		for (LabelValueBean lvb : listOrg) {
			LabelValueBean lvbNew = new LabelValueBean();
			lvbNew.setLabel(lvb.getLabel());
			lvbNew.setValue(lvb.getValue());
			listTar.add(lvbNew);
		}
		
		return listTar;
	}
	
	public static <T extends T01AbstractVO> List<T> copyList2(List<T> listOrg) throws CloneNotSupportedException {
		if (listOrg == null) {
			return null;
		}

		List<T> result = new ArrayList<T>();
		for (T org : listOrg) {
			T tar = (T)org.clone();
			result.add(tar);
		}
		
		return result;
	}
	
	public static List<?> fromList(List<?> listOrg, Class cls) {
		if (listOrg == null) {
			return null;
		}
		
		List<?> result = null;
		if (cls.isAssignableFrom(LabelValueBDTO.class)) {
			// LabelValueBean --> LabelValueBDTO
			List<LabelValueBDTO> listTar = new ArrayList<LabelValueBDTO>();
			for (LabelValueBean lvbOrg : (List<LabelValueBean>)listOrg) {
				LabelValueBDTO lvb = new LabelValueBDTO(lvbOrg.getLabel(), lvbOrg.getValue());
				listTar.add(lvb);
			}
			result = listTar;
		}else if (cls.isAssignableFrom(LabelValueBean.class)) {
			// LabelValueBean --> LabelValueBDTO
			List<LabelValueBean> listTar = new ArrayList<LabelValueBean>();
			for (LabelValueBDTO lvbOrg : (List<LabelValueBDTO>)listOrg) {
				LabelValueBean lvb = new LabelValueBean ();
				lvb.setLabel(lvbOrg.getLabel());
				lvb.setValue(lvbOrg.getValue());
				listTar.add(lvb);
			}
			result = listTar;
		}
		
		
		return result;
	}
	
}
