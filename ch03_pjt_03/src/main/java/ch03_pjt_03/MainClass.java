package ch03_pjt_03;

import org.springframework.context.support.GenericXmlApplicationContext;

// MainClass 클래스
public class MainClass {
    // main 메서드
    public static void main(String[] args) {
    	// new CalAssembler();
    	
        // Spring 컨테이너 생성
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        
        // applicationContext.xml에서 calAssembler 빈을 가져와서 calAssembler 변수에 할당
        CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
        
        // calAssembler의 assemble 메서드 호출
        calAssembler.assemble();
        
        // Spring 컨테이너 종료
        ctx.close();
    }
}
