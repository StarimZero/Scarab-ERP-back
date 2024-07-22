package com.scarabERP.ERP.jun.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scarabERP.ERP.jun.account.AccountDAO;
import com.scarabERP.ERP.starim.purchase.PurchaseDAO;
import com.scarabERP.ERP.starim.purchase.PurchaseVO;
import com.scarabERP.ERP.starim.sales.SalesDAO;
import com.scarabERP.ERP.starim.sales.SalesVO;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionDAO tdao;
	
	@Autowired
	AccountDAO adao;
	
	@Autowired
	PurchaseDAO pdao;
	
	@Autowired
	SalesDAO sdao;

	@Transactional
	@Override
	public void insert(TransactionVO vo) {
		// TODO Auto-generated method stub
		String account_number = vo.getAccount_number();
		int account_total = adao.read(account_number).getAccount_total();
		tdao.insert(vo);
		
		if(vo.getTransaction_deposit()!=0) {
			adao.updateTotal(account_number, account_total + vo.getTransaction_deposit());
			SalesVO sales = new SalesVO();
			sales.setSales_id(vo.getSales_id());
			sales.setSales_type(vo.getSales_type());
			sdao.update(sales);
		} else {
			adao.updateTotal(account_number, account_total - vo.getTransaction_withdraw());
			PurchaseVO purchase = new PurchaseVO();
			purchase.setPurchase_id(vo.getPurchase_id());
			purchase.setPurchase_type(vo.getPurchase_type());
			pdao.update(purchase);
		}
	}
	
}
