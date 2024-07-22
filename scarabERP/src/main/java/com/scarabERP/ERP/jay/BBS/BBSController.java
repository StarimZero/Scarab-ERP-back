package com.scarabERP.ERP.jay.BBS;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bbs")
public class BBSController {
	
	@Autowired
	BBSDAO dao;
	
	@GetMapping("/list") 
	public List<BBSVO> list(){
		return dao.list();
	}
	@PostMapping("/insert")
	public void insert(@RequestBody BBSVO vo) {
		dao.insert(vo);
	}
	@GetMapping("/read/{bbs_id}")
	public BBSVO read(@PathVariable("bbs_id") int bbs_id) {
		return dao.read(bbs_id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody BBSVO vo) {
		dao.update(vo);
	}
	
	@PatchMapping("/update/{bbs_id}")
	public void updateTitle(@PathVariable("bbs_id") int bbs_id, @RequestBody String title) {
		BBSVO vo=dao.read(bbs_id);
		vo.setBbs_title(title);
		dao.update(vo);
	}
	@DeleteMapping("/delete/{bbs_id}")
	public void delete(@PathVariable("bbs_id") int bbs_id) {
		BBSVO vo=dao.read(bbs_id);
		dao.delete(bbs_id);
	}
	@GetMapping("/plist")
	public HashMap<String, Object> plist(com.scarabERP.ERP.common.QueryVO vo){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list", dao.plist(vo));
		map.put("total", dao.total());
		return map;
		
	}
	
}
