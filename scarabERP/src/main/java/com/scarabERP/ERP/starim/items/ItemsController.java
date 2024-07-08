package com.scarabERP.ERP.starim.items;

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
@RequestMapping("/erp/items")
public class ItemsController {

	@Autowired
	ItemsDAO dao;
	
	@GetMapping("/list.json")
	public List<ItemsVO> listPage(QueryVO vo) {
		return dao.list(vo);
	}
	
	
	@PostMapping
	public void insert(@RequestBody ItemsVO vo) {
		dao.insert(vo);
	}
	
	@DeleteMapping("/{items_id}")
	public void delete(@PathVariable("items_id") String items_id) {
		dao.delete(items_id);
	}
	
	@GetMapping("/{items_id}")
	public ItemsVO read(@PathVariable("items_id") String items_id) {
		return dao.read(items_id);
	}
	
	@PutMapping
	public void update(@RequestBody ItemsVO vo) {
		dao.update(vo);
	}
	
}
