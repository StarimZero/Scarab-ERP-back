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
@RequestMapping("/erp/sendmessage")
public class SendMessageController {

	@Autowired
	SendMessageDAO dao;
	
	
	@PostMapping("/insert")
	public void insert(@RequestBody SendMessageVO vo) {
		dao.insert(vo);
		
	}
	
	@GetMapping("/list/{send_message_sender}") // erp/sendmessage/list/kiin
	public List<SendMessageVO> list(@PathVariable("send_message_sender") String send_message_sender) {
		return dao.list(send_message_sender);
	}
	
	
	@PostMapping("/delete/{send_message_id}")
	public void delete(@PathVariable("send_message_id") int send_message_id) {
		dao.delete(send_message_id);
	}
	
	@PostMapping("/update/sendmessage/state")
	public void updateSendMessageState(@RequestBody SendMessageVO vo) {
		dao.updateSendMessageState(vo);
	}
	
}
