package com.scarabERP.ERP.jay.BBS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bbs")
public class BBSController {
	
	@Autowired
	BBSDAO dao;
	

	
}
