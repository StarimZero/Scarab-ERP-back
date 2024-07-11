package com.scarabERP.ERP;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scarabERP.ERP.jay.BBS.BBSDAO;
import com.scarabERP.ERP.jay.BBS.BBSVO;

@SpringBootTest
class ScarabErpApplicationTests {
	@Autowired
	BBSDAO dao;
	
	@Test
	void contextLoads() {
		
//		insert	C
//		BBSVO vo =new BBSVO();
//		vo.setBbs_writer("blue1234");
//		vo.setBbs_title("처음하는 프로젝트테스트");
//		vo.setBbs_content("처음넣어보는 내용");
//		vo.setBbs_category("고객게시판");
//		dao.insert(vo);
		
//		read	R
//		dao.read(8);
		
//		update	U
		BBSVO vo=new BBSVO();
		vo.setBbs_id(8);
		vo.setBbs_title("이유닛 테스트");
		vo.setBbs_content("업데이트 된 내용");
		dao.update(vo);
		
		
	}

}
