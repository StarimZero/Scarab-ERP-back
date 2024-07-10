package com.scarabERP.ERP.bj.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
    
    
	
	@PostMapping("/delete/{message_id}")
	public void delete(@PathVariable("message_id") int message_id) {
		dao.delete(message_id);
	}
	
	@PostMapping("/update/receive/state")
	public void updateReceiveState(@RequestBody MessageVO vo) {
		dao.updateReceiveState(vo);
	}
	
	@GetMapping("/read/{message_id}")
	public MessageVO readReceive(@PathVariable("message_id") int message_id) {
		return dao.readReceive(message_id);
	}
	
	@PostMapping("/update/readdate")
	public void updateReadDate(@RequestBody MessageVO vo) {
		dao.updateReadDate(vo);
	}
	
}
