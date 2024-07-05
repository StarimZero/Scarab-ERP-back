package com.scarabERP.ERP.bj.message;

import java.util.List;

public interface ReceiveMessageDAO {
	public void inserReceiveMessage(ReceiveMessageVO vo);
	public ReceiveMessageVO readReceiveMessage(int receive_message_id);
	public List<ReceiveMessageVO> listReceiveMessage(String receive_message_receiver);
	public List<ReceiveMessageVO> listReceiveMessageState(int receive_message_state);
	public void deleteSendMessage(int send_message_id);
}
