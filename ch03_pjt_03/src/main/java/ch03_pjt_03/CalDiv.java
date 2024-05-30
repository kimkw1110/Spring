package ch03_pjt_03;

// ICalculator 인터페이스를 구현하여 나눗셈 연산을 수행하는 CalDiv 클래스
public class CalDiv implements ICalculator {
    
    // 두 수를 나누는 연산을 수행하는 메서드
    @Override
    public int doOperation(int firstNum, int secondNum) {
        // 두 번째 수가 0이 아닌 경우에만 나눗셈을 수행하고 그렇지 않으면 0을 반환
        return secondNum != 0 ? (firstNum / secondNum) : 0;
    }

}
