package ch05_pjt_01.contact; // 클래스가 속한 패키지 선언

// 연락처를 나타내는 클래스
public class ContactSet { 
    // 인스턴스 변수 선언
    private String name; // 연락처의 이름을 저장
    private String phoneNumber; // 연락처의 전화번호를 저장

    // 생성자: 이름과 전화번호를 매개변수로 받아 초기화
    public ContactSet(String name, String phoneNumber) {
        this.name = name; // 전달받은 이름을 인스턴스 변수에 저장
        this.phoneNumber = phoneNumber; // 전달받은 전화번호를 인스턴스 변수에 저장
    }

    // 이름을 반환하는 게터 메서드
    public String getName() { 
        return name; // 이름을 반환
    }

    // 이름을 설정하는 세터 메서드
    public void setName(String name) { 
        this.name = name; // 전달받은 이름을 인스턴스 변수에 설정
    }

    // 전화번호를 반환하는 게터 메서드
    public String getPhoneNumber() { 
        return phoneNumber; // 전화번호를 반환
    }

    // 전화번호를 설정하는 세터 메서드
    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber; // 전달받은 전화번호를 인스턴스 변수에 설정
    }
}
