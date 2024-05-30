package ch06_pjt_01.ems.member;

// 데이터베이스 연결 정보를 담는 클래스
public class DBConnectionInfo {
    private String url; // 데이터베이스 URL
    private String userId; // 사용자 ID
    private String userPw; // 사용자 비밀번호

    // 데이터베이스 URL getter 메서드
    public String getUrl() {
        return url;
    }
    // 데이터베이스 URL setter 메서드
    public void setUrl(String url) {
        this.url = url;
    }

    // 사용자 ID getter 메서드
    public String getUserId() {
        return userId;
    }
    // 사용자 ID setter 메서드
    public void setUserId(String userId) {
        this.userId = userId;
    }

    // 사용자 비밀번호 getter 메서드
    public String getUserPw() {
        return userPw;
    }
    // 사용자 비밀번호 setter 메서드
    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }
}
