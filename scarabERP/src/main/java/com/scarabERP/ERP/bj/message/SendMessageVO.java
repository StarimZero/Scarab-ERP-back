package com.scarabERP.ERP.bj.message;

import java.util.Date;

public class SendMessageVO {
	private int send_message_id;
	private String send_message_sender;
	private String send_message_receiver;
	private String send_message_content;
	private Date send_message_senddate;
	private int send_message_state;
	
	public int getSend_message_id() {
		return send_message_id;
	}
	public void setSend_message_id(int send_message_id) {
		this.send_message_id = send_message_id;
	}
	public String getSend_message_sender() {
		return send_message_sender;
	}
	public void setSend_message_sender(String send_message_sender) {
		this.send_message_sender = send_message_sender;
	}
	public String getSend_message_receiver() {
		return send_message_receiver;
	}
	public void setSend_message_receiver(String send_message_receiver) {
		this.send_message_receiver = send_message_receiver;
	}
	public String getSend_message_content() {
		return send_message_content;
	}
	public void setSend_message_content(String send_message_content) {
		this.send_message_content = send_message_content;
	}
	public Date getSend_message_senddate() {
		return send_message_senddate;
	}
	public void setSend_message_senddate(Date send_message_senddate) {
		this.send_message_senddate = send_message_senddate;
	}
	public int getSend_message_state() {
		return send_message_state;
	}
	public void setSend_message_state(int send_message_state) {
		this.send_message_state = send_message_state;
	}
	@Override
	public String toString() {
		return "SendMessageVO [send_message_id=" + send_message_id + ", send_message_sender=" + send_message_sender
				+ ", send_message_receiver=" + send_message_receiver + ", send_message_content=" + send_message_content
				+ ", send_message_senddate=" + send_message_senddate + ", send_message_state=" + send_message_state
				+ "]";
	}
	
	
	
	
	
}
