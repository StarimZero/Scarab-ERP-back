
package com.scarabERP.ERP.han.visitor;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class VisitorService {

    @Autowired
    private VisitorDAO visitorDAO;

    @Autowired
    private EmailService emailService;
    
	@Autowired
	PasswordEncoder encoder;
    
    public void searchid(String visitor_email) {
    	try {
    	VisitorVO visitor = visitorDAO.searchid(visitor_email);
    	if (visitor != null  && visitor.getVisitor_id() != null) {
    		String subject = "아이디 찾기";
    		String text = "아이디는 " + visitor.getVisitor_id() + " 입니다.";
    		emailService.sendEmail(visitor_email, subject, text);
    	}else {
    		throw new RuntimeException("검색된 아이디가 없습니다.");
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    		throw new RuntimeException("메일전송중 오류", e);
    	}
    }
    

    
}