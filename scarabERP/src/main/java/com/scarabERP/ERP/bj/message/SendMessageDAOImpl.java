package com.scarabERP.ERP.bj.message;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SendMessageDAOImpl implements SendMessageDAO{
	@Autowired
	SqlSession session;
	String namespace="com.scarabERP.ERP.bj.message.SendMessageVO";
	
	
	@Override
	public void insert(SendMessageVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}
	

	@Override
	public void delete(int receive_message_id) {
		session.delete(namespace + ".delete", receive_message_id);
		
	}

	@Override
	public void updateSendMessageState(SendMessageVO vo) {
		session.update(namespace + ".updateSendMessageState", vo);
		
		  
	}

	@Override
	public List<SendMessageVO> list(String send_message_sender) {
		return session.selectList(namespace + ".list", send_message_sender);
		
	}

	
}
