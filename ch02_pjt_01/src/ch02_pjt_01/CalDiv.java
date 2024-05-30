package ch02_pjt_01;

// CalDiv 클래스는 ICalculator 인터페이스를 구현합니다.
// 이 클래스는 두 정수를 입력받아 나누는 기능을 제공합니다.
public class CalDiv implements ICalculator {

    // @Override 애너테이션을 사용하여 ICalculator 인터페이스의 메서드를 재정의하고 있다는 것을 나타냅니다.
    // 이 메서드는 두 개의 정수를 입력받아 첫 번째 정수를 두 번째 정수로 나누고 그 결과를 반환합니다.
    // 나눗셈의 경우, 두 번째 정수가 0이 아니어야 합니다.
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 두 번째 정수가 0이 아닐 경우, 첫 번째 정수를 두 번째 정수로 나누고 그 값을 반환합니다.
        // 만약 두 번째 정수가 0일 경우, 0을 반환합니다.
        return secondNum != 0 ? (firstNum / secondNum) : 0;
    }
}
