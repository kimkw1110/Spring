package ch05_pjt_01.contact.dao; // 해당 클래스의 패키지 선언

import java.util.HashMap; // HashMap 클래스를 import
import java.util.Map; // Map 인터페이스를 import
import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스를 import

// 연락처를 관리하는 데이터 액세스 객체
public class ContactDao {
    // 연락처를 저장하기 위한 Map 데이터 구조
    private Map<String, ContactSet> contactDB = new HashMap<String, ContactSet>(); // 이름을 키로 하는 HashMap 선언

    // 연락처를 추가하는 메서드
    public void insert(ContactSet contactSet) { 
        contactDB.put(contactSet.getName(), contactSet); // 이름을 키로 하여 연락처를 Map에 추가
    }

    // 이름을 기준으로 연락처를 검색하는 메서드
    public ContactSet select(String name) { 
        return contactDB.get(name); // 이름을 키로 하여 Map에서 해당 연락처를 검색하고 반환
    }

    // 연락처를 저장하는 Map을 반환하는 메서드
    public Map<String, ContactSet> getContactDB() { 
        return contactDB; // 전체 연락처를 저장하는 Map을 반환
    }
}
