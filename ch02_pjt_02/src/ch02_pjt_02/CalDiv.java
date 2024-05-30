package ch02_pjt_02;

// CalDiv 클래스는 ICalculator 인터페이스를 구현합니다.
// 이 클래스는 두 정수를 나누는 기능을 제공합니다.
public class CalDiv implements ICalculator {

    // @Override 애너테이션을 사용하여 ICalculator 인터페이스의 메서드를 재정의하고 있음을 나타냅니다.
    // 이 메서드는 두 정수를 입력받아 첫 번째 정수를 두 번째 정수로 나누고 그 결과를 반환합니다.
    // 나누는 값이 0일 경우, 0을 반환하도록 예외 처리가 되어 있습니다.
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 두 번째 정수가 0이 아닐 때 첫 번째 정수를 두 번째 정수로 나눕니다.
        // 두 번째 정수가 0이면, 0을 반환하여 0으로 나누는 오류를 방지합니다.
        return secondNum != 0 ? (firstNum / secondNum) : 0;
    }
}
