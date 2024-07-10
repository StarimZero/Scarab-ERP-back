package com.scarabERP.ERP.bj.message;


import java.util.List;



public interface ReceiveMessageDAO {
	public void insert(MessageVO vo);
	public List<MessageVO> list(String message_receiver);
	public void updateReceiveState(MessageVO vo);
	public void delete(int message_id);
	public void updateReadDate(MessageVO vo);
	public MessageVO readReceive(int message_id);
}

