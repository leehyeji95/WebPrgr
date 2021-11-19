package com.servlet;

import java.util.Date;

public class MemberDTO {
	String memId;
	String memPw;
	String name;
	String email;
	String addr;
	String mdn;
	Date joinDate;
	Date uDate;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String memId, String memPw, String name, String email, String mdn, String addr) {
		this.memId = memId;
		this.memPw = memPw;
		this.name = name;
		this.email = email;
		this.mdn = mdn;
		this.addr = addr;
	}
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMdn() {
		return mdn;
	}
	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
}

