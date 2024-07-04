package com.scarabERP.ERP.han.visitor;



public interface VisitorDAO {
	public VisitorVO read(String vid);
	public void insert(VisitorVO vo);
	
}
