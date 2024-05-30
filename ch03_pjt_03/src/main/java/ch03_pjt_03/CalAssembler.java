package ch03_pjt_03;

// 계산기를 조립하는 역할을 하는 CalAssembler 클래스
public class CalAssembler {
    MyCalculator calculator; // MyCalculator 객체
    CalAdd calAdd; // CalAdd 객체
    CalSub calSub; // CalSub 객체
    CalMul calMul; // CalMul 객체
    CalDiv calDiv; // CalDiv 객체
    
    // 생성자
    public CalAssembler(MyCalculator calculator, CalAdd calAdd, CalSub calSub, CalMul calMul, CalDiv calDiv) {
        // 매개변수로 받은 객체들로 초기화
        this.calculator = calculator;
        this.calAdd = calAdd;
        this.calSub = calSub;
        this.calMul = calMul;
        this.calDiv = calDiv;
    }
    
//	public CalAssembler() {
//		calculator = new MyCalculator();
//		calAdd = new CalAdd();
//		calSub = new CalSub();
//		calMul = new CalMul();
//		calDiv = new CalDiv();
// 
//		assemble();
//	} 
    
    // 계산기를 조립하는 메서드
    public void assemble() {
        // 각 연산에 대해 계산기의 calculate 메서드를 호출하여 연산을 수행
        calculator.calculate(10, 5, calAdd);
        calculator.calculate(10, 5, calSub);
        calculator.calculate(10, 5, calMul);
        calculator.calculate(10, 5, calDiv);     
    }
}
