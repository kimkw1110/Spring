package ch03_pjt_03;

// ICalculator 인터페이스를 구현하여 뺄셈 연산을 수행하는 CalSub 클래스
public class CalSub implements ICalculator {
    
    // 두 수를 빼는 연산을 수행하는 메서드
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 첫 번째 수에서 두 번째 수를 뺀 결과 반환
    	// int res = firstNum - secondNum;
        return firstNum - secondNum;
    }

}
