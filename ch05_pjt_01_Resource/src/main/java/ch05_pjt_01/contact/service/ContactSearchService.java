package ch05_pjt_01.contact.service; // 해당 클래스의 패키지 선언

import javax.annotation.Resource; // Resource 어노테이션을 사용하여 자동 주입
import org.springframework.beans.factory.annotation.Autowired; // 스프링의 의존성 주입을 위한 어노테이션
import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스 import
import ch05_pjt_01.contact.dao.ContactDao; // ContactDao 클래스 import

// 연락처를 검색하는 서비스 클래스
public class ContactSearchService {
    // ContactDao 객체를 자동 주입하기 위한 선언
    // @Resource
    private ContactDao contactDao; // ContactDao 객체, 연락처 데이터베이스 역할
    
    // 기본 생성자
    public ContactSearchService() {
        System.out.println("ContactSearchService의 default Constructor"); // 생성자 호출 시 메시지 출력
    }

    // ContactDao를 파라미터로 받는 생성자
    // @Autowired
    public ContactSearchService(ContactDao contactDao) { 
        System.out.println("ContactDao 파라미터 하나 가진 ContactSearchService 생성자");
        System.out.println("ContactSearchService에서 contactDao: " + contactDao); // 주입된 ContactDao 출력
        this.contactDao = contactDao; // 전달받은 ContactDao를 멤버 변수로 설정
    }

    // 이름을 기준으로 연락처를 검색하는 메서드
    public ContactSet searchContact(String name) { 
        if (verify(name)) { // 이름의 존재 여부를 확인
            return contactDao.select(name); // 존재할 경우 해당 연락처 반환
        } else {
            System.out.println("Contact information is not available."); // 이름이 존재하지 않을 경우 메시지 출력
        }
        return null; // 해당하는 이름이 없을 경우 null 반환
    }

    // 이름의 존재 여부를 확인하는 메서드
    public boolean verify(String name) { 
        ContactSet contactSet = contactDao.select(name); // ContactDao를 통해 이름을 조회
        return contactSet != null; // 조회 결과가 null이 아니면 true 반환
    }

    // ContactDao를 주입하는 setter 메서드
    @Resource // Resource 어노테이션을 사용하여 자동 주입
    public void setContactDao(ContactDao contactDao) {
        System.out.println("ContactSearchService의 setContactDao 메서드 호출됨."); // 메서드 호출 시 메시지 출력
        this.contactDao = contactDao; // 전달받은 ContactDao를 멤버 변수로 설정
    }
}
