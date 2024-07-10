
package com.scarabERP.ERP.han.visitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {

    @Autowired
    private VisitorDAO visitorDAO;

    @Autowired
    private EmailService emailService;
    
    public void searchid(String visitor_email) {
    	VisitorVO visitor = visitorDAO.searchid(visitor_email);
    	if (visitor != null  && visitor.getVisitor_id() != null) {
    		String subject = "아이디 찾기";
    		String text = "아이디는 " + visitor.getVisitor_id() + " 입니다.";
    		emailService.sendEmail(visitor_email, subject, text);
    	}
    }
    
    
}