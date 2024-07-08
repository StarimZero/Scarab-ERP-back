package com.scarabERP.ERP.bj.message;

import java.util.Date;

public class ReceiveMessageVO {
	private int receive_message_id;
	private String receive_message_sender;
	private String receive_message_receiver;
	private String receive_message_content;
	private Date receive_message_senddate;
	private Date receive_message_readdate;
	private int receive_message_state;
	
	public int getReceive_message_id() {
		return receive_message_id;
	}
	public void setReceive_message_id(int receive_message_id) {
		this.receive_message_id = receive_message_id;
	}
	public String getReceive_message_sender() {
		return receive_message_sender;
	}
	public void setReceive_message_sender(String receive_message_sender) {
		this.receive_message_sender = receive_message_sender;
	}
	public String getReceive_message_receiver() {
		return receive_message_receiver;
	}
	public void setReceive_message_receiver(String receive_message_receiver) {
		this.receive_message_receiver = receive_message_receiver;
	}
	public String getReceive_message_content() {
		return receive_message_content;
	}
	public void setReceive_message_content(String receive_message_content) {
		this.receive_message_content = receive_message_content;
	}
	public Date getReceive_message_senddate() {
		return receive_message_senddate;
	}
	public void setReceive_message_senddate(Date receive_message_senddate) {
		this.receive_message_senddate = receive_message_senddate;
	}
	public Date getReceive_message_readdate() {
		return receive_message_readdate;
	}
	public void setReceive_message_readdate(Date receive_message_readdate) {
		this.receive_message_readdate = receive_message_readdate;
	}
	public int getReceive_message_state() {
		return receive_message_state;
	}
	public void setReceive_message_state(int receive_message_state) {
		this.receive_message_state = receive_message_state;
	}
	@Override
	public String toString() {
		return "ReceiveMessageVO [receive_message_id=" + receive_message_id + ", receive_message_sender="
				+ receive_message_sender + ", receive_message_receiver=" + receive_message_receiver
				+ ", receive_message_content=" + receive_message_content + ", receive_message_senddate="
				+ receive_message_senddate + ", receive_message_readdate=" + receive_message_readdate
				+ ", receive_message_state=" + receive_message_state + "]";
	}
	
	
}
