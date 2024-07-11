package com.scarabERP.ERP.jun.member;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface MemberService {
	public void insert(MemberVO vo);
	public void updateInfo(String member_info_key, MemberVO vo, MultipartHttpServletRequest multi) throws Exception;
}
