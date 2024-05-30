package ch05_pjt_01.contact.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactRegisterService {
	@Resource
	// @Autowired
	@Qualifier("qualifierDao")
	private ContactDao contactDao;
    
    public ContactRegisterService() {
    	System.out.println("ContactRegisterService의 default Constructor"); // 기본 생성자     
    }
    
    // @Autowired
    public ContactRegisterService(ContactDao contactDao) {
    	System.out.println("ContactDao 파라미터 하나 가진 ContactRegisterService 생성자");
    	System.out.println("ContactRegisterService에서 contactDao: " + contactDao); // contactDao 출력
    	
    	this.contactDao = contactDao;
    }

    public void register(ContactSet contactSet) {
    	String name = contactSet.getName();
        if (verify(name)) {
        	contactDao.insert(contactSet);
        } else {
        	System.out.println("The name has already registered.");
        }
    }

    public boolean verify(String name) {
    	ContactSet contactSet = contactDao.select(name);
    	return contactSet == null ? true : false;
    }
    
    // @Resource
    // @Qualifier("qualifierDao")
    public void setContactDao(ContactDao contactDao) {
    	System.out.println("ContactRegisterService의 setContactDao 메서드 호출됨.");
    	this.contactDao = contactDao;
    }

    // @Resource
    // @Qualifier("qualifierDao")
    public void setWordDao(ContactDao contactDao) {
    	System.out.println("ContactRegisterService의 setWordDao 메서드 호출됨.");
    	this.contactDao = contactDao;
    }
}
