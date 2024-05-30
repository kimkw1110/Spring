package ch06_pjt_01.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;

// Spring Configuration 클래스
@Configuration
public class MemberConfig2 {
    
    // 개발 환경 데이터베이스 연결 정보를 생성하는 Bean
    @Bean
    public DBConnectionInfo dev_DBConnectionInfoDev() {
        DBConnectionInfo dbConnectionInfo = new DBConnectionInfo(); // DBConnectionInfo 객체 생성
        dbConnectionInfo.setUrl("000.000.000.000"); // 개발 환경의 URL 설정
        dbConnectionInfo.setUserId("admin"); // 개발 환경의 사용자 ID 설정
        dbConnectionInfo.setUserPw("0000"); // 개발 환경의 비밀번호 설정
        
        return dbConnectionInfo; // 생성된 DBConnectionInfo 객체 반환
    }
    
    // 실 환경 데이터베이스 연결 정보를 생성하는 Bean
    @Bean
    public DBConnectionInfo real_DBConnectionInfo() {
        DBConnectionInfo dbConnectionInfo = new DBConnectionInfo(); // DBConnectionInfo 객체 생성
        dbConnectionInfo.setUrl("111.111.111.111"); // 실 환경의 URL 설정
        dbConnectionInfo.setUserId("master"); // 실 환경의 사용자 ID 설정
        dbConnectionInfo.setUserPw("1111"); // 실 환경의 비밀번호 설정
        
        return dbConnectionInfo; // 생성된 DBConnectionInfo 객체 반환
    }
}
