package ch04_pjt_02.scope;

import org.springframework.context.support.GenericXmlApplicationContext;

// MainClass 클래스 정의
public class MainClass {

	// Main 메서드
	public static void main(String[] args) {

		// ApplicationContext를 XML 파일로부터 로드하는 GenericXmlApplicationContext 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		// 두 개의 DependencyBean 인스턴스 생성하여 ApplicationContext에서 가져옴
		DependencyBean dependencyBean_01 = ctx.getBean("dependencyBean", DependencyBean.class);
		DependencyBean dependencyBean_02 = ctx.getBean("dependencyBean", DependencyBean.class);

		// 두 개의 DependencyBean 인스턴스가 동일한지 비교
		if (dependencyBean_01.equals(dependencyBean_02)) {
			System.out.println("dependencyBean_01 == dependencyBean_02"); // 두 개의 인스턴스가 동일함을 출력

		} else {
			System.out.println("dependencyBean_01 != dependencyBean_02"); // 두 개의 인스턴스가 동일하지 않음을 출력

		}

		// ApplicationContext 종료
		ctx.close();
	}
}
