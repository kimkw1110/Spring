package ch02_pjt_02;

// MyCalculator 클래스는 다양한 계산 작업을 수행할 수 있는 메서드를 제공합니다.
// 이 클래스는 ICalculator 인터페이스를 구현하는 객체를 사용하여 연산을 수행합니다.
public class MyCalculator {

    // 기본 생성자. 특별한 초기화 작업 없이 객체를 생성합니다.
    public MyCalculator() { }

    // calculate 메서드는 두 개의 정수를 입력받아 ICalculator 인터페이스를 구현하는 객체와 함께 연산을 수행합니다.
    public void calculate(int fNum, int sNum, ICalculator calculator) {
        // ICalculator 인터페이스를 구현하는 객체를 사용하여 연산을 수행합니다.
        int value = calculator.doOperation(fNum, sNum);
        
        // 계산 결과를 출력합니다.
        System.out.println("result = " + value);
    }
}
