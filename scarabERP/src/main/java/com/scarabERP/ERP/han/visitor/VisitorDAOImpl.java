package com.scarabERP.ERP.han.visitor;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VisitorDAOImpl implements VisitorDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.VisitorMapper";
	
	@Override
	public void insert(VisitorVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public VisitorVO read(String vid) {
		return session.selectOne(namespace + ".read", vid);
	}

	
}
