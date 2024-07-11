package com.scarabERP.ERP.starim.notice;

import java.util.HashMap;

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
@RequestMapping("/erp/notice")
public class NoticeController {
	
	@Autowired
	NoticeDAO dao;
	
	@Autowired
	NoticeService service;

	@GetMapping("/list.json") // 테스트 http://localhost:8080/bbs/list.json?key=uid&word=&page=1&size=3
	public HashMap<String, Object> list(QueryVO vo){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("total", dao.total(vo));
		map.put("documents", dao.list(vo));
		return map;
	}
	
	@GetMapping("/{notice_id}") //테스트 http://localhost:8080/bbs/114
	public NoticeVO read(@PathVariable("notice_id") int notice_id) {
		return service.read(notice_id);
	}
	
	@DeleteMapping("/{notice_id}")
	public void delete(@PathVariable("notice_id") int notice_id) {
		dao.delete(notice_id);
	}
	
	@PutMapping
	public void update(@RequestBody NoticeVO vo) {
		dao.update(vo);
	}
	
	@PostMapping
	public void insert(@RequestBody NoticeVO vo) {
		dao.insert(vo);
	}
	
	@PutMapping("/1")
	public void updateNotice(@RequestBody NoticeVO vo) {
		dao.updateNotice(vo);
	}
	
	@PutMapping("/0")
	public void updateUnNotice(@RequestBody NoticeVO vo) {
		dao.updateUnNotice(vo);
	}

}
