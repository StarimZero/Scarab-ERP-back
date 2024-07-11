package com.scarabERP.ERP.starim.purchase;

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
@RequestMapping("/erp/purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseDAO dao;
	
	@Autowired
	PurchaseService service;
	
	@PostMapping()
	public void insert(@RequestBody PurchaseVO vo) {
		service.insert(vo);
	}
	
	@GetMapping("/list.json")
	public List<PurchaseVO> listPage(QueryVO vo) {
		return dao.list(vo);
	}
	
	@DeleteMapping("/{purchase_id}")
	public void delete(@PathVariable("purchase_id") String purchase_id) {
		dao.delete(purchase_id);
	}
	
	@PutMapping
	public void update(@RequestBody PurchaseVO vo) {
		dao.update(vo);
	}
	

}
