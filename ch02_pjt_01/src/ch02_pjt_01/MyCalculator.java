package ch02_pjt_01;

// MyCalculator 클래스는 여러 계산 작업을 수행하는 메서드를 제공합니다.
// 각 메서드는 ICalculator 인터페이스를 구현하는 클래스의 인스턴스를 사용하여 연산을 수행하고 결과를 출력합니다.
public class MyCalculator {

    // 기본 생성자. 특별한 초기화 작업 없이 객체를 생성합니다.
    public MyCalculator() { }

    // 두 정수를 더하고 결과를 출력하는 메서드.
    public void calAdd(int fNum, int sNum) {
        // CalAdd 클래스의 인스턴스를 생성하고, ICalculator 타입으로 참조합니다.
        ICalculator cal = new CalAdd();
        // 주어진 두 정수를 더하여 결과를 얻습니다.
        int value = cal.doOperation(fNum, sNum);
        // 결과를 출력합니다.
        System.out.println("result = " + value);
    }

    // 두 정수를 빼고 결과를 출력하는 메서드.
    public void calSub(int fNum, int sNum) {
        // CalSub 클래스의 인스턴스를 생성하고, ICalculator 타입으로 참조합니다.
        ICalculator cal = new CalSub();
        // 주어진 두 정수를 빼서 결과를 얻습니다.
        int value = cal.doOperation(fNum, sNum);
        // 결과를 출력합니다.
        System.out.println("result = " + value);
    }

    // 두 정수를 곱하고 결과를 출력하는 메서드.
    public void calMul(int fNum, int sNum) {
        // CalMul 클래스의 인스턴스를 생성하고, ICalculator 타입으로 참조합니다.
        ICalculator calculator = new CalMul();
        // 주어진 두 정수를 곱하여 결과를 얻습니다.
        int value = calculator.doOperation(fNum, sNum);
        // 결과를 출력합니다.
        System.out.println("result : " + value);
    }

    // 두 정수를 나누고 결과를 출력하는 메서드.
    public void calDiv(int fNum, int sNum) {
        // CalDiv 클래스의 인스턴스를 생성하고, ICalculator 타입으로 참조합니다.
        ICalculator calculator = new CalDiv();
        // 주어진 두 정수를 나누어 결과를 얻습니다.
        int value = calculator.doOperation(fNum, sNum);
        // 결과를 출력합니다.
        System.out.println("result : " + value);
    }
}
