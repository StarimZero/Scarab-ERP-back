package com.scarabERP.ERP.jun.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scarabERP.ERP.jun.account.AccountDAO;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionDAO tdao;
	
	@Autowired
	AccountDAO adao;

	@Transactional
	@Override
	public void insert(TransactionVO vo) {
		// TODO Auto-generated method stub
		String account_number = vo.getAccount_number();
		int account_total = adao.read(account_number).getAccount_total();
		tdao.insert(vo);
		if(vo.getTransaction_deposit()!=0) {
			adao.updateTotal(account_number, account_total + vo.getTransaction_deposit());
		} else {
			adao.updateTotal(account_number, account_total - vo.getTransaction_withdraw());
		}
		
	}
	
}
