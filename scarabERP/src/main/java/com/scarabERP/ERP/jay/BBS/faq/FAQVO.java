package com.scarabERP.ERP.jay.BBS.faq;

public class FAQVO {
	private int faq_id;
	private String faq_contents;
	private String faq_title;
	private String faq_fegDate;
	private int faq_type;
	private int faq_viewcnt;
	private String faq_admin;
	private String member_info_id;
	public int getFaq_id() {
		return faq_id;
	}
	public void setFaq_id(int faq_id) {
		this.faq_id = faq_id;
	}
	public String getFaq_contents() {
		return faq_contents;
	}
	public void setFaq_contents(String faq_contents) {
		this.faq_contents = faq_contents;
	}
	public String getFaq_title() {
		return faq_title;
	}
	public void setFaq_title(String faq_title) {
		this.faq_title = faq_title;
	}
	public String getFaq_fegDate() {
		return faq_fegDate;
	}
	public void setFaq_fegDate(String faq_fegDate) {
		this.faq_fegDate = faq_fegDate;
	}
	public int getFaq_type() {
		return faq_type;
	}
	public void setFaq_type(int faq_type) {
		this.faq_type = faq_type;
	}
	public int getFaq_viewcnt() {
		return faq_viewcnt;
	}
	public void setFaq_viewcnt(int faq_viewcnt) {
		this.faq_viewcnt = faq_viewcnt;
	}
	public String getFaq_admin() {
		return faq_admin;
	}
	public void setFaq_admin(String faq_admin) {
		this.faq_admin = faq_admin;
	}
	public String getMember_info_id() {
		return member_info_id;
	}
	public void setMember_info_id(String member_info_id) {
		this.member_info_id = member_info_id;
	}
	@Override
	public String toString() {
		return "FAQVO [faq_id=" + faq_id + ", faq_contents=" + faq_contents + ", faq_title=" + faq_title
				+ ", faq_fegDate=" + faq_fegDate + ", faq_type=" + faq_type + ", faq_viewcnt=" + faq_viewcnt
				+ ", faq_admin=" + faq_admin + ", member_info_id=" + member_info_id + "]";
	}
	
	

}
