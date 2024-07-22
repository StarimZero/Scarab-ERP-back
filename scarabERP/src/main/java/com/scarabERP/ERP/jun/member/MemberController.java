package com.scarabERP.ERP.jun.member;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/erp/member")
public class MemberController {
	@Autowired
	MemberDAO dao;
	
	@Autowired
	MemberService service;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@GetMapping("")
	public HashMap<String, Object> list(QueryVO query, MemberVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", dao.list(query, vo));
		map.put("total", dao.total(query, vo));
		return map;
	}
	
	@PostMapping("")
	public void insert(@RequestBody MemberVO vo) {
		service.insert(vo);
	}
	
	@GetMapping("/memberKey")
	public String memberKey() {
		return dao.getERPMemberKey();
	}
	
	@GetMapping("/{member_info_id}")
	public MemberVO read(@PathVariable("member_info_id") String member_info_id) {
		return dao.read(member_info_id);
	}
	
	@PostMapping("/info/{member_info_key}")
	public void updateInfo(@PathVariable("member_info_key") String member_info_key, @RequestBody MemberVO vo, MultipartHttpServletRequest multi) throws Exception {
		service.updateInfo(member_info_key, vo, multi);
	}
	
	@PutMapping("/login")
	public void updateLogin(@RequestBody MemberVO vo) {
		dao.updateLogin(vo);
	}
	
	@PutMapping("/dept")
	public void updateDept(@RequestBody MemberVO vo) {
		dao.updateDept(vo);
	}
	
	@PutMapping("/job")
	public void updateJob(@RequestBody MemberVO vo) {
		dao.updateJob(vo);
	}
	
	@PutMapping("/auth")
	public void updateAuth(@RequestBody MemberVO vo) {
		dao.updateAuth(vo);
	}
	
	@DeleteMapping("")
	public void delete(@RequestBody Map<String, String> request) {
		String member_info_key = request.get("member_info_key");
		dao.delete(member_info_key);
	}
}
