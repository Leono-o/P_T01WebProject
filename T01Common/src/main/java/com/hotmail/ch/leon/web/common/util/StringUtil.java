package com.hotmail.ch.leon.web.common.util;

public class StringUtil {
	
	public static boolean isEmpty(String string) {
		if (string == null || "".equals(string)) {
			return true;
		}
		return false;
	}
	
	public static boolean isBlank(String string) {
		if (string == null || "".equals(string)) {
			return true;
		} else if ("".equals(string.trim())) {
			return true;			
		}
		return false;
	}
	
}
