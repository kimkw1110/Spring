package ch02_pjt_01;

// ICalculator 인터페이스는 계산기 기능을 제공합니다.
// 이 인터페이스는 두 개의 정수를 입력받아 어떤 연산을 수행하는 메서드를 정의합니다.
public interface ICalculator {
    // doOperation 메서드는 두 개의 정수를 입력받아 어떤 연산을 수행한 후, 그 결과를 반환합니다.
    // 각 구현 클래스는 이 메서드를 재정의하여 원하는 연산을 구현할 수 있습니다.
    public int doOperation(int firstNum, int secondNum);
}
