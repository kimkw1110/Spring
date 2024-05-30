package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;
import ch06_pjt_01.ems.member.service.EMSInformationService;

// Spring Configuration 클래스
@Configuration
public class MemberConfig3 {

    // Autowired 어노테이션을 사용하여 다른 Bean에서 주입받음
    @Autowired
    DBConnectionInfo dev_DBConnectionInfoDev; // 개발 환경 데이터베이스 연결 정보
    
    @Autowired
    DBConnectionInfo real_DBConnectionInfo; // 실 환경 데이터베이스 연결 정보

    // EMSInformationService를 생성하는 Bean
    @Bean
    public EMSInformationService eMSInformationService() {
        EMSInformationService emsService = new EMSInformationService(); // EMSInformationService 객체 생성
        
        // EMS 관련 정보 설정
        emsService.setInfo("Education Management System program was developed in 2022."); // 시스템 정보
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
        developers.add("Cheney.");
        developers.add("Eloy.");
        developers.add("Jasper.");
        developers.add("Dillon.");
        developers.add("Kian.");
        emsService.setDevelopers(developers); // 개발자 목록 설정
        
        // 관리자 맵 설정
        Map<String, String> administrators = new HashMap<>();
        administrators.put("Cheney", "cheney@springPjt.org"); // 관리자 1
        administrators.put("Jasper", "jasper@springPjt.org"); // 관리자 2
        emsService.setAdministrators(administrators); // 관리자 정보 설정
        
        // 데이터베이스 연결 정보 설정
        Map<String, DBConnectionInfo> dbInfos = new HashMap<>();
        dbInfos.put("dev", dev_DBConnectionInfoDev); // 개발 DB 연결 정보
        dbInfos.put("real", real_DBConnectionInfo); // 실 DB 연결 정보
        emsService.setDbInfos(dbInfos); // DB 연결 정보 설정
        
        return emsService; // 생성된 EMSInformationService 객체 반환
    }
}
