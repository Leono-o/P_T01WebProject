package com.hotmail.ch.leon.web.business.apl.bdto;

public class LabelValueBDTO {
	
	private String label = null;
	private String value = null;
	
	public LabelValueBDTO(String label, String value) {
		this.label = label;
		this.value = value;
		
		
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}



}
