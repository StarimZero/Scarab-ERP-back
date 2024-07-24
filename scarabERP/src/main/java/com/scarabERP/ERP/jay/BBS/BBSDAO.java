package com.scarabERP.ERP.jay.BBS;

import java.util.List;

import com.scarabERP.ERP.common.QueryVO;

public interface BBSDAO {
	public void insert(BBSVO vo);
	public BBSVO read(int bbs_id);
	public List<BBSVO> list();
	public void BBSupdate(BBSVO vo);
	public void delete(int bbs_id);
	public List<BBSVO> plist(QueryVO vo);
	public int total();
	public void viewcntupdate(int bbs_id);
	
}
