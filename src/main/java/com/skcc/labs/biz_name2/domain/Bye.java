package com.skcc.labs.biz_name2.domain;

public class Bye {
	
	private String locale;

	private String msg;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Hello [locale=" + locale + ", msg=" + msg + "]";
	}

}
