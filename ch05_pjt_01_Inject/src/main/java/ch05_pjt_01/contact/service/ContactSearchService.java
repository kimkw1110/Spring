package ch05_pjt_01.contact.service; // 패키지 이름을 지정하여 이 클래스가 속한 패키지를 정의

import javax.inject.Inject; // 의존성 주입을 위한 `@Inject` 어노테이션 임포트
import javax.inject.Named; // 주입할 빈(Bean)의 이름을 지정하는 `@Named` 어노테이션 임포트

import org.springframework.beans.factory.annotation.Autowired; // 의존성 주입을 위한 Spring 클래스 임포트

import ch05_pjt_01.contact.ContactSet; // 연락처 정보를 저장하는 `ContactSet` 클래스 임포트
import ch05_pjt_01.contact.dao.ContactDao; // 연락처 데이터 액세스를 위한 `ContactDao` 인터페이스 임포트

// 연락처 검색 서비스 클래스 정의
public class ContactSearchService {
    @Inject // 의존성 자동 주입을 위한 어노테이션
    @Named("contactDao3") // 주입할 빈의 이름을 지정
    private ContactDao contactDao; // `ContactDao` 객체 선언
    
    // 기본 생성자
    public ContactSearchService() {
        System.out.println("ContactSearchService 의 default Constructor"); // 기본 생성자 호출 시 출력
    }

    // `ContactDao`를 파라미터로 받는 생성자
    // @Inject
    public ContactSearchService(ContactDao contactDao) {
        System.out.println("ContactDao 파라미터 하나 가진 ContactSearchService 생성자"); // 파라미터 생성자 호출 시 출력
        System.out.println("ContactSearchService에서 contactDao: " + contactDao); // 주입받은 `ContactDao` 출력
        this.contactDao = contactDao; // 주입받은 `ContactDao` 설정
    }

    // 이름을 기준으로 연락처를 검색하는 메서드
    public ContactSet searchContact(String name) {
        if (verify(name)) { // 이름이 존재하는지 확인
            return contactDao.select(name); // `ContactDao`에서 해당 이름의 연락처를 반환
        } else {
            System.out.println("Contact information is not available."); // 이름이 존재하지 않는 경우 메시지 출력
        }
        return null; // 이름이 없을 경우 `null` 반환
    }

    // 이름의 존재 여부를 확인하는 메서드
    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name); // `ContactDao`에서 해당 이름으로 연락처를 조회
        return contactSet != null; // 결과가 있으면 `true`, 없으면 `false` 반환
    }

    // `ContactDao`를 주입하는 세터(setter) 메서드
    // @Inject
    public void setContactDao(ContactDao contactDao) {
        System.out.println("ContactSearchService의 setContactDao 메서드 호출됨."); // 세터 메서드 호출 시 출력
        this.contactDao = contactDao; // 주입받은 `ContactDao` 설정
    }
}
