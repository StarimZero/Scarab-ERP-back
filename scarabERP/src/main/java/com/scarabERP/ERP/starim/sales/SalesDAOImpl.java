package com.scarabERP.ERP.starim.sales;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;

@Repository
public class SalesDAOImpl implements SalesDAO {
	
	
	@Autowired
	SqlSession session;
	String namespace = "com.scarabERP.ERP.mapper.SalesMapper";

	@Override
	public String getSaleID() {
		return session.selectOne(namespace + ".getSaleID");
	}

	@Override
	public void insert(SalesVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}

	@Override
	public List<SalesVO> list(QueryVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public void delete(String sales_id) {
		session.delete(namespace + ".delete", sales_id);
		
	}

}
