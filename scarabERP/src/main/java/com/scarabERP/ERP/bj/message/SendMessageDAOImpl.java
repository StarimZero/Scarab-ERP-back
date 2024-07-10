package com.scarabERP.ERP.bj.message;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SendMessageDAOImpl implements SendMessageDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.bj.SendMessageMapper";
	
	
	@Override
	public void insert(MessageVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}
	

	@Override
	public void delete(int message_id) {
		session.delete(namespace + ".delete", message_id);
		
	}

	@Override
	public void updateSendState(MessageVO vo) {
		session.update(namespace + ".updateSendState", vo);
		
		  
	}

	@Override
	public List<MessageVO> list(String message_sender) {
		return session.selectList(namespace + ".list", message_sender);
		
	}


	@Override
	public MessageVO readSend(int message_id) {
		return session.selectOne(namespace + ".readSend", message_id);
	}

	
}
