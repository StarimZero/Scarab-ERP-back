package com.scarabERP.ERP.han.inventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	InventoryDAO dao;
	
	@GetMapping("/listAll")
	public List<InventoryVO> listAll(QueryVO vo){
		return dao.listAll(vo);
	}
	
	@GetMapping("/listByWarehouse")
	public List<InventoryVO> listByWarehouse(@PathVariable int warehouse){
		return dao.listByWarehouse(warehouse);
	}
	
	@GetMapping("/listRecent")
	public List<TradeVO> listRecent(@RequestParam String item, @RequestParam int warehouse){
		return dao.listRecent(item, warehouse);
	}
	
	@GetMapping("/listAlltrade")
	public List<TradeVO> listAlltrade(QueryVO vo){
		return dao.listAlltrade(vo);
	}
}
