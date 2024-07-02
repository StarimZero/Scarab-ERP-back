package com.scarabERP.ERP.han.visitor;

import com.scarabERP.ERP.han.visitor.VisitorVO;

public interface VisitorDAO {
	public VisitorVO read(String vid);
	public void insert(VisitorVO vo);
	
}
