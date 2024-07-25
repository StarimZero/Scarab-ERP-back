package com.scarabERP.ERP.jay.BBS.faq;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;

@Repository
public class FAQDAOImpl implements FAQDAO{
	
	@Autowired
	SqlSession session;
	String namespace="com.scarabERP.ERP.jay.FAQMapper";

	@Override
	public FAQVO read(int faq_id) {
		
		return session.selectOne(namespace + ".FAQread", faq_id);
	}

	@Override
	public void insert(FAQVO vo) {
		session.insert(namespace + "FAQinsert", vo);
		
	}

	@Override
	public void FAQupdate(FAQVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FAQdelete(int faq_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int total(QueryVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void viewcntupdate(int faq_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		
		return session.selectList(namespace + ".FAQlist",vo);
	}


}
