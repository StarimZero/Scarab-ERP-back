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
@RequestMapping("/visitor")
public class VisitorController {
	@Autowired
	VisitorDAO dao;
	
	@Autowired
	PasswordEncoder encoder;
	
	@GetMapping("/read/{vid}")
	public VisitorVO read(@PathVariable("vid") String vid) {
		return dao.read(vid);
	}
	
	@PostMapping("/login")
	public int login(@RequestBody VisitorVO vo) {
		//아이디 미입력 or 아이디 틀림 (0 리턴)
		//아이디 맞고 비번 틀림 (2 리턴)
		//아이디 맞고 비번도 맞음 (1 리턴 - 로그인성공)
		int result=0;
		VisitorVO visitor = dao.read(vo.getVid());
		if(visitor != null){
			//암호화된 비번 비교
			if(encoder.matches(vo.getVpass(), visitor.getVpass())){
				result=1;
			}else{
				result=2;
			}
		}
		return result;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody VisitorVO vo) {
		//비밀번호 암호화
		String vpass = encoder.encode(vo.getVpass());
		vo.setVpass(vpass);
		dao.insert(vo);
	}
}