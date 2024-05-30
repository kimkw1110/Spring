package ch02_pjt_03;

// ICalculator 인터페이스는 계산기 기능을 제공하는 메서드를 정의합니다.
// 이 인터페이스는 두 개의 정수를 입력받아 어떤 연산을 수행하고 그 결과를 반환하는 메서드를 선언합니다.
public interface ICalculator {

    // doOperation 메서드는 두 정수를 입력받아 특정 연산을 수행하고 그 결과를 반환합니다.
    public int doOperation(int firstNum, int secondNum);
}
