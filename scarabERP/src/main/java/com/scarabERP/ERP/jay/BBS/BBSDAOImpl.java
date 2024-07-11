package com.scarabERP.ERP.jay.BBS;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BBSDAOImpl implements BBSDAO{
	
	SqlSession session;
	String namespace="com.scarabERP.ERP.mapper.BBSMapper";

	@Override
	public void insert(BBSVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BBSVO read(int bbs_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BBSVO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BBSVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bbs_id) {
		// TODO Auto-generated method stub
		
	}

}
