package com.scarabERP.ERP.bj.message;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;



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
	public void updateReceiveState(int message_id) {
		session.update(namespace + ".updateReceiveState", message_id);
		
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
	public List<HashMap<String,Object>> deleteList(QueryVO vo, String message_receiver) {
		HashMap<String, Object> map=new HashMap<>();
		map.put("message_receiver", message_receiver);
		map.put("query", vo);
		return session.selectList(namespace + ".deleteList", map);
	}



	@Override
	public void updateReadDate(MessageVO vo) {
		
		session.update(namespace + ".updateReadDate", vo);
	}


	@Override
	public MessageVO readReceive(int message_id) {
		return session.selectOne(namespace + ".readReceive", message_id);
	}



	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}


	@Override
	public void resetState(int message_id) {
		session.update(namespace + ".resetState", message_id);
	}


	




}
