package ch02_pjt_03;

// CalSub 클래스는 ICalculator 인터페이스를 구현합니다.
// 이 클래스는 두 정수를 입력받아 빼는 기능을 제공합니다.
public class CalSub implements ICalculator {

    // @Override 애너테이션은 이 메서드가 ICalculator 인터페이스의 메서드를 재정의하고 있음을 나타냅니다.
    // 이 메서드는 두 개의 정수를 입력받아 첫 번째 정수에서 두 번째 정수를 빼고 그 결과를 반환합니다.
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 첫 번째 정수에서 두 번째 정수를 빼고 그 결과를 반환합니다.
        return firstNum - secondNum;
    }
}
