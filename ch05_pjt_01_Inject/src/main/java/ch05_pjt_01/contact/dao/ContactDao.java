package ch05_pjt_01.contact.dao; // 패키지 이름을 지정하여 이 클래스가 속한 패키지를 정의

import java.util.HashMap; // HashMap 클래스를 임포트
import java.util.Map; // Map 인터페이스를 임포트

import ch05_pjt_01.contact.ContactSet; // ContactSet 클래스를 임포트

// ContactDao 클래스 정의
public class ContactDao {
    // 연락처를 저장할 Map 객체 선언
    private Map<String, ContactSet> contactDB = new HashMap<String, ContactSet>(); 
    // `HashMap`을 사용하여 연락처 데이터를 저장
    // `String`은 이름(key), `ContactSet`은 연락처(value)

    // 연락처 추가 메서드
    public void insert(ContactSet contactSet) {
        contactDB.put(contactSet.getName(), contactSet); // `ContactSet` 객체를 `contactDB`에 추가
        // `contactSet.getName()`을 key로 하여 해당 연락처를 `contactDB`에 추가
    }

    // 이름을 기반으로 연락처를 조회하는 메서드
    public ContactSet select(String name) {
        return contactDB.get(name); // `contactDB`에서 주어진 이름(key)으로 연락처를 검색하여 반환
    }

    // contactDB 맵 객체 반환 메서드
    public Map<String, ContactSet> getContactDB() {
        return contactDB; // `contactDB`의 전체 맵 객체를 반환
    }
}
