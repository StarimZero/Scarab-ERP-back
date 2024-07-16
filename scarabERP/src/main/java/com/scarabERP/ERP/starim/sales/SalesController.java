package com.scarabERP.ERP.starim.sales;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/erp/sales")
public class SalesController {

	
	@Autowired
	SalesDAO dao;
	
	@Autowired
	SalesService service;
	
	@PostMapping
	public void insert(SalesInfoVO vo) {
		service.insert(vo);
	}
	
//	@PostMapping
//	public void insert(@RequestBody SalesVO vo1, @RequestBody SalesInfoVO vo2) {
//		service.insert12(vo1, vo2);
//	}
	

	@GetMapping
	public List<SalesInfoVO> listPage(QueryVO vo) {
		return dao.list(vo);
	}
	
	@DeleteMapping("/{sales_id}")
	public void delete(@PathVariable("sales_id") String sales_id) {
		dao.delete(sales_id);
	}
	
	@PutMapping
	public void update(@RequestBody SalesInfoVO vo) {
		dao.update(vo);
	}
	

	
}
