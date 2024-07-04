package com.scarabERP.ERP.starim.items;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;

@Repository
public class ItemsDAOImply implements ItemsDAO {
	
	@Autowired
	SqlSession session;
	String namespace = "com.scarabERP.ERP.mapper.ItemsMapper";
	

	@Override
	public List<ItemsVO> list(QueryVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

}
