package com.scarabERP.ERP.han.visitor;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VisitorDAOImpl implements VisitorDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.han.VisitorMapper";
	
	@Override
	public void insert(VisitorVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public VisitorVO check(String visitor_id) {
		return session.selectOne(namespace + ".check", visitor_id);
	}

	@Override
	public VisitorVO login(String visitor_id) {
		return session.selectOne(namespace + ".login", visitor_id);
	}

	@Override
	public VisitorVO mypage(String visitor_id) {
		return session.selectOne(namespace + ".mypage", visitor_id);
	}

	@Override
	public void update(VisitorVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(String visitor_id) {
		session.delete(namespace + ".delete", visitor_id);
	}

	@Override
	public VisitorVO searchid(String visitor_email) {
		return session.selectOne(namespace + ".searchid", visitor_email);
	}





	
}
