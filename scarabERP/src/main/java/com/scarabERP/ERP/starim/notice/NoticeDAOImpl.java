package com.scarabERP.ERP.starim.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;


@Repository
public class NoticeDAOImpl implements NoticeDAO {
	
	
	@Autowired
	SqlSession session;
	String namespace="com.scarabERP.ERP.mapper.NoticeMapper";

	@Override
	public List<NoticeVO> list(QueryVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}

	@Override
	public NoticeVO read(int notice_id) {
		return session.selectOne(namespace + ".read", notice_id);
	}

	@Override
	public void delete(int notice_id) {
		session.delete(namespace + ".delete", notice_id);
		
	}

	@Override
	public void update(NoticeVO vo) {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void insert(NoticeVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}

	@Override
	public void updateViewcnt(int notice_id) {
		session.update(namespace + ".updateViewcnt", notice_id);
		
	}

	@Override
	public void updateNotice(NoticeVO vo) {
		session.update(namespace + ".updateNotice", vo);
		
	}

	@Override
	public void updateUnNotice(NoticeVO vo) {
		session.update(namespace + ".updateUnNotice", vo);
		
	}

	@Override
	public List<NoticeVO> listpage(QueryVO vo) {
		return session.selectList(namespace + ".listpage", vo);
	}

}
