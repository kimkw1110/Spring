package ch05_pjt_01.contact; // 해당 클래스의 패키지 선언

// Spring ApplicationContext를 사용하여 연락처를 등록하고 검색하는 예제
import org.springframework.context.support.GenericXmlApplicationContext; // Spring의 XML 기반 컨텍스트
import ch05_pjt_01.contact.service.ContactRegisterService; // 연락처 등록 서비스 클래스 import
import ch05_pjt_01.contact.service.ContactSearchService; // 연락처 검색 서비스 클래스 import
import ch05_pjt_01.contact.utils.InitSampleData; // 샘플 데이터를 초기화하는 유틸리티 클래스 import

public class MainClass { // 프로그램 실행을 위한 메인 클래스

    public static void main(String[] args) { // 프로그램의 진입점, 메인 메서드
        // Spring ApplicationContext를 XML 설정 파일을 통해 초기화
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml"); 
        
        // 샘플 데이터를 초기화하는 Bean을 가져옴
        InitSampleData initob = ctx.getBean("initSampleData", InitSampleData.class); 
        // 샘플 데이터의 이름과 전화번호를 가져옴
        String[] names = initob.getNames(); 
        String[] phoneNumbers = initob.getPhoneNumbers(); 
        
        // 연락처 등록 서비스를 가져옴
        ContactRegisterService obregis = ctx.getBean("registerService", ContactRegisterService.class); 
        
        // 샘플 데이터를 사용하여 연락처를 등록
        for(int i = 0; i < names.length; ++i) { // 이름과 전화번호를 반복
            ContactSet cs = new ContactSet(names[i], phoneNumbers[i]); // 새로운 ContactSet 생성
            obregis.register(cs); // 연락처 등록 서비스에 등록
        }
        
        // 연락처 검색 서비스를 가져옴
        ContactSearchService obcss = ctx.getBean("searchService", ContactSearchService.class); 
        
        // "류현진" 이름의 연락처를 검색하고 출력
        ContactSet contactSet = obcss.searchContact("류현진"); 
        System.out.println("name: " + contactSet.getName()); // 이름 출력
        System.out.println("phone number: " + contactSet.getPhoneNumber()); // 전화번호 출력
        System.out.println("------------------------------");
        
        // "손흥민" 이름의 연락처를 검색하고 출력
        contactSet = obcss.searchContact("손흥민"); 
        System.out.println("name: " + contactSet.getName()); 
        System.out.println("phone number: " + contactSet.getPhoneNumber()); 
        System.out.println("------------------------------");
        
        // "김연경" 이름의 연락처를 검색하고 출력
        contactSet = obcss.searchContact("김연경"); 
        System.out.println("name: " + contactSet.getName()); 
        System.out.println("phone number: " + contactSet.getPhoneNumber()); 
        System.out.println("------------------------------");
        
        // ApplicationContext를 종료
        ctx.close(); 
    }
}
