package com.scarabERP.ERP.jay.BBS;

import java.util.List;

public interface BBSDAO {
	public void insert(BBSVO vo);
	public BBSVO read(int bbs_id);
	public List<BBSVO> list();
	public void update(BBSVO vo);
	public void delete(int bbs_id);
	
}
