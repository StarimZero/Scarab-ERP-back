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


	@Override
	public void insert(ItemsVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}


	@Override
	public ItemsVO read(String items_id) {
		return session.selectOne(namespace + ".read", items_id);
	}


	@Override
	public void update(ItemsVO vo) {
		session.update(namespace + ".update", vo);
		
	}


	@Override
	public void updatePhoto(ItemsVO vo) {
		session.update(namespace + ".updatePhoto", vo);
		
	}


	@Override
	public void delete(String items_id) {
		session.delete(namespace + ".delete", items_id);
		
		
	}


	@Override
	public void insertPhoto(ItemsVO vo) {
		session.insert(namespace + ".insertPhoto", vo);
		
	}

}
