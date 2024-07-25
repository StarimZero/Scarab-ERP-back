package com.scarabERP.ERP.jun.transaction;

import java.util.HashMap;
import java.util.List;

import com.scarabERP.ERP.common.QueryVO;

public interface TransactionDAO {
	public List<TransactionVO> list(QueryVO query, TransactionVO vo);
	public int total(QueryVO query, TransactionVO vo);
	public List<TransactionVO> selectData(QueryVO query);
	public List<TransactionVO> data();
	public HashMap<String, Object> read(int transaction_id);
	public void insert(TransactionVO vo);
}
