package ch05_pjt_01.contact;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch05_pjt_01.contact.service.ContactRegisterService;
import ch05_pjt_01.contact.service.ContactSearchService;
import ch05_pjt_01.contact.utils.InitSampleData;

// MainClass 클래스 정의
public class MainClass {

    // main 메서드: 프로그램의 시작점
    public static void main(String[] args) {
        // Spring ApplicationContext를 생성하고 설정 파일인 appCtx.xml을 로드
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
        
        // InitSampleData Bean을 가져와서 초기화 데이터를 얻음
        InitSampleData initob = ctx.getBean("initSampleData", InitSampleData.class);
        String[] names = initob.getNames(); // 이름 배열
        String[] phoneNumbers = initob.getPhoneNumbers(); // 전화번호 배열
        
        // ContactRegisterService Bean을 가져옴
        ContactRegisterService obregis = ctx.getBean("registerService", ContactRegisterService.class);
        
        // 초기화 데이터를 사용하여 연락처를 등록
        for(int i = 0; i < names.length; ++i) {
            ContactSet cs = new ContactSet(names[i], phoneNumbers[i]);
            obregis.register(cs);
        }
        
        // ContactSearchService Bean을 가져옴
        ContactSearchService obcss = ctx.getBean("searchService", ContactSearchService.class);
        
        // 특정 이름을 검색하여 연락처 정보를 출력
        ContactSet contactSet = obcss.searchContact("류현진");
        System.out.println("name: " + contactSet.getName());
        System.out.println("phone number: " + contactSet.getPhoneNumber());
        System.out.println("------------------------------");
        
        contactSet = obcss.searchContact("손흥민");
        System.out.println("name: " + contactSet.getName());
        System.out.println("phone number: " + contactSet.getPhoneNumber());
        System.out.println("------------------------------");
        
        contactSet = obcss.searchContact("김연경");
        System.out.println("name: " + contactSet.getName());
        System.out.println("phone number: " + contactSet.getPhoneNumber());
        System.out.println("------------------------------");
        
        ctx.close(); // ApplicationContext를 종료
    }
}
