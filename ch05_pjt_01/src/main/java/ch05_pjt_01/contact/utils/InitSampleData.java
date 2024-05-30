package ch05_pjt_01.contact.utils; // ch05_pjt_01.contact.utils 패키지에 속한 InitSampleData 클래스

// 샘플 데이터를 초기화하는 유틸리티 클래스
public class InitSampleData {
    private String[] names; // 문자열 배열을 저장하는 변수, 연락처의 이름을 담음
    private String[] phoneNumbers; // 문자열 배열을 저장하는 변수, 연락처의 전화번호를 담음
    
    // 기본 생성자
    public InitSampleData() {
        System.out.println("InitSampleData의 기본 생성자"); // 생성자 호출 시 출력
    }
    
    // names 배열의 값을 반환하는 메서드
    public String[] getNames() {
        return names; // names 배열 반환
    }
    
    // names 배열의 값을 설정하는 메서드
    public void setNames(String[] names) {
        this.names = names; // 전달받은 배열을 names 변수에 저장
    }
    
    // phoneNumbers 배열의 값을 반환하는 메서드
    public String[] getPhoneNumbers() {
        return phoneNumbers; // phoneNumbers 배열 반환
    }
    
    // phoneNumbers 배열의 값을 설정하는 메서드
    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers; // 전달받은 배열을 phoneNumbers 변수에 저장
    }
}
