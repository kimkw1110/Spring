package ch02_pjt_01;

// MainClass는 자바 애플리케이션의 실행 지점인 main 메서드를 포함합니다.
// 이 클래스는 MyCalculator 클래스의 메서드를 사용하여 사칙연산을 테스트합니다.
public class MainClass {
    // main 메서드는 자바 프로그램의 진입점입니다.
    public static void main(String[] args) {
        // MyCalculator 클래스의 인스턴스를 생성합니다.
        MyCalculator obcal = new MyCalculator();
        
        // 두 정수를 더하는 메서드를 호출하고 결과를 확인합니다.
        obcal.calAdd(10, 5);
        
        // 두 정수를 빼는 메서드를 호출하고 결과를 확인합니다.
        obcal.calSub(10, 5);
        
        // 두 정수를 곱하는 메서드를 호출하고 결과를 확인합니다.
        obcal.calMul(10, 5);
        
        // 두 정수를 나누는 메서드를 호출하고 결과를 확인합니다.
        obcal.calDiv(10, 5);
    }
}
