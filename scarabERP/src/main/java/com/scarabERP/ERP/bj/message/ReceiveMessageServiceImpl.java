package com.scarabERP.ERP.bj.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReceiveMessageServiceImpl implements ReceiveMessageService{
	
	@Autowired
	ReceiveMessageDAO dao;
	
	@Transactional
	@Override
	public ReceiveMessageVO readReceive(int receive_message_id) {
		
		return null;
	}	
	
}
