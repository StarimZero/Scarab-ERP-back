package com.scarabERP.ERP.jun.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scarabERP.ERP.common.QueryVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	SqlSession session;
	String namespace = "com.scarabERP.ERP.mapper.jun.MemberMapper";
	
	@Override
	public List<MemberVO> list(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".total", vo);
	}
	
	@Override
	public String getERPMemberKey() {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".getERPMemberKey");
	}
	
	@Override
	public void insert(MemberVO vo) {
		// TODO Auto-generated method stub
		session.insert(namespace + ".insert", vo);
	}
	
	@Override
	public MemberVO read(String member_info_key) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", member_info_key);
	}

	@Override
	public void updateInfo(MemberVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update_info", vo);
	}
	
	@Override
	public void updateDept(MemberVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update_dept", vo);
	}
	
	@Override
	public void updateJob(MemberVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update_job", vo);
	}
	
	@Override
	public void updateAuth(MemberVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update_auth", vo);
	}

	@Override
	public void delete(String member_info_key) {
		// TODO Auto-generated method stub
		session.delete(member_info_key);
	}

}
