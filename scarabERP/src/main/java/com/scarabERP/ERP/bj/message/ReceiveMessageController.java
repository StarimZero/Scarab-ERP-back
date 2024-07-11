package com.scarabERP.ERP.bj.message;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/erp/receivemessage")
public class ReceiveMessageController {
	
	@Autowired
	ReceiveMessageDAO dao;
	
	@Autowired
	MessageService service;
	
	@PostMapping("/insert")
	public void insert(@RequestBody MessageVO vo) {
		service.insert(vo);
		
	}
	
	@GetMapping("/list.json/{message_receiver}") // erp/receivemessage/list.json/kiin
	public List<MessageVO> list(@PathVariable("message_receiver") String message_receiver) {
		return dao.list(message_receiver);
	}
	


	@GetMapping("/deletelist/{message_receiver}")
	public HashMap<String, Object> deletelist(QueryVO vo, @PathVariable("message_receiver") String message_receiver) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("total", dao.total(vo));
		map.put("deleteList", dao.deleteList(vo, message_receiver));
		return map;
	}
    
    
	
	@PostMapping("/delete/{message_id}")
	public void delete(@PathVariable("message_id") int message_id) {
		dao.delete(message_id);
	}
	
	@PostMapping("/update/receive/state/{message_id}")
	public void updateReceiveState(@PathVariable("message_id") int message_id ) {
		dao.updateReceiveState(message_id);
	}
	
	@GetMapping("/read/{message_id}")
	public MessageVO readReceive(@PathVariable("message_id") int message_id) {
		return dao.readReceive(message_id);
	}
	
	@PostMapping("/update/readdate")
	public void updateReadDate(@RequestBody MessageVO vo) {
		dao.updateReadDate(vo);
	}
	
	@PostMapping("/reset/state/{message_id}")
	public void resetState(@PathVariable("message_id") int message_id) {
		dao.resetState(message_id);
	}
}
