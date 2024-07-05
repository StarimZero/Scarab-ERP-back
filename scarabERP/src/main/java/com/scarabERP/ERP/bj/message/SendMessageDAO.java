package com.scarabERP.ERP.bj.message;

import java.util.List;

public interface SendMessageDAO {
	public void insertSendMessage(SendMessageVO vo);
	public SendMessageVO readSendMessage(int send_message_id);
	public List<SendMessageVO> listSendMessage(String send_message_sender);
	public List<SendMessageVO> listSendMessageState(int send_message_state);
	public void deleteReceiveMessage(int receive_message_id);

}
