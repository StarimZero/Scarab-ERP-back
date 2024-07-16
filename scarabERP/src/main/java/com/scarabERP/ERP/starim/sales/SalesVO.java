package com.scarabERP.ERP.starim.sales;




public class SalesVO {
	
	private String sales_id;
	private String sales_employee;
	private String sales_location;
	private String sales_date;

	
	
	

	public String getSales_id() {
		return sales_id;
	}
	public void setSales_id(String sales_id) {
		this.sales_id = sales_id;
	}
	public String getSales_employee() {
		return sales_employee;
	}
	public void setSales_employee(String sales_employee) {
		this.sales_employee = sales_employee;
	}
	public String getSales_location() {
		return sales_location;
	}
	public void setSales_location(String sales_location) {
		this.sales_location = sales_location;
	}
	public String getSales_date() {
		return sales_date;
	}
	public void setSales_date(String sales_date) {
		this.sales_date = sales_date;
	}
	@Override
	public String toString() {
		return "SalesVO [sales_id=" + sales_id + ", sales_employee=" + sales_employee + ", sales_location="
				+ sales_location + ", sales_date=" + sales_date + "]";
	}

	

	
	
	
}
