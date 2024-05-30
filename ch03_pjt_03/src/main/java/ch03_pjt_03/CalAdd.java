package ch03_pjt_03;

// ICalculator 인터페이스를 구현하는 CalAdd 클래스
public class CalAdd implements ICalculator {
    // 기본 생성자
    public CalAdd() {
        System.out.println("CalAdd 기본생성자 호출됨");
    } // Default Constructor

    // 두 수를 더하는 연산을 수행하는 메서드
    @Override
    public int doOperation(int firstNum, int secondNum) {
        int sum = firstNum + secondNum; // 두 수를 더한 결과
        return sum; // 결과 반환
    }
}
