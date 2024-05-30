package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;
import ch06_pjt_01.ems.member.dao.StudentDao;
import ch06_pjt_01.ems.member.service.EMSInformationService;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentAllSelectService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

//Spring 설정 클래스
@Configuration
public class MemberConfig {
	
	// 샘플 데이터를 초기화하는 Bean
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData(); // InitSampleData 객체 생성
		
		// 학번 정보 설정
		String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
		initSampleData.setsNums(sNums);
		
		// ID 정보 설정
		String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
		initSampleData.setsIds(sIds);
		
		// 비밀번호 정보 설정
		String[] sPws = {"p0001", "p0002", "p0003", "p0004", "p0005"};
		initSampleData.setsPws(sPws);
		
		// 이름 정보 설정
		String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"};
		initSampleData.setsNames(sNames);
		
		// 나이 정보 설정
		int[] sAges = {19, 22, 20, 27, 19};
		initSampleData.setsAges(sAges);
		
		// 성별 정보 설정
		char[] sGenders = {'M', 'W', 'W', 'M', 'M'};
		initSampleData.setsGenders(sGenders);
		
		// 전공 정보 설정
		String[] sMajors = {"English", "Korean", "French", "Philosophy", "History"};
		initSampleData.setsMajors(sMajors);
		
		return initSampleData; // 초기화된 InitSampleData 객체 반환
	}
	
	// StudentDao 객체를 생성하는 Bean
	@Bean
 public StudentDao studentDao() {
 	return new StudentDao(); // 새로운 StudentDao 객체 반환
 }
	
	// StudentRegisterService 객체를 생성하는 Bean
	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService(studentDao()); // StudentDao 주입
	}

	// StudentModifyService 객체를 생성하는 Bean
	@Bean
	public StudentModifyService studentModifyService() {
		return new StudentModifyService(studentDao()); // StudentDao 주입
	}
	
	// StudentDeleteService 객체를 생성하는 Bean
	@Bean
	public StudentDeleteService studentDeleteService() {
		return new StudentDeleteService(studentDao()); // StudentDao 주입
	}
	
	// StudentAllSelectService 객체를 생성하는 Bean
	@Bean
	public StudentAllSelectService studentAllSelectService() {
		return new StudentAllSelectService(studentDao()); // StudentDao 주입
	}
	
	// StudentSelectService 객체를 생성하는 Bean
	@Bean
	public StudentSelectService studentSelectService() {
		return new StudentSelectService(studentDao()); // StudentDao 주입
	}
	
	// 학생 정보를 출력하는 PrintStudentInformationService 객체를 생성하는 Bean
	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		return new PrintStudentInformationService(studentAllSelectService()); // StudentAllSelectService 주입
	}
	
	// 개발 DB 연결 정보 생성
	@Bean
	public DBConnectionInfo dev_DBConnectionInfoDev() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo(); // 새로운 DBConnectionInfo 객체
		dbConnectionInfo.setUrl("000.000.000.000"); // URL 설정
		dbConnectionInfo.setUserId("admin"); // 사용자 ID 설정
		dbConnectionInfo.setUserPw("0000"); // 비밀번호 설정
		
		return dbConnectionInfo; // 생성된 DBConnectionInfo 객체 반환
	}
	
	// 실 DB 연결 정보 생성
	@Bean
	public DBConnectionInfo real_DBConnectionInfo() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo(); // 새로운 DBConnectionInfo 객체
		dbConnectionInfo.setUrl("111.111.111.111"); // URL 설정
		dbConnectionInfo.setUserId("master"); // 사용자 ID 설정
		dbConnectionInfo.setUserPw("1111"); // 비밀번호 설정
		
		return dbConnectionInfo; // 생성된 DBConnectionInfo 객체 반환
	}
	
	// EMSInformationService 객체를 생성하는 Bean
	@Bean
	public EMSInformationService eMSInformationService() {
		EMSInformationService emsService = new EMSInformationService(); // 새로운 EMSInformationService 객체
		
		// EMS 정보 설정
		emsService.setInfo("Education Management System program was developed in 2022."); // 프로그램 정보
		emsService.setCopyRight("COPYRIGHT(C) 2022 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION."); // 저작권 정보
		emsService.setVer("The version is 1.0"); // 버전 정보
		emsService.setsYear(2022); // 시작 연도
		emsService.setsMonth(3); // 시작 월
		emsService.setsDay(1); // 시작 일
		emsService.seteYear(2022); // 종료 연도
		emsService.seteMonth(4); // 종료 월
		emsService.seteDay(30); // 종료 일
		
		// 개발자 리스트 설정
		List<String> developers = new ArrayList<>();
		developers.add("Cheney."); // 개발자 1
		developers.add("Eloy."); // 개발자 2
		developers.add("Jasper."); // 개발자 3
		developers.add("Dillon."); // 개발자 4
		developers.add("Kian."); // 개발자 5
		emsService.setDevelopers(developers); // 개발자 리스트 설정
		
		// 관리자 맵 설정
		Map<String, String> administrators = new HashMap<>();
		administrators.put("Cheney", "cheney@springPjt.org"); // 관리자 1
		administrators.put("Jasper", "jasper@springPjt.org"); // 관리자 2
		emsService.setAdministrators(administrators); // 관리자 맵 설정
		
		// 데이터베이스 연결 정보 설정
		Map<String, DBConnectionInfo> dbInfos = new HashMap<>();
		dbInfos.put("dev", dev_DBConnectionInfoDev()); // 개발 DB 연결 정보
		dbInfos.put("real", real_DBConnectionInfo()); // 실 DB 연결 정보
		emsService.setDbInfos(dbInfos); // 데이터베이스 연결 정보 설정
		
		return emsService; // 생성된 EMSInformationService 객체 반환
	}
}
