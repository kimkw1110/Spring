package ch03_pjt_01;

// MainClass는 Java 애플리케이션의 실행 지점인 main 메서드를 포함합니다.
// 이 클래스는 TransportationWalk 클래스를 사용하여 "move" 작업을 수행합니다.
public class MainClass {

    // main 메서드는 Java 프로그램의 진입점입니다.
    public static void main(String[] args) {
        // TransportationWalk 클래스의 인스턴스를 생성합니다.
        TransportationWalk tw = new TransportationWalk();
        
        // TransportationWalk 클래스의 "move" 메서드를 호출하여 동작을 수행합니다.
        tw.move();
    }
}
