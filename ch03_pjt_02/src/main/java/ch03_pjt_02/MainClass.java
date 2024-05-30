package ch03_pjt_02;

// Spring 프레임워크의 GenericXmlApplicationContext를 가져옵니다.
import org.springframework.context.support.GenericXmlApplicationContext;

// MainClass는 Java 프로그램의 진입점인 main 메서드를 포함합니다.
public class MainClass {

    // main 메서드는 Java 애플리케이션의 실행 지점입니다.
    public static void main(String[] args) {
        // 주석 처리된 부분은 TransportationWalk 객체를 직접 생성하고 move 메서드를 호출합니다.
        // TransportationWalk tw = new TransportationWalk();
        // tw.move();

        // Spring의 GenericXmlApplicationContext를 사용하여 XML 설정 파일에서 애플리케이션 컨텍스트를 로드합니다.
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        
        // Spring 컨텍스트에서 "tw"라는 이름의 Bean을 가져옵니다. 
        // 이 Bean은 TransportationWalk 클래스로 캐스팅됩니다.
        TransportationWalk obtw = ctx.getBean("tw", TransportationWalk.class);
        
        // 가져온 TransportationWalk 객체의 move 메서드를 호출합니다.
        obtw.move();

        // 애플리케이션 컨텍스트를 닫아 리소스를 정리합니다.
        ctx.close();
    }
}
