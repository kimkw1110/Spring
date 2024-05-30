package ch06_pjt_01.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ch06_pjt_01.ems.member.dao.StudentDao;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentAllSelectService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

// Spring Configuration 클래스
@Configuration
@Import({ MemberConfig2.class, MemberConfig3.class }) // 다른 두 개의 구성 클래스를 가져옴
public class MemberConfigImport {
	
    // 샘플 데이터를 생성하는 Bean
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData(); // InitSampleData 객체 생성
        
        // 학번, ID, 비밀번호, 이름, 나이, 성별, 전공을 설정
		String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"}; // 학번
		initSampleData.setsNums(sNums);
		
		String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"}; // ID
		initSampleData.setsIds(sIds);
		
		String[] sPws = {"p0001", "p0002", "p0003", "p0004", "p0005"}; // 비밀번호
		initSampleData.setsPws(sPws);
		
		String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"}; // 이름
		initSampleData.setsNames(sNames);
		
		int[] sAges = {19, 22, 20, 27, 19}; // 나이
		initSampleData.setsAges(sAges);
		
		char[] sGenders = {'M', 'W', 'W', 'M', 'M'}; // 성별
		initSampleData.setsGenders(sGenders);
		
		String[] sMajors = {"English", "Korean", "French", "Philosophy", "History"}; // 전공
		initSampleData.setsMajors(sMajors);
		
		return initSampleData; // 생성된 InitSampleData 객체 반환
	}
	
    // StudentDao를 생성하는 Bean
	@Bean
    public StudentDao studentDao() {
    	return new StudentDao(); // 새로운 StudentDao 객체 반환
    }
	
    // StudentRegisterService를 생성하는 Bean
	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService(studentDao()); // StudentDao를 주입하여 생성
	}

    // StudentModifyService를 생성하는 Bean
	@Bean
	public StudentModifyService studentModifyService() {
		return new StudentModifyService(studentDao()); // StudentDao 주입
	}
	
    // StudentDeleteService를 생성하는 Bean
	@Bean
	public StudentDeleteService studentDeleteService() {
		return new StudentDeleteService(studentDao()); // StudentDao 주입
	}
	
    // StudentAllSelectService를 생성하는 Bean
	@Bean
	public StudentAllSelectService studentAllSelectService() {
		return new StudentAllSelectService(studentDao()); // StudentDao 주입
	}
	
    // StudentSelectService를 생성하는 Bean
	@Bean
	public StudentSelectService studentSelectService() {
		return new StudentSelectService(studentDao()); // StudentDao 주입
	}
	
    // PrintStudentInformationService를 생성하는 Bean
	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		return new PrintStudentInformationService(studentAllSelectService()); // StudentAllSelectService 주입
	}
}
