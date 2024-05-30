package ch04_pjt_01.ems.member;

// 학생 정보를 담는 클래스
public class Student {
    private String sNum; // 학번
    private String sId; // 학생 아이디
    private String sPw; // 학생 비밀번호
    private String sName; // 학생 이름
    private int sAge; // 학생 나이
    private char sGender; // 학생 성별
    private String sMajor; // 학생 전공

    // 기본 생성자
    public Student(String sNum, String sId, String sPw, String sName, int sAge, char sGender, String sMajor) {
        this.sNum = sNum; // 학번
        this.sId = sId; // 학생 아이디
        this.sPw = sPw; // 학생 비밀번호
        this.sName = sName; // 학생 이름
        this.sAge = sAge; // 학생 나이
        this.sGender = sGender; // 학생 성별
        this.sMajor = sMajor; // 학생 전공
    }

    // 학번 getter 메서드
    public String getsNum() {
        return sNum;
    }
    // 학번 setter 메서드
    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    // 학생 아이디 getter 메서드
    public String getsId() {
        return sId;
    }
    // 학생 아이디 setter 메서드
    public void setsId(String sId) {
        this.sId = sId;
    }

    // 학생 비밀번호 getter 메서드
    public String getsPw() {
        return sPw;
    }
    // 학생 비밀번호 setter 메서드
    public void setsPw(String sPw) {
        this.sPw = sPw;
    }

    // 학생 이름 getter 메서드
    public String getsName() {
        return sName;
    }
    // 학생 이름 setter 메서드
    public void setsName(String sName) {
        this.sName = sName;
    }

    // 학생 나이 getter 메서드
    public int getsAge() {
        return sAge;
    }
    // 학생 나이 setter 메서드
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    // 학생 성별 getter 메서드
    public char getsGender() {
        return sGender;
    }
    // 학생 성별 setter 메서드
    public void setsGender(char sGender) {
        this.sGender = sGender;
    }

    // 학생 전공 getter 메서드
    public String getsMajor() {
        return sMajor;
    }
    // 학생 전공 setter 메서드
    public void setsMajor(String sMajor) {
        this.sMajor = sMajor;
    }
}
