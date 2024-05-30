package ch04_pjt_02.scope;

// DependencyBean 클래스 정의
public class DependencyBean {
    
    // InjectionBean 타입의 멤버 변수 선언
	InjectionBean injectionBean;
    
    // DependencyBean 클래스의 생성자
    public DependencyBean(InjectionBean injectionBean) {
        // 생성자 매개변수로 전달된 injectionBean을 멤버 변수에 할당
        this.injectionBean = injectionBean;
    }
}
