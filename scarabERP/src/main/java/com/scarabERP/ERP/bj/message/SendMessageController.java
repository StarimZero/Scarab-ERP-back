package com.scarabERP.ERP.bj.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/send/message")
public class SendMessageController {
	
	@Autowired
	private SendMessageDAO dao;
	
	@PostMapping("/insert")
	public void insert(@RequestBody SendMessageVO vo) {
		
	}

	
}
