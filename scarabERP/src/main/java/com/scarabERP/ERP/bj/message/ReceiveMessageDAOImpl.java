package com.scarabERP.ERP.bj.message;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ReceiveMessageDAOImpl implements ReceiveMessageDAO{

	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.bj.ReceiveMessageMapper";
	
	@Override
	public void insert(MessageVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}


	@Override
	public void updateReceiveState(MessageVO vo) {
		session.update(namespace + ".updateReceiveState", vo);
		
	}

	@Override
	public void delete(int message_id) {
		session.delete(namespace + ".delete", message_id);
		
	}


	@Override
	public List<MessageVO> list(String message_receiver) {
		return session.selectList(namespace + ".list", message_receiver);
	}



	@Override
	public void updateReadDate(MessageVO vo) {
		
		session.update(namespace + ".updateReadDate", vo);
	}


	@Override
	public MessageVO readReceive(int message_id) {
		return session.selectOne(namespace + ".readReceive", message_id);
	}




}
