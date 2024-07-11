package com.scarabERP.ERP.bj.message;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scarabERP.ERP.common.QueryVO;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	ReceiveMessageDAO rdao;
	
	@Autowired
	SendMessageDAO sdao;

	@Override
	@Transactional
	public void insert(MessageVO vo) {
		rdao.insert(vo);
		sdao.insert(vo);
		
	}

	@Override
	@Transactional
	public HashMap<String, Object> deleteList(QueryVO vo, String message_sender, String message_receiver) {
		 HashMap<String, Object> map = new HashMap<>();

		 	map.put("totalReceiver", rdao.total(vo));
	        map.put("deleteListReceiver", rdao.deleteList(vo, message_receiver));
	        map.put("totalSender", sdao.total(vo));
	        map.put("deleteListSender", sdao.deleteList(vo, message_sender));

	        return map;
	}
	
}
