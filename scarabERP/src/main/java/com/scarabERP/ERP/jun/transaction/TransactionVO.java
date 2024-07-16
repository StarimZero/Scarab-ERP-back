package com.scarabERP.ERP.jun.transaction;

import java.util.Date;

import com.scarabERP.ERP.jun.account.AccountVO;
import com.scarabERP.ERP.jun.member.MemberVO;
import com.scarabERP.ERP.starim.client.ClientVO;
import com.scarabERP.ERP.starim.vendor.VendorVO;

public class TransactionVO {
	private int transaction_id;
	private int transaction_deposit;
	private int transaction_withdraw;
	private Date transaction_date;
	
	private AccountVO accountVO;
	private MemberVO memberVO;
	private ClientVO clientVO;
	private VendorVO vendorVO;
	
	public TransactionVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionVO(AccountVO accountVO, MemberVO memberVO, ClientVO clientVO, VendorVO vendorVO) {
		super();
		this.accountVO = accountVO;
		this.memberVO = memberVO;
		this.clientVO = clientVO;
		this.vendorVO = vendorVO;
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
        return accountVO.getAccount_number();
    }
    public void setAccount_number(String account_number) {
        accountVO.setAccount_number(account_number);
    }
    public String getMember_info_key() {
        return memberVO.getMember_info_key();
    }
    public void setMember_info_key(String member_info_key) {
        memberVO.setMember_info_key(member_info_key);
    }
    public int getClient_id() {
        return clientVO.getClient_id();
    }
    public void setClient_id(int client_id) {
        clientVO.setClient_id(client_id);
    }
    public int getVendor_id() {
        return vendorVO.getVendor_id();
    }
    public void setVendor_id(int vendor_id) {
        vendorVO.setVendor_id(vendor_id);
    }
	
	
}
