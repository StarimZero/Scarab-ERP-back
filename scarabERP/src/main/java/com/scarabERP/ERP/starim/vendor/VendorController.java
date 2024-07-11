package com.scarabERP.ERP.starim.vendor;

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
@RequestMapping("/erp/vendor")
public class VendorController {
	
	@Autowired
	VendorDAO dao;
	
	@GetMapping("/list.json")
	public List<VendorVO> list(QueryVO vo) {
		return dao.list(vo);
	}
	
	
	@PostMapping
	public void insert(@RequestBody VendorVO vo) {
		dao.insert(vo);
	}
	
	@DeleteMapping("/{client_id}")
	public void delete(@PathVariable("client_id") int client_id) {
		dao.delete(client_id);
	}
	
	@GetMapping("/{client_id}")
	public VendorVO read(@PathVariable("client_id") int client_id) {
		return dao.read(client_id);
	}
	
	@PutMapping
	public void update(@RequestBody VendorVO vo) {
		dao.update(vo);
	}

}
