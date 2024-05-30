package ch04_pjt_01.ems.utils;

// 샘플 데이터 초기화 클래스
public class InitSampleData {
	
	/*
	private String[] sNums = { "hbs001", "hbs002", "hbs003", "hbs004", "hbs005" };
	private String[] sIds = { "rabbit", "hippo", "raccoon", "elephant", "lion" };
	private String[] sPws = { "96539", "64875", "15284", "48765", "28661" };
	private String[] sNames = { "agatha", "barbara", "chris", "doris", "elva" };
	private int[] sAges = { 19, 22, 20, 27, 19 };
	private char[] sGenders = { 'M', 'W', 'W', 'M', 'M' };
	private String[] sMajors = { "English Literature", "Korean Language and Literature", "French Language and Literature", "Philosophy", "History" };
	*/
	
	// applicationContext.xml 생성 후 코드 변경
			
    // 학번 배열
    private String[] sNums;
    // 학생 아이디 배열
    private String[] sIds;
    // 학생 비밀번호 배열
    private String[] sPws;
    // 학생 이름 배열
    private String[] sNames;
    // 학생 나이 배열
    private int[] sAges;
    // 학생 성별 배열
    private char[] sGenders;
    // 학생 전공 배열
    private String[] sMajors;

    // 학번 배열 getter 메서드
    public String[] getsNums() {
        return sNums;
    }
    
    // 학번 배열 setter 메서드
    public void setsNums(String[] sNums) {
        this.sNums = sNums;
    }
    
    // 학생 아이디 배열 getter 메서드
    public String[] getsIds() {
        return sIds;
    }
    
    // 학생 아이디 배열 setter 메서드
    public void setsIds(String[] sIds) {
        this.sIds = sIds;
    }
    
    // 학생 비밀번호 배열 getter 메서드
    public String[] getsPws() {
        return sPws;
    }
    
    // 학생 비밀번호 배열 setter 메서드
    public void setsPws(String[] sPws) {
        this.sPws = sPws;
    }
    
    // 학생 이름 배열 getter 메서드
    public String[] getsNames() {
        return sNames;
    }
    
    // 학생 이름 배열 setter 메서드
    public void setsNames(String[] sNames) {
        this.sNames = sNames;
    }
    
    // 학생 나이 배열 getter 메서드
    public int[] getsAges() {
        return sAges;
    }
    
    // 학생 나이 배열 setter 메서드
    public void setsAges(int[] sAges) {
        this.sAges = sAges;
    }
    
    // 학생 성별 배열 getter 메서드
    public char[] getsGenders() {
        return sGenders;
    }
    
    // 학생 성별 배열 setter 메서드
    public void setsGenders(char[] sGenders) {
        this.sGenders = sGenders;
    }
    
    // 학생 전공 배열 getter 메서드
    public String[] getsMajors() {
        return sMajors;
    }
    
    // 학생 전공 배열 setter 메서드
    public void setsMajors(String[] sMajors) {
        this.sMajors = sMajors;
    }
}
