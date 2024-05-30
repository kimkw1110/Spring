package ch06_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch06_pjt_01.ems.member.DBConnectionInfo;

// EMS 정보를 출력하는 서비스 클래스
public class EMSInformationService {
    private String info; // EMS 정보
    private String copyRight; // 저작권 정보
    private String ver; // 버전 정보
    private int sYear; // 개발 시작 연도
    private int sMonth; // 개발 시작 월
    private int sDay; // 개발 시작 일
    private int eYear; // 개발 종료 연도
    private int eMonth; // 개발 종료 월
    private int eDay; // 개발 종료 일
    private List<String> developers; // 개발자 목록
    private Map<String, String> administrators; // 관리자 목록
    private Map<String, DBConnectionInfo> dbInfos; // 데이터베이스 연결 정보 목록
    
    public EMSInformationService() {
    	
    }
    
    // EMS 정보를 출력하는 메서드
    public void printEMSInformation() {
        System.out.println("EMS INFORMATION START ----------");
        // 개발 기간 문자열 생성
        String devPeriod = sYear + "/" + sMonth + "/" + sDay + " ~ " + eYear + "/" + eMonth + "/" + eDay ;
        // EMS 정보 출력
        System.out.println(info + "(" + devPeriod + ")");
        System.out.println(copyRight);
        System.out.println(ver);
        System.out.println("Developers: " + developers);
        System.out.println("Administrator: " + administrators);
        // 데이터베이스 정보 출력
        printDBInfo();
        System.out.println("END ----------------------------");
    }
    
    // 데이터베이스 연결 정보 출력 메서드
    private void printDBInfo() {
    	Set<String> keys = dbInfos.keySet(); // 데이터베이스 연결 정보의 키 집합을 가져옴
    	Iterator<String> iterator = keys.iterator(); // Iterator를 사용하여 반복 작업 수행
    	
    	while (iterator.hasNext()) {
    		String key = iterator.next(); // 다음 키 가져오기
    		DBConnectionInfo info = dbInfos.get(key); // 해당 키에 대한 DB 연결 정보 가져오기
    		// DB 연결 정보 출력
    		System.out.print("[" + key + " DB] ");
    		System.out.print("url: " + info.getUrl() + "\t");
    		System.out.print("userId: " + info.getUserId() + "\t");
    		System.out.print("userPw: " + info.getUserPw() + "\n");
    	}
    }
    
    // Getter 메서드들
    public String getInfo() {
        return info;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public String getVer() {
        return ver;
    }

    public int getsYear() {
        return sYear;
    }

    public int getsMonth() {
        return sMonth;
    }

    public int getsDay() {
        return sDay;
    }

    public int geteYear() {
        return eYear;
    }

    public int geteMonth() {
        return eMonth;
    }

    public int geteDay() {
        return eDay;
    }

    public List<String> getDevelopers() {
        return developers;
    }

    public Map<String, String> getAdministrators() {
        return administrators;
    }

    public Map<String, DBConnectionInfo> getDbInfos() {
        return dbInfos;
    }

    // Setter 메서드들
    public void setInfo(String info) {
        this.info = info;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public void setsYear(int sYear) {
        this.sYear = sYear;
    }

    public void setsMonth(int sMonth) {
        this.sMonth = sMonth;
    }

    public void setsDay(int sDay) {
        this.sDay = sDay;
    }

    public void seteYear(int eYear) {
        this.eYear = eYear;
    }

    public void seteMonth(int eMonth) {
        this.eMonth = eMonth;
    }

    public void seteDay(int eDay) {
        this.eDay = eDay;
    }

    public void setDevelopers(List<String> developers) {
        this.developers = developers;
    }

    public void setAdministrators(Map<String, String> administrators) {
        this.administrators = administrators;
    }

    public void setDbInfos(Map<String, DBConnectionInfo> dbInfos) {
        this.dbInfos = dbInfos;
    }
}
