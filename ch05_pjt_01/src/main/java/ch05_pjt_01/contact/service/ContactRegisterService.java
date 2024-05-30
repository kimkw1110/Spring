package ch05_pjt_01.contact.service;

import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스 import
import ch05_pjt_01.contact.dao.ContactDao; // ContactDao 인터페이스 import

public class ContactRegisterService {
    private ContactDao contactDao; // ContactDao 인터페이스를 구현한 객체를 저장하는 변수

    // 기본 생성자
    public ContactRegisterService() {
        System.out.println("ContactRegisterService의 default Constructor"); // 생성자 호출 시 출력
    }

    // ContactDao를 파라미터로 받는 생성자
    public ContactRegisterService(ContactDao contactDao) {
        System.out.println("ContactDao 파라미터 하나 가진 ContactRegisterService 생성자"); // 생성자 호출 시 출력
        System.out.println("ContactRegisterService에서 contactDao: " + contactDao); // 전달받은 contactDao 출력
        
        this.contactDao = contactDao; // 전달받은 contactDao로 초기화
    }

    // 주어진 ContactSet을 등록하는 메서드
    public void register(ContactSet contactSet) {
        String name = contactSet.getName(); // ContactSet에서 이름을 가져옴
        if (verify(name)) { // 이미 등록된 이름인지 확인
            contactDao.insert(contactSet); // 등록되지 않은 이름이면 contactDao를 통해 삽입
        } else {
            System.out.println("The name has already registered."); // 이미 등록된 이름이면 메시지 출력
        }
    }

    // 주어진 이름이 이미 등록되었는지 확인하는 메서드
    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name); // 주어진 이름에 해당하는 ContactSet을 조회
        return contactSet == null ? true : false; // 조회 결과가 없으면 true 반환 (이름이 등록되지 않음), 있으면 false 반환 (이름이 이미 등록됨)
    }

    // ContactDao를 설정하는 메서드
    public void setWordDao(ContactDao contactDao) {
        System.out.println("ContactRegisterService의 setWordDao 메서드 호출됨."); // 메서드 호출 시 출력
        this.contactDao = contactDao; // 전달받은 contactDao로 초기화
    }
}
