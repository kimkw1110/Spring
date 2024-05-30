package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스 import
import ch05_pjt_01.contact.dao.ContactDao; // ContactDao 인터페이스 import

// 연락처 검색 서비스 클래스
public class ContactSearchService {
    
    @Autowired // 자동 주입을 위한 어노테이션
    private ContactDao contactDao; // ContactDao 객체
    
    // 기본 생성자
    public ContactSearchService() {
        System.out.println("ContactSearchService 의 default Constructor"); // 생성자 호출 시 출력
    }

    // ContactDao를 파라미터로 받는 생성자
    // @Autowired
    public ContactSearchService(ContactDao contactDao) {
        System.out.println("ContactDao 파라미터 하나 가진 ContactSearchService 생성자"); // 생성자 호출 시 출력
        System.out.println("ContactSearchService에서 contactDao: " + contactDao); // contactDao 출력
        this.contactDao = contactDao; // 주입받은 ContactDao 설정
    }

    // 이름을 기준으로 연락처 검색하는 메서드
    public ContactSet searchContact(String name) {
        if (verify(name)) { // 이름이 존재하는지 검증
            return contactDao.select(name); // 이름에 해당하는 연락처 반환
        } else {
            System.out.println("Contact information is not available."); // 정보가 없는 경우 메시지 출력
        }
        return null;
    }

    // 이름의 존재 여부를 확인하는 메서드
    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name); // 이름을 기반으로 연락처 조회
        return contactSet != null ? true : false; // 조회된 결과가 있으면 true 반환
    }

    // ContactDao를 주입하는 setter 메서드
    // @Autowired
    public void setContactDao(ContactDao contactDao) {
        System.out.println("ContactSearchService의 setContactDao 메서드 호출됨."); // 메서드 호출 시 출력
        this.contactDao = contactDao; // 주입받은 ContactDao 설정
    }
}
