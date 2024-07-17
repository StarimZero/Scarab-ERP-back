package com.scarabERP.ERP.han.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;

@Repository
public class InventoryDAOImpl implements InventoryDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.han.InventoryMapper";
	
	@Override
	public List<InventoryVO> listAll(QueryVO vo) {
		return session.selectList(namespace + ".listAll", vo);
	}
	@Override
	public int listAllTotal() {
		return session.selectOne(namespace + ".listAllTotal");
	}
	
	
	@Override
	public List<InventoryVO> listByWarehouse(QueryVO vo, int warehouse_id) {
		Map<String, Object> params = new HashMap<>();
		params.put("vo", vo);
	    params.put("warehouse_id", warehouse_id);
		return session.selectList(namespace + ".listByWarehouse", params);
	}
	@Override
	public int listByWarehouseTotal(int warehouse_id) {
		return session.selectOne(namespace + ".listByWarehouseTotal", warehouse_id);
	}
	
	
	@Override
	public List<TradeVO> listRecent(String item, int warehouse) {
		Map<String, Object> params = new HashMap<>();
		params.put("item", item);
		params.put("warehouse", warehouse);
		return session.selectList(namespace + ".listRecent", params);
	}
	
	
	@Override
	public List<TradeVO> listAlltrade(QueryVO vo) {
		return session.selectList(namespace + ".listAlltrade", vo);
	}
	@Override
	public int listAlltradeTotal() {
		return session.selectOne(namespace + ".listAlltradeTotal");
	}




	
}
