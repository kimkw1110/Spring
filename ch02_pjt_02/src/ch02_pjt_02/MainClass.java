package ch02_pjt_02;

// MainClass는 Java 프로그램의 진입점인 main 메서드를 포함합니다.
// 이 클래스는 MyCalculator 클래스의 인스턴스를 사용하여 다양한 계산 작업을 수행합니다.
public class MainClass {
    
    // main 메서드는 프로그램의 진입점이며, 다양한 계산 작업을 테스트합니다.
    public static void main(String[] args) {
        // MyCalculator 클래스의 인스턴스를 생성합니다.
        MyCalculator obcal = new MyCalculator();
        
        // MyCalculator 클래스의 'calculate' 메서드를 호출하여 덧셈을 수행합니다.
        // CalAdd 클래스의 인스턴스를 전달하여 두 정수의 합을 계산합니다.
        obcal.calculate(10, 5, new CalAdd());
        
        // 'calculate' 메서드를 호출하여 뺄셈을 수행합니다.
        // CalSub 클래스의 인스턴스를 전달하여 두 정수의 차이를 계산합니다.
        obcal.calculate(10, 5, new CalSub());
        
        // 'calculate' 메서드를 호출하여 곱셈을 수행합니다.
        // CalMul 클래스의 인스턴스를 전달하여 두 정수를 곱합니다.
        obcal.calculate(10, 5, new CalMul());
        
        // 'calculate' 메서드를 호출하여 나눗셈을 수행합니다.
        // CalDiv 클래스의 인스턴스를 전달하여 두 정수를 나눕니다.
        obcal.calculate(10, 5, new CalDiv());
    }
}
