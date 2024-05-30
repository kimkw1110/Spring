package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

// ContactRegisterService 클래스 정의
public class ContactRegisterService {
    @Autowired // 자동 주입을 위한 어노테이션
    private ContactDao contactDao; // ContactDao 객체

    // 기본 생성자
    public ContactRegisterService() {
        System.out.println("ContactRegisterService의 default Constructor"); // 생성자 호출 시 출력
    }

    // ContactDao를 파라미터로 받는 생성자
    // @Autowired
    public ContactRegisterService(ContactDao contactDao) {
        System.out.println("ContactDao 파라미터 하나 가진 ContactRegisterService 생성자"); // 생성자 호출 시 출력
        System.out.println("ContactRegisterService에서 contactDao: " + contactDao); // contactDao 출력

        this.contactDao = contactDao; // 주입받은 ContactDao 설정
    }

    // 연락처 등록 메서드
    public void register(ContactSet contactSet) {
        String name = contactSet.getName(); // 이름 추출
        if (verify(name)) { // 이름 중복 확인
            contactDao.insert(contactSet); // 중복이 아니면 연락처 추가
        } else {
            System.out.println("The name has already registered."); // 이미 등록된 이름인 경우 메시지 출력
        }
    }

    // 이름 중복 확인 메서드
    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name); // 이름을 기반으로 연락처 조회
        return contactSet == null ? true : false; // 조회된 결과가 없으면 중복이 아니므로 true 반환
    }

    // ContactDao를 주입하는 setter 메서드
    // @Autowired
    public void setContactDao(ContactDao contactDao) {
        System.out.println("ContactRegisterService의 setContactDao 메서드 호출됨."); // 메서드 호출 시 출력
        this.contactDao = contactDao; // 주입받은 ContactDao 설정
    }

    // ContactDao를 주입하는 다른 setter 메서드
    // @Autowired
    public void setWordDao(ContactDao contactDao) {
        System.out.println("ContactRegisterService의 setWordDao 메서드 호출됨."); // 메서드 호출 시 출력
        this.contactDao = contactDao; // 주입받은 ContactDao 설정
    }
}
