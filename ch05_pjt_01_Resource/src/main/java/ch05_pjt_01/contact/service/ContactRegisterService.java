package ch05_pjt_01.contact.service; // 해당 클래스의 패키지 선언

import javax.annotation.Resource; // 리소스 자동 주입을 위한 어노테이션
import org.springframework.beans.factory.annotation.Autowired; // 스프링 자동 주입 어노테이션
import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스 import
import ch05_pjt_01.contact.dao.ContactDao; // ContactDao 클래스 import

// 연락처 등록 서비스 클래스
public class ContactRegisterService {
    // ContactDao를 자동 주입하기 위한 선언
    // @Resource
    private ContactDao contactDao; // ContactDao 객체
    
    // 기본 생성자
    public ContactRegisterService() {
        System.out.println("ContactRegisterService의 default Constructor"); // 생성자 호출 시 메시지 출력
    }
    
    // ContactDao를 파라미터로 받는 생성자
    // @Autowired
    public ContactRegisterService(ContactDao contactDao) { 
        System.out.println("ContactDao 파라미터 하나 가진 ContactRegisterService 생성자");
        System.out.println("ContactRegisterService에서 contactDao: " + contactDao); // 생성자 호출 시 주입된 ContactDao 출력
        this.contactDao = contactDao; // 전달받은 ContactDao를 멤버 변수로 설정
    }

    // 연락처를 등록하는 메서드
    public void register(ContactSet contactSet) { 
        String name = contactSet.getName(); // 등록할 연락처의 이름 추출
        if (verify(name)) { // 이름 중복 여부를 확인
            contactDao.insert(contactSet); // 중복이 아니면 ContactDao에 연락처 추가
        } else {
            System.out.println("The name has already registered."); // 중복일 경우 메시지 출력
        }
    }

    // 이름의 중복 여부를 확인하는 메서드
    public boolean verify(String name) { 
        ContactSet contactSet = contactDao.select(name); // 이름을 기준으로 ContactDao에서 검색
        return contactSet == null ? true : false; // 검색 결과가 null이면 중복이 아니므로 true 반환
    }

    // ContactDao를 자동 주입하는 setter 메서드
    @Resource // Resource 어노테이션을 사용하여 자동 주입
    public void setContactDao(ContactDao contactDao) { 
        System.out.println("ContactRegisterService의 setContactDao 메서드 호출됨."); // 메서드 호출 시 메시지 출력
        this.contactDao = contactDao; // 전달받은 ContactDao를 멤버 변수로 설정
    }

    // ContactDao를 자동 주입하는 또 다른 setter 메서드
    @Resource // Resource 어노테이션을 사용하여 자동 주입
    public void setWordDao(ContactDao contactDao) { 
        System.out.println("ContactRegisterService의 setWordDao 메서드 호출됨."); // 메서드 호출 시 메시지 출력
        this.contactDao = contactDao; // 전달받은 ContactDao를 멤버 변수로 설정
    }
}
