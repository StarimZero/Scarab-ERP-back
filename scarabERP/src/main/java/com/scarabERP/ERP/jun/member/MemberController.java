package com.scarabERP.ERP.jun.member;

import java.util.HashMap;
import java.util.Map;

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
@RequestMapping("/erp/member")
public class MemberController {
	@Autowired
	MemberDAO dao;
	
	@Autowired
	MemberService service;
	
	@GetMapping("")
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("total", dao.total(vo));
		map.put("list", dao.list(vo));
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
	
	@GetMapping("/{member_info_key}")
	public MemberVO read(@PathVariable("member_info_key") String member_info_key) {
		return dao.read(member_info_key);
	}
	
	@PutMapping("/info")
	public void updateInfo(@RequestBody MemberVO vo) {
		dao.updateInfo(vo);
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