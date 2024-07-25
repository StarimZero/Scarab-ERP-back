package com.scarabERP.ERP.bj.message;


import java.util.HashMap;
import java.util.List;

import com.scarabERP.ERP.common.QueryVO;




public interface ReceiveMessageDAO {
	public void insert(MessageVO vo);
	public List<HashMap<String,Object>> list(QueryVO vo, String message_receiver);
	public void updateReceiveState(int message_id);
	public void delete(int message_id);
	public void updateReadDate(int message_id);
	public MessageVO readReceive(int message_id);
	public List<HashMap<String,Object>> deleteList(QueryVO vo, String message_receiver);
	public int total(String message_receiver);
	public int dtotal(String message_receiver);
	public void resetState(int message_id);
	public List<HashMap<String,Object>> nlist(QueryVO vo, String message_receiver);
	public int ntotal(String message_receiver);
}

