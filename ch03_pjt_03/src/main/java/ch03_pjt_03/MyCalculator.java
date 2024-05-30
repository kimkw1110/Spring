package ch03_pjt_03;

// 계산을 수행하는 MyCalculator 클래스
public class MyCalculator {
    
    // 기본 생성자
    public MyCalculator() { }
    
    // 두 수와 계산기 객체를 받아서 계산을 수행하는 메서드
    public void calculate(int fNum, int sNum, ICalculator calculator) {
        // 계산기 객체를 사용하여 두 수를 계산하여 결과를 출력
        int value = calculator.doOperation(fNum, sNum);
        System.out.println("result = " + value);
    }
    
}
