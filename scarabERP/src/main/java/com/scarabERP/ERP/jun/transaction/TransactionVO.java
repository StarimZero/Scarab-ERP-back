package com.scarabERP.ERP.jun.transaction;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class TransactionVO {
	private int transaction_id;
	private String account_number;
	private int transaction_deposit;
	private int transaction_withdraw;
	private Date transaction_date;
	private String member_info_key;
	private int client_id;
	private int vendor_id;
	
	
	public TransactionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "TransactionVO [transaction_id=" + transaction_id + ", account_number=" + account_number
				+ ", transaction_deposit=" + transaction_deposit + ", transaction_withdraw=" + transaction_withdraw
				+ ", transaction_date=" + transaction_date + ", member_info_key=" + member_info_key + ", client_id="
				+ client_id + ", vendor_id=" + vendor_id + "]";
	}

	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getTransaction_deposit() {
		return transaction_deposit;
	}
	public void setTransaction_deposit(int transaction_deposit) {
		this.transaction_deposit = transaction_deposit;
	}
	public int getTransaction_withdraw() {
		return transaction_withdraw;
	}
	public void setTransaction_withdraw(int transaction_withdraw) {
		this.transaction_withdraw = transaction_withdraw;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getMember_info_key() {
		return member_info_key;
	}
	public void setMember_info_key(String member_info_key) {
		this.member_info_key = member_info_key;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
}
