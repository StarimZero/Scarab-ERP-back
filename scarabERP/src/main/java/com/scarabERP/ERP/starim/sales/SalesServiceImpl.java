package com.scarabERP.ERP.starim.sales;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	SalesDAO dao;
	
	@Autowired
	SalesInfoDAO idao;

//	@Override
//	public void insert(SalesInfoVO vo) {
//		String salesId = dao.getSaleID();
//	    vo.setSales_id(salesId);
//	    dao.insert(vo);
//
//	}
	

//	@Transactional
//	@Override
//	public void insert(SalesVO vo) {
//		String Sales_id = dao.getSaleID();
//		vo.setSales_id(Sales_id);
//		dao.insert(vo);
//	}
	
	
	
	@Override
	public void insert(SalesInfoVO vo) {
		String Sales_id = dao.getSaleID();
		vo.setSales_id(Sales_id);
		dao.insert(vo);
		idao.insert(vo);
	}
	
	


}
