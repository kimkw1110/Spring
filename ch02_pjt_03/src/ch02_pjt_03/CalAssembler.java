package ch02_pjt_03;

// CalAssembler 클래스는 MyCalculator와 여러 연산 클래스(CalAdd, CalSub, CalMul, CalDiv)를 조립하여
// 다양한 계산 작업을 수행하는 기능을 제공합니다.
public class CalAssembler {
    // 이 클래스는 MyCalculator 인스턴스를 사용하여 계산 작업을 수행합니다.
    MyCalculator calculator;
    // 다양한 연산을 수행할 수 있도록 각 연산 클래스를 인스턴스 변수로 선언합니다.
    CalAdd calAdd;
    CalSub calSub;
    CalMul calMul;
    CalDiv calDiv;

    // 기본 생성자. MyCalculator 및 각 연산 클래스의 인스턴스를 초기화하고,
    // 계산 작업을 자동으로 수행하도록 `assemble` 메서드를 호출합니다.
    public CalAssembler() {
        calculator = new MyCalculator();
        calAdd = new CalAdd();
        calSub = new CalSub();
        calMul = new CalMul();
        calDiv = new CalDiv();
        
        // assemble 메서드를 호출하여 다양한 연산 작업을 수행합니다.
        assemble();
    }

    // assemble 메서드는 MyCalculator 인스턴스와 다양한 연산 클래스를 사용하여
    // 다양한 계산 작업을 수행합니다.
    public void assemble() {
        // MyCalculator의 `calculate` 메서드를 사용하여 10과 5를 더합니다.
        calculator.calculate(10, 5, calAdd);
        // 10에서 5를 뺍니다.
        calculator.calculate(10, 5, calSub);
        // 10과 5를 곱합니다.
        calculator.calculate(10, 5, calMul);
        // 10을 5로 나눕니다.
        calculator.calculate(10, 5, calDiv);     
    }
}
