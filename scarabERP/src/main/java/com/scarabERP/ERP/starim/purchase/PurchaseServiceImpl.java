package com.scarabERP.ERP.starim.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	PurchaseDAO dao;

	@Transactional
	@Override
	public void insert(PurchaseVO vo) {
		String Purchase_id = dao.getPurchaseID();
		vo.setPurchase_id(Purchase_id);
		dao.insert(vo);
		
	}

}
