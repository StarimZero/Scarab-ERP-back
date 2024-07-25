package com.scarabERP.ERP.jay.BBS;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;

@Repository
public class BBSDAOImpl implements BBSDAO{
	@Autowired
	SqlSession session;
	String namespace="com.scarabERP.ERP.jay.BBSMapper";

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
		return session.selectList(namespace + ".list");
	}

	@Override
	public void BBSupdate(BBSVO vo) {
		session.update(namespace + ".BBSupdate", vo);
		
	}

	@Override
	public void delete(int bbs_id) {
		session.delete(namespace + ".deleteBBS",bbs_id);
		
	}

	@Override
	public List<BBSVO> plist(QueryVO vo) {
		
		return session.selectList(namespace + ".plist", vo);
	}

	@Override
	public int total() {
		
		return session.selectOne(namespace + ".total");
	}

	@Override
	public void viewcntupdate(int bbs_id) {
		session.update(namespace + ".viewcntupdate", bbs_id);
		
	}
}
