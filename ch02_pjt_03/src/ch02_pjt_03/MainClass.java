package ch02_pjt_03;

// MainClass는 Java 프로그램의 진입점인 main 메서드를 포함합니다.
// 이 클래스는 CalAssembler 클래스의 인스턴스를 생성하여 자동으로 계산 작업을 수행합니다.
public class MainClass {
    
    // main 메서드는 Java 프로그램의 실행 지점입니다.
    public static void main(String[] args) {
        // CalAssembler 클래스의 인스턴스를 생성합니다.
        // CalAssembler는 생성자에서 다양한 계산 작업을 수행합니다.
        new CalAssembler();
    }
}
