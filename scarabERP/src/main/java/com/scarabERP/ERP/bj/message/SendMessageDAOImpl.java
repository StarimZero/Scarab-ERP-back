package com.scarabERP.ERP.bj.message;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SendMessageDAOImpl implements SendMessageDAO{
	@Autowired
	SqlSession session;
	String  namespace="com.example.mapper.VisitorMapper";
	
	
	@Override
	public void insertSendMessage(SendMessageVO vo) {
		session.insert(namespace + ".insertSendMessage", vo);
	}
	
	@Override
	public SendMessageVO readSendMessage(int send_message_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<SendMessageVO> listSendMessage(String send_message_sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SendMessageVO> listSendMessageState(int send_message_state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReceiveMessage(int receive_message_id) {
		// TODO Auto-generated method stub
		
	}

	
}
