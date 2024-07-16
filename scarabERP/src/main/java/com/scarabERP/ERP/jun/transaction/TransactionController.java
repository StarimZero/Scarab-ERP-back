package com.scarabERP.ERP.jun.transaction;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/erp/transaction")
public class TransactionController {
	@Autowired
	TransactionDAO dao;
	
	@Autowired
	TransactionService service;
	
	@GetMapping("")
	public HashMap<String, Object> list(QueryVO query, TransactionVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", dao.list(query, vo));
		map.put("total", dao.total(query, vo));
		
		return map;
	}
	
	@GetMapping("/{transaction_id}")
	public TransactionVO read(@PathVariable("transaction_id") int transaction_id) {
		return dao.read(transaction_id);
	}
	
	@PostMapping("")
	public void insert(@RequestBody TransactionVO vo) {
		service.insert(vo);
	}
}
