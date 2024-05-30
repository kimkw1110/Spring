package ch05_pjt_01.contact.service; // 패키지 이름을 지정하여 이 클래스가 속한 패키지를 정의

import javax.inject.Inject; // `@Inject` 어노테이션을 임포트
import javax.inject.Named; // `@Named` 어노테이션을 임포트

import org.springframework.beans.factory.annotation.Autowired; // Spring의 의존성 주입 관련 클래스 임포트

import ch05_pjt_01.contact.ContactSet; // `ContactSet` 클래스 임포트
import ch05_pjt_01.contact.dao.ContactDao; // `ContactDao` 클래스 임포트

// ContactRegisterService 클래스 정의
public class ContactRegisterService {
    @Inject // 의존성 자동 주입을 위한 어노테이션
    @Named("contactDao3") // 주입할 빈(Bean)의 이름을 지정
    private ContactDao contactDao; // `ContactDao` 객체 선언

    // 기본 생성자
    public ContactRegisterService() {
        System.out.println("ContactRegisterService의 default Constructor"); // 기본 생성자 호출 시 출력
    }

    // ContactDao를 파라미터로 받는 생성자
    // @Inject
    public ContactRegisterService(ContactDao contactDao) {
        System.out.println("ContactDao 파라미터 하나 가진 ContactRegisterService 생성자"); // 파라미터 생성자 호출 시 출력
        System.out.println("ContactRegisterService에서 contactDao: " + contactDao); // 주입받은 `ContactDao` 출력

        this.contactDao = contactDao; // 주입받은 `ContactDao`를 설정
    }

    // 연락처 등록 메서드
    public void register(ContactSet contactSet) {
        String name = contactSet.getName(); // `ContactSet`에서 이름 추출
        if (verify(name)) { // 이름이 중복인지 확인
            contactDao.insert(contactSet); // 중복이 아니면 `ContactDao`에 추가
        } else {
            System.out.println("The name has already registered."); // 이미 등록된 이름인 경우 경고 메시지 출력
        }
    }

    // 이름 중복 확인 메서드
    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name); // `ContactDao`에서 이름으로 연락처 검색
        return contactSet == null; // 결과가 없으면 중복이 아님 (true), 결과가 있으면 중복 (false)
    }

    // ContactDao를 주입하는 세터(setter) 메서드
    // @Inject
    public void setContactDao(ContactDao contactDao) {
        System.out.println("ContactRegisterService의 setContactDao 메서드 호출됨."); // 세터 메서드 호출 시 출력
        this.contactDao = contactDao; // 주입받은 `ContactDao`를 설정
    }

    // ContactDao를 주입하는 다른 세터(setter) 메서드
    // @Inject
    public void setWordDao(ContactDao contactDao) {
        System.out.println("ContactRegisterService의 setWordDao 메서드 호출됨."); // 세터 메서드 호출 시 출력
        this.contactDao = contactDao; // 주입받은 `ContactDao`를 설정
    }
}
