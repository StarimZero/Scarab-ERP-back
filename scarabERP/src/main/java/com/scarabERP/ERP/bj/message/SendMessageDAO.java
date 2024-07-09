package com.scarabERP.ERP.bj.message;

import java.util.List;

public interface SendMessageDAO {
	public void insert(MessageVO vo);
	public List<MessageVO> list(String message_sender);
	public void updateSendState(MessageVO vo);
	public void delete(int message_id);


}
