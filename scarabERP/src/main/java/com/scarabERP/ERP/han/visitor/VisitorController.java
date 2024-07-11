package com.scarabERP.ERP.han.visitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.scarabERP.ERP.starim.items.ItemsVO;



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
		//비밀번호 암호화
		String vpass = encoder.encode(vo.getVisitor_pass());
		vo.setVisitor_pass(vpass);
		dao.update(vo);
	}
	
	@PostMapping("/updatePhoto")
	public void updatePhoto(@RequestParam("visitor_id") String visitor_id, MultipartHttpServletRequest multi) throws IllegalStateException, IOException {
		//파일업로드
		MultipartFile file = multi.getFile("byte");
		String filePath = "/Scarab ERP/Scarab-ERP-front/public/images/visitor/";
		String fileName = visitor_id + ".jpg";
		File oldFile = new File(filePath + fileName);
		if(oldFile.exists()) {
			oldFile.delete();
		}else {
			//이미지업로드한걸로 업데이트
			VisitorVO vo = new VisitorVO();
			vo.setVisitor_id(visitor_id);
			vo.setVisitor_photo("/display?file=" + filePath + fileName);
			dao.updatePhoto(vo);
		}
		file.transferTo(new File("c:" + filePath + fileName));
	}
	
	@DeleteMapping("/delete/{visitor_id}")
	public void delete(@PathVariable("visitor_id") String visitor_id) {
		dao.delete(visitor_id);
	}
	

	@Autowired
	private VisitorService visitorService;
	@PostMapping("/searchid")
    public ResponseEntity<String> searchid(@RequestBody VisitorEmailRequest request) {		
        visitorService.searchid(request.getVisitor_email());
        return ResponseEntity.ok("입력한 이메일로 아이디가 전송되었습니다.");
	}

	
    @PostMapping("/searchpass")
    public ResponseEntity<String> resetPassword(@RequestBody VisitorPassRequest request) {
        try {
            visitorService.resetPassword(request.getVisitor_id(), request.getVisitor_email());
            return ResponseEntity.ok("해당 이메일로 새 비밀번호를 전송했습니다.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
	
}