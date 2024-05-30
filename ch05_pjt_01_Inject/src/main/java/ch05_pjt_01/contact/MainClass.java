package ch05_pjt_01.contact; // 패키지 이름을 지정하여 이 클래스가 속한 패키지를 정의

import org.springframework.context.support.GenericXmlApplicationContext; // Spring의 XML 기반 ApplicationContext를 사용
import ch05_pjt_01.contact.service.ContactRegisterService; // 연락처 등록 서비스 클래스 임포트
import ch05_pjt_01.contact.service.ContactSearchService; // 연락처 검색 서비스 클래스 임포트
import ch05_pjt_01.contact.utils.InitSampleData; // 초기화 데이터 유틸리티 클래스 임포트

// MainClass 클래스 정의
public class MainClass {

    // 프로그램의 진입점인 main 메서드
    public static void main(String[] args) {
        // Spring ApplicationContext 생성 및 설정 파일 로드
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");

        // 초기화 데이터를 가져오는 Bean을 얻음
        InitSampleData initob = ctx.getBean("initSampleData", InitSampleData.class);
        String[] names = initob.getNames(); // 이름 배열을 가져옴
        String[] phoneNumbers = initob.getPhoneNumbers(); // 전화번호 배열을 가져옴
        
        // 연락처를 등록하는 서비스를 가져옴
        ContactRegisterService obregis = ctx.getBean("registerService", ContactRegisterService.class);
        
        // 초기화 데이터를 사용하여 연락처를 등록
        for (int i = 0; i < names.length; ++i) {
            ContactSet cs = new ContactSet(names[i], phoneNumbers[i]); // 이름과 전화번호로 ContactSet 객체 생성
            obregis.register(cs); // 생성한 ContactSet 객체를 등록 서비스에 전달
        }
        
        // 연락처를 검색하는 서비스를 가져옴
        ContactSearchService obcss = ctx.getBean("searchService", ContactSearchService.class);

        // 다양한 이름으로 연락처 정보를 검색하여 출력
        ContactSet contactSet = obcss.searchContact("류현진"); // '류현진'이라는 이름을 검색
        System.out.println("name: " + contactSet.getName()); // 검색된 연락처의 이름 출력
        System.out.println("phone number: " + contactSet.getPhoneNumber()); // 검색된 연락처의 전화번호 출력
        System.out.println("------------------------------"); // 구분선 출력
        
        contactSet = obcss.searchContact("손흥민"); // '손흥민'이라는 이름을 검색
        System.out.println("name: " + contactSet.getName());
        System.out.println("phone number: " + contactSet.getPhoneNumber());
        System.out.println("------------------------------");
        
        contactSet = obcss.searchContact("김연경"); // '김연경'이라는 이름을 검색
        System.out.println("name: " + contactSet.getName());
        System.out.println("phone number: " + contactSet.getPhoneNumber());
        System.out.println("------------------------------");

        // Spring ApplicationContext 종료
        ctx.close();
    }
}
