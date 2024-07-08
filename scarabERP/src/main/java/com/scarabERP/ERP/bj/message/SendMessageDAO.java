package com.scarabERP.ERP.bj.message;

import java.util.List;

public interface SendMessageDAO {
	public void insert(SendMessageVO vo);
	public List<SendMessageVO> list(String send_message_sender);
	public void updateSendMessageState(SendMessageVO vo);
	public void delete(int receive_message_id);


}
