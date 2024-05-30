package ch06_pjt_01.ems;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ch06_pjt_01.ems.configuration.MemberConfig;
import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.service.EMSInformationService;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

public class MainClassUseConfig {
    public static void main(String[] args) {
    	// AnnotationConfigApplicationContext를 사용하여 Spring 애플리케이션 컨텍스트 로딩
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfig.class);
    	
    	// 아래 주석 처리된 코드는 XML 파일을 사용하여 컨텍스트를 로딩하는 다른 방법들을 보여줌
    	// GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
    	// GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx1.xml", "classpath:appCtx2.xml", "classpath:appCtx3.xml");
        // GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtxImport.xml");

        // 샘플 데이터 초기화
        InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);

        // 샘플 데이터 추출
        String[] sNums = initSampleData.getsNums();
        String[] sIds = initSampleData.getsIds();
        String[] sPws = initSampleData.getsPws();
        String[] sNames = initSampleData.getsNames();
        int[] sAges = initSampleData.getsAges();
        char[] sGenders = initSampleData.getsGenders();
        String[] sMajors = initSampleData.getsMajors();

        // 데이터베이스에 샘플 데이터 등록
        StudentRegisterService registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);

        // 각 학생 데이터를 등록
        for (int i = 0; i < sNums.length; i++) {
            registerService.register(new Student(sNums[i], sIds[i], sPws[i], sNames[i], sAges[i], sGenders[i], sMajors[i]));
        }

        // 학생 정보를 출력하는 서비스 객체 생성
        PrintStudentInformationService psi = ctx.getBean("printStudentInformationService", PrintStudentInformationService.class);
        psi.printStudentInfo(); // 학생 리스트를 전부 출력

        // 새로운 학생 등록
        registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
        registerService.register(new Student("hbs006", "dear", "p0006", "melissa", 26, 'W', "Music"));
        psi.printStudentInfo(); // 학생 리스트를 전부 출력

        // 특정 학번에 해당하는 학생 한 명만 검색하고 출력
        StudentSelectService studentSelectService = ctx.getBean("studentSelectService", StudentSelectService.class);
        Student selectedstudent = studentSelectService.select("hbs006");

        System.out.println("STUDENT START ------------------");
        System.out.print("sNum:" + selectedstudent.getsNum() + "\t");
        System.out.print("|sId:" + selectedstudent.getsId() + "\t");
        System.out.print("|sPw:" + selectedstudent.getsPw() + "\t");
        System.out.print("|sName:" + selectedstudent.getsName() + "\t");
        System.out.print("|sAge:" + selectedstudent.getsAge() + "\t");
        System.out.print("|sGender:" + selectedstudent.getsGender() + "\t");
        System.out.println("|sMajor:" + selectedstudent.getsMajor());
        System.out.println("END ----------------------------");

        // 특정 학번에 해당하는 학생의 정보를 수정하고 출력
        StudentModifyService modifyService = ctx.getBean("studentModifyService", StudentModifyService.class);
        modifyService.modify(new Student("hbs006", "pig", "p0066", "melissa", 27, 'W', "Computer"));
        psi.printStudentInfo(); // 학생 리스트를 전부 출력

        // 특정 학번에 해당하는 학생의 정보를 삭제하고 출력
        StudentDeleteService deleteService = ctx.getBean("studentDeleteService", StudentDeleteService.class);
        deleteService.delete("hbs005");
        psi.printStudentInfo(); // 학생 리스트를 전부 출력
        
        // EMSInformationService를 이용하여 EMS(연락처 관리 시스템) 정보 출력
        EMSInformationService emsInformationService = ctx.getBean("eMSInformationService", EMSInformationService.class);
        emsInformationService.printEMSInformation();
        
        // ApplicationContext 종료
        ctx.close();
    } // end of main()
}
