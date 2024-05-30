package ch05_pjt_01.contact.utils; // 해당 클래스가 포함된 패키지 선언

// 샘플 데이터를 초기화하고 관리하는 유틸리티 클래스
public class InitSampleData {
    private String[] names; // 연락처 이름 배열
    private String[] phoneNumbers; // 연락처 전화번호 배열

    // 기본 생성자
    public InitSampleData() {
        System.out.println("InitSampleData의 기본 생성자"); // 생성자 호출 시 메시지 출력
    }
    
    // 이름 배열을 반환하는 메서드
    public String[] getNames() { 
        return names; // names 배열 반환
    }

    // 이름 배열을 설정하는 메서드
    public void setNames(String[] names) { 
        this.names = names; // 전달받은 배열을 names에 저장
    }

    // 전화번호 배열을 반환하는 메서드
    public String[] getPhoneNumbers() { 
        return phoneNumbers; // phoneNumbers 배열 반환
    }

    // 전화번호 배열을 설정하는 메서드
    public void setPhoneNumbers(String[] phoneNumbers) { 
        this.phoneNumbers = phoneNumbers; // 전달받은 배열을 phoneNumbers에 저장
    }
}
