package com.scarabERP.ERP.bj.message;

import java.util.List;


public interface ReceiveMessageDAO {
	public void insert(ReceiveMessageVO vo);
	public List<ReceiveMessageVO> list(String receive_message_receiver);
	public void updateReceiveMessageState(ReceiveMessageVO vo);
	public void delete(int send_message_id);
	public void updateReadDate(int send_message_id);
}
