package com.scarabERP.ERP.starim.items;

import java.util.List;

import com.scarabERP.ERP.common.QueryVO;
import com.scarabERP.ERP.starim.warehouse.WareHouseVO;

public interface ItemsDAO {
	//아이템 목록들고오기
	public List<ItemsVO> list(QueryVO vo);
	//물품 등록하기
	public void insert(ItemsVO vo);
	//물품삭제하기
	public void delete(String items_id);
	//물품정보불러오기
	public ItemsVO read(String items_id);
	//물품정보 수정하기 
	public void update(ItemsVO vo);
	//물품사진 업로드
	public void updatePhoto(ItemsVO vo);
	//사진등록
	public void insertPhoto(ItemsVO vo);
}
