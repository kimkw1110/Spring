package ch05_pjt_01.contact.service;

import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스 import
import ch05_pjt_01.contact.dao.ContactDao; // ContactDao 인터페이스 import

public class ContactSearchService {
    private ContactDao contactDao; // ContactDao 인터페이스를 구현한 객체를 저장하는 변수
    
    // 기본 생성자
    public ContactSearchService() {
        System.out.println("ContactSearchService 의 default Constructor"); // 생성자 호출 시 출력
    }

    // ContactDao를 파라미터로 받는 생성자
    public ContactSearchService(ContactDao contactDao) {
        System.out.println("ContactDao 파라미터 하나 가진 ContactSearchService 생성자"); // 생성자 호출 시 출력
        System.out.println("ContactSearchService에서 contactDao: " + contactDao); // 전달받은 contactDao 출력
        this.contactDao = contactDao; // 전달받은 contactDao로 초기화
    }

    // 주어진 이름으로 연락처를 검색하는 메서드
    public ContactSet searchContact(String name) {
        if (verify(name)) { // 주어진 이름으로 연락처가 있는지 확인
            return contactDao.select(name); // 연락처가 있으면 해당 연락처 반환
        } else {
            System.out.println("Contact information is not available."); // 연락처가 없으면 메시지 출력
        }
        return null; // 연락처가 없으면 null 반환
    }

    // 주어진 이름으로 연락처가 있는지 확인하는 메서드
    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name); // 주어진 이름에 해당하는 연락처 조회
        return contactSet != null ? true : false; // 조회 결과가 null이 아니면 true 반환 (연락처가 존재함), null이면 false 반환 (연락처가 존재하지 않음)
    }

    // ContactDao를 설정하는 메서드
    public void setContactDao(ContactDao contactDao) {
        System.out.println("ContactSearchService의 setContactDao 메서드 호출됨."); // 메서드 호출 시 출력
        this.contactDao = contactDao; // 전달받은 contactDao로 초기화
    }
}
