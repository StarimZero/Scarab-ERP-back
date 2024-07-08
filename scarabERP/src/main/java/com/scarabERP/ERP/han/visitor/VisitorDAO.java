package com.scarabERP.ERP.han.visitor;

public interface VisitorDAO {
	public VisitorVO mypage(String visitor_id);
	public VisitorVO login(String visitor_id);
	public VisitorVO check(String visitor_id);
	public void insert(VisitorVO vo);
	public void update(VisitorVO vo);
}
