package com.scarabERP.ERP.starim.sales;

import java.util.Date;


public class SalesVO {
	private String sales_id;
	private String sales_items_id;
	private int sales_qnt;
	private String sales_employee;
	private int sales_location;
	private Date sales_date;
	private int sales_warehouse;
	private int sales_price;
	public String getSales_id() {
		return sales_id;
	}
	public void setSales_id(String sales_id) {
		this.sales_id = sales_id;
	}
	public String getSales_items_id() {
		return sales_items_id;
	}
	public void setSales_items_id(String sales_items_id) {
		this.sales_items_id = sales_items_id;
	}
	public int getSales_qnt() {
		return sales_qnt;
	}
	public void setSales_qnt(int sales_qnt) {
		this.sales_qnt = sales_qnt;
	}
	public String getSales_employee() {
		return sales_employee;
	}
	public void setSales_employee(String sales_employee) {
		this.sales_employee = sales_employee;
	}
	public int getSales_location() {
		return sales_location;
	}
	public void setSales_location(int sales_location) {
		this.sales_location = sales_location;
	}
	public Date getSales_date() {
		return sales_date;
	}
	public void setSales_date(Date sales_date) {
		this.sales_date = sales_date;
	}
	public int getSales_warehouse() {
		return sales_warehouse;
	}
	public void setSales_warehouse(int sales_warehouse) {
		this.sales_warehouse = sales_warehouse;
	}
	public int getSales_price() {
		return sales_price;
	}
	public void setSales_price(int sales_price) {
		this.sales_price = sales_price;
	}
	@Override
	public String toString() {
		return "SalesVO [sales_id=" + sales_id + ", sales_items_id=" + sales_items_id + ", sales_qnt=" + sales_qnt
				+ ", sales_employee=" + sales_employee + ", sales_location=" + sales_location + ", sales_date="
				+ sales_date + ", sales_warehouse=" + sales_warehouse + ", sales_price=" + sales_price + "]";
	}

	
	
	
}
