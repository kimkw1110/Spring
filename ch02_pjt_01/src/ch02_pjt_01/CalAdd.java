package ch02_pjt_01;

// CalAdd 클래스는 ICalculator 인터페이스를 구현합니다.
// 이 클래스는 두 정수를 더하는 기능을 제공합니다.
public class CalAdd implements ICalculator {

    // @Override 애너테이션을 사용하여 ICalculator 인터페이스의 메서드를 재정의하고 있다는 것을 나타냅니다.
    // 이 메서드는 두 개의 정수를 입력받아 그 합을 반환합니다.
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 두 입력값을 더하여 'sum' 변수에 저장합니다.
        int sum = firstNum + secondNum;

        // 합계를 반환합니다.
        return sum;
    }
}
