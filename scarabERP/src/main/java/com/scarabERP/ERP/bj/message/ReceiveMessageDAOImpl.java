package com.scarabERP.ERP.bj.message;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ReceiveMessageDAOImpl implements ReceiveMessageDAO{

	@Autowired
	SqlSession session;
	String namespace="com.scarabERP.ERP.bj.message.ReceiveMessageVO";
	
	@Override
	public void insert(ReceiveMessageVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}


	@Override
	public void updateReceiveMessageState(ReceiveMessageVO vo) {
		session.update(namespace + ".updateReceiveMessageState", vo);
		
	}

	@Override
	public void delete(int send_message_id) {
		session.delete(namespace + ".delete", send_message_id);
		
	}

	@Override
	public List<ReceiveMessageVO> list(String receive_message_receiver) {
		return session.selectList(namespace + ".list", receive_message_receiver);
	}


	@Override
	public void updateReadDate(int send_message_id) {
		
		session.update(namespace + ".updateReadDate", send_message_id);
	}

}
