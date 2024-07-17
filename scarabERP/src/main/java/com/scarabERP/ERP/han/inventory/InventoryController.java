package com.scarabERP.ERP.han.inventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/erp/inventory")
public class InventoryController {
	@Autowired
	InventoryDAO dao;
	
	@GetMapping("/listAll")
	public List<InventoryVO> listAll(QueryVO vo){
		return dao.listAll(vo);
	}
	@GetMapping("/listAllTotal")
	public int listAllTotal() {
		return dao.listAllTotal();
	}
	
	
	@GetMapping("/listByWarehouse/{warehouse}")
	public List<InventoryVO> listByWarehouse(
			@RequestParam(defaultValue="1") int page,
			@RequestParam(defaultValue="5") int size,
			@RequestParam int warehouse_id){
		int start = (page-1) * size;
		QueryVO vo = new QueryVO();
		vo.setPage(page);
		vo.setSize(size);
		vo.setStart(start);
	    List<InventoryVO> result = dao.listByWarehouse(vo, warehouse_id);
		return result;
	}
	@GetMapping("/listByWarehouseTotal/{warehouse}")
	public int listByWarehouseTotal(@RequestParam int warehouse_id) {
		return dao.listByWarehouseTotal(warehouse_id);
	}
	
	
	@GetMapping("/listRecent")
	public List<TradeVO> listRecent(@RequestParam String item, @RequestParam int warehouse){
		return dao.listRecent(item, warehouse);
	}
	
	
	
	@GetMapping("/listAlltrade")
	public List<TradeVO> listAlltrade(QueryVO vo){
		return dao.listAlltrade(vo);
	}
	@GetMapping("/listAlltradeTotal")
	public int listAlltradeTotal() {
		return dao.listAlltradeTotal();
	}
}
