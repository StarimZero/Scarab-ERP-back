package com.scarabERP.ERP.bj.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveMessageServiceImpl implements ReceiveMessageService{
	@Autowired
	ReceiveMessageDAO rdao;
	
	@Autowired
	SendMessageDAO sdao;
	
	@Override
	public void insert(MessageVO vo) {
		rdao.insert(vo);
		sdao.insert(vo);
		
	}
	
	

	
}
