package ch03_pjt_03;

// ICalculator 인터페이스를 구현하여 곱셈 연산을 수행하는 CalMul 클래스
public class CalMul implements ICalculator {
    
    // 두 수를 곱하는 연산을 수행하는 메서드
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 두 수를 곱한 결과 반환
        return firstNum * secondNum;
    }

}
