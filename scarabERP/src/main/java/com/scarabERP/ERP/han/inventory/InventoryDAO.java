package com.scarabERP.ERP.han.inventory;

import java.util.List;
import com.scarabERP.ERP.common.QueryVO;
import org.apache.ibatis.annotations.Param;

public interface InventoryDAO {
	public List<InventoryVO> listAll(QueryVO vo);
	public List<InventoryVO> listByWarehouse(int warehouse_id);
	public List<TradeVO> listRecent(@Param("item") String item, @Param("warehouse") int warehouse);
	public List<TradeVO> listAlltrade(QueryVO vo);
}
