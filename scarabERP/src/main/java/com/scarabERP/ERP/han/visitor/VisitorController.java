package com.scarabERP.ERP.han.visitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/visitor")
public class VisitorController {
	@Autowired
	VisitorDAO dao;
	
	@Autowired
	PasswordEncoder encoder;
	
	@GetMapping("/check/{visitor_id}")
	public VisitorVO check(@PathVariable("visitor_id") String visitor_id) {
		return dao.check(visitor_id);
	}
	
	@PostMapping("/login")
	public int login(@RequestBody VisitorVO vo) {
		//아이디 미입력 or 아이디 틀림 (0 리턴)
		//아이디 맞고 비번 틀림 (2 리턴)
		//아이디 맞고 비번도 맞음 (1 리턴 - 로그인성공)
		int result=0;

		VisitorVO visitor = dao.login(vo.getVisitor_id());
		if(visitor != null){
			//암호화된 비번 비교
			if(encoder.matches(vo.getVisitor_pass(), visitor.getVisitor_pass())){
			
			//비암호화 비번 비교
			//if(vo.getVisitor_pass().equals(visitor.getVisitor_pass())) {
				result=1;
			}else{
				result=2;
			}
		}
		System.out.println(visitor);
		return result;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody VisitorVO vo) {
		//비밀번호 암호화

		String vpass = encoder.encode(vo.getVisitor_pass());
		vo.setVisitor_pass(vpass);
		dao.insert(vo);
				
	}
	
	@GetMapping("/mypage/{visitor_id}")
	public VisitorVO mypage(@PathVariable("visitor_id") String visitor_id) {
		return dao.mypage(visitor_id);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody VisitorVO vo) {
		dao.update(vo);
	}
}