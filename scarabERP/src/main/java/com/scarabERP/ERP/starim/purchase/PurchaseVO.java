package com.scarabERP.ERP.starim.purchase;

import java.util.Date;

public class PurchaseVO {
	
	private String purchase_id;
	private String purchase_items_id;
	private int purchase_qnt;
	private String purchase_employee;
	private int purchase_location;
	private Date purchase_date;
	private int purchase_warehouse;
	private int purchase_price;
	public String getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}
	public String getPurchase_items_id() {
		return purchase_items_id;
	}
	public void setPurchase_items_id(String purchase_items_id) {
		this.purchase_items_id = purchase_items_id;
	}
	public int getPurchase_qnt() {
		return purchase_qnt;
	}
	public void setPurchase_qnt(int purchase_qnt) {
		this.purchase_qnt = purchase_qnt;
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
	public int getPurchase_warehouse() {
		return purchase_warehouse;
	}
	public void setPurchase_warehouse(int purchase_warehouse) {
		this.purchase_warehouse = purchase_warehouse;
	}
	public int getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}
	@Override
	public String toString() {
		return "PurchaseVO [purchase_id=" + purchase_id + ", purchase_items_id=" + purchase_items_id + ", purchase_qnt="
				+ purchase_qnt + ", purchase_employee=" + purchase_employee + ", purchase_location=" + purchase_location
				+ ", purchase_date=" + purchase_date + ", purchase_warehouse=" + purchase_warehouse
				+ ", purchase_price=" + purchase_price + "]";
	}
	
	

}
