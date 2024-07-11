package com.scarabERP.ERP.bj.message;

import java.util.HashMap;

import com.scarabERP.ERP.common.QueryVO;

public interface MessageService {
	public void insert(MessageVO vo);
	public HashMap<String, Object> deleteList(QueryVO vo, String message_sender, String message_receiver);
}
