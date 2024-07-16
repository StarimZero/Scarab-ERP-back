package com.scarabERP.ERP.jun.member;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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

	@Override
	public void updateInfo(String member_info_key, MemberVO vo, MultipartHttpServletRequest multi) throws Exception {
		// TODO Auto-generated method stub
		//파일업로드
		MultipartFile file=multi.getFile("byte");
		String filePath="/data/scarab/Scarab-ERP-front/public/images/member/";
		String fileName = member_info_key + ".jpg";

		// 파일이 존재하면 삭제
		File oldFile = new File(filePath + fileName);
		if(oldFile.exists()) {
			oldFile.delete();
		}else {
			//이미지이름변경
			vo.setMember_info_key(member_info_key);
			vo.setMember_info_photo("/display?file=" + filePath + fileName);
		}
		file.transferTo(new File("c:" + filePath + fileName));
		System.out.println("..."+ vo.toString());
		dao.updateInfo(vo);
	}
}
