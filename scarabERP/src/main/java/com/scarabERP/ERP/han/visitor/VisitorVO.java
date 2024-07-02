package com.scarabERP.ERP.han.visitor;

import java.util.Date;

public class VisitorVO {
	private String vid;
	private String vpass;
	private String vname;
	private Date vbirthday;
	
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVpass() {
		return vpass;
	}
	public void setVpass(String vpass) {
		this.vpass = vpass;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Date getVbirthday() {
		return vbirthday;
	}
	public void setVbirthday(Date vbirthday) {
		this.vbirthday = vbirthday;
	}
	
	@Override
	public String toString() {
		return "VisitorVO [vid=" + vid + ", vpass=" + vpass + ", vname=" + vname + ", vbirthday=" + vbirthday + "]";
	}
}
