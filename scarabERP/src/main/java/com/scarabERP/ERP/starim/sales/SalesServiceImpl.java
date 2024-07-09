package com.scarabERP.ERP.starim.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	SalesDAO dao;

	@Transactional
	@Override
	public void insert(SalesVO vo) {
		String Sales_id = dao.getSaleID();
		vo.setSales_id(Sales_id);
		dao.insert(vo);
		
	}

}
