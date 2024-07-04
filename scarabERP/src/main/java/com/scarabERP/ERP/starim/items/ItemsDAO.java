package com.scarabERP.ERP.starim.items;

import java.util.List;

import com.scarabERP.ERP.common.QueryVO;

public interface ItemsDAO {
	//아이템 목록들고오기
	public List<ItemsVO> list(QueryVO vo);
	
	
}
