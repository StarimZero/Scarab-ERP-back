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
	
	@PostMapping("/insert")
	public void insert(@RequestBody ReceiveMessageVO vo) {
		dao.insert(vo);
		
	}
	
	@GetMapping("/list/{receive_message_receiver}") // erp/receivemessage/list
	public List<ReceiveMessageVO> list(@PathVariable("receive_message_receiver") String receive_message_receiver) {
		return dao.list(receive_message_receiver);
	}
    
	
	@PostMapping("/delete/{receive_message_id}")
	public void delete(@PathVariable("receive_message_id") int receive_message_id) {
		dao.delete(receive_message_id);
	}
	
	@PostMapping("/update/receivemessage/state")
	public void updateReceiveMessageState(@RequestBody ReceiveMessageVO vo) {
		dao.updateReceiveMessageState(vo);
	}
	

	
}
