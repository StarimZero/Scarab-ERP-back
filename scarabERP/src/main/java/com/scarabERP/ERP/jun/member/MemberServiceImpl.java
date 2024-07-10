package com.scarabERP.ERP.jun.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;

	@Override
	public void insert(MemberVO vo) {
		// TODO Auto-generated method stub
		String erpMemberKey = dao.getERPMemberKey();
		vo.setMember_info_key(erpMemberKey);
		dao.insert(vo);
	}
}
