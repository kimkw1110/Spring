package ch05_pjt_01.contact;

// ContactSet 클래스 정의
public class ContactSet {
    // 이름과 전화번호를 저장하는 변수 선언
    private String name; // 이름을 저장하는 변수
    private String phoneNumber; // 전화번호를 저장하는 변수

    // 생성자: 이름과 전화번호를 매개변수로 받아 초기화
    public ContactSet(String name, String phoneNumber) {
        this.name = name; // 매개변수로 받은 이름을 name 변수에 저장
        this.phoneNumber = phoneNumber; // 매개변수로 받은 전화번호를 phoneNumber 변수에 저장
    }

    // 이름 Getter 메서드
    public String getName() {
        return name; // name 변수의 값을 반환
    }

    // 이름 Setter 메서드
    public void setName(String name) {
        this.name = name; // 매개변수로 받은 이름을 name 변수에 저장
    }

    // 전화번호 Getter 메서드
    public String getPhoneNumber() {
        return phoneNumber; // phoneNumber 변수의 값을 반환
    }

    // 전화번호 Setter 메서드
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; // 매개변수로 받은 전화번호를 phoneNumber 변수에 저장
    }
}
