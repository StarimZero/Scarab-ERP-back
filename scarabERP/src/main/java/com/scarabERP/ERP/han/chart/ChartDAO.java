package com.scarabERP.ERP.han.chart;

import java.util.List;

import com.scarabERP.ERP.han.inventory.TradeVO;

public interface ChartDAO {
	public List<TradeVO> totalPurchaseByDate();
	public List<TradeVO> totalSaleByDate();
	public List<TradeVO> totalSaleByWarehouse();
	public List<TradeVO> profitByDate();
	public List<SalesVO> saleByCountry();
	public List<AccountVO> restAccount();
}
