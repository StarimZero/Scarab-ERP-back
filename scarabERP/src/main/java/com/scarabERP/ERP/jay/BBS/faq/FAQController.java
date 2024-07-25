package com.scarabERP.ERP.jay.BBS.faq;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/faq")
public class FAQController {
	
	@Autowired
	FAQDAO dao;
	
	@PostMapping("/")
	public void insert(@RequestBody FAQVO vo) {
		dao.insert(vo);
	}
	@GetMapping("/list")
	public HashMap<String,Object> list(QueryVO vo) {
		HashMap<String,Object> map= new HashMap<String,Object>();
		map.put("FAQlist", dao.list(vo));
		// map.put("FAQtotal", dao.total(vo));
		return map;
	}

}
