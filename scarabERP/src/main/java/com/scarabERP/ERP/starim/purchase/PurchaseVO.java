package com.scarabERP.ERP.starim.purchase;

import java.util.Date;

public class PurchaseVO {
	
	private String purchase_id;
	private String purchase_employee;
	private int purchase_location;
	private Date purchase_date;
	public String getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}
	public String getPurchase_employee() {
		return purchase_employee;
	}
	public void setPurchase_employee(String purchase_employee) {
		this.purchase_employee = purchase_employee;
	}
	public int getPurchase_location() {
		return purchase_location;
	}
	public void setPurchase_location(int purchase_location) {
		this.purchase_location = purchase_location;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	@Override
	public String toString() {
		return "PurchaseVO [purchase_id=" + purchase_id + ", purchase_employee=" + purchase_employee
				+ ", purchase_location=" + purchase_location + ", purchase_date=" + purchase_date + "]";
	}
	
	
	
	
	

}
