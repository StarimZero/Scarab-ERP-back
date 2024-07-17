package com.scarabERP.ERP.jun.transaction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@GetMapping
	public HashMap<String, Object> list(QueryVO query, TransactionVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", dao.list(query, vo));
		map.put("total", dao.total(query, vo));
		System.out.println(query);
		System.out.println(vo.toString());
		return map;
	}
	
	@GetMapping("/{transaction_id}")
	public HashMap<String, Object> read(@PathVariable("transaction_id") int transaction_id) {
		return dao.read(transaction_id);
	}
	
	@PostMapping("")
	public void insert(@RequestBody TransactionVO vo) {
		service.insert(vo);
	}
}
