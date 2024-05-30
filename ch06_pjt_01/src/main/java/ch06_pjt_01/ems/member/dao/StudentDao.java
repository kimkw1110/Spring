package ch06_pjt_01.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ch06_pjt_01.ems.member.Student;

// 학생 정보에 대한 데이터베이스 액세스 객체
public class StudentDao {
    private Map<String, Student> studentDB = new HashMap<String, Student>(); // 학생 정보를 담는 Map

    // 학생 정보 삽입 메서드
    public void insert(Student student) {
        studentDB.put(student.getsNum(), student); // 학번을 key로 사용하여 학생 정보를 Map에 삽입
    }

    // 학생 정보 조회 메서드
    public Student select(String sNum) {
        return studentDB.get(sNum); // 주어진 학번을 이용하여 학생 정보를 조회하여 반환
    }

    // 학생 정보 수정 메서드
    public void update(Student student) {
        studentDB.put(student.getsNum(), student); // 학번을 key로 사용하여 해당 학생 정보를 수정
    }

    // 학생 정보 삭제 메서드
    public void delete(String sNum) {
        studentDB.remove(sNum); // 주어진 학번을 이용하여 학생 정보를 삭제
    }

    // 전체 학생 정보를 담은 Map 반환 메서드
    public Map<String, Student> getStudentDB() {
        return studentDB; // 학생 정보를 담은 Map을 반환
    }
}
