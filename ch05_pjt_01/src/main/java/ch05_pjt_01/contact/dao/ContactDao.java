package ch05_pjt_01.contact.dao;

import java.util.HashMap;
import java.util.Map;

import ch05_pjt_01.contact.ContactSet;

// ContactDao 클래스 정의
public class ContactDao {
    // 연락처를 저장할 Map 객체 선언
    private Map<String, ContactSet> contactDB = new HashMap<String, ContactSet>();

    // 연락처 추가 메서드
    public void insert(ContactSet contactSet) {
        contactDB.put(contactSet.getName(), contactSet); // 이름을 key로 하여 연락처 추가
    }

    // 이름을 기반으로 연락처를 조회하는 메서드
    public ContactSet select(String name) {
        return contactDB.get(name); // 이름을 key로하여 연락처 검색
    }

    // contactDB 맵 객체 반환 메서드
    public Map<String, ContactSet> getContactDB() {
        return contactDB; // contactDB 맵 객체 반환
    }
}
