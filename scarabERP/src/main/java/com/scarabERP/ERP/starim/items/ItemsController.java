package com.scarabERP.ERP.starim.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
}
