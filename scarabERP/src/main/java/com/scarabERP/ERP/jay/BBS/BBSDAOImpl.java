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
		session.insert(namespace + ".insertBBS", vo);
		
	}

	@Override
	public BBSVO read(int bbs_id) {
		return session.selectOne(namespace + ".BBSread", bbs_id);
	}

	@Override
	public List<BBSVO> list() {
		
		return session.selectList(namespace + ".BBSlist");
	}

	@Override
	public void update(BBSVO vo) {
		session.update(namespace + ".BBSupdate", vo);
		
	}

	@Override
	public void delete(int bbs_id) {
		session.delete(namespace + ".deleteBBS",bbs_id);
		
	}

}
