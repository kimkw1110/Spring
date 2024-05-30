package ch06_pjt_01.ems.member.service;

import java.util.Map;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDao;

// 모든 학생 정보 조회 서비스
public class StudentAllSelectService {
    private StudentDao studentDao; // 학생 정보를 담은 DAO 객체

    // 기본 생성자
    public StudentAllSelectService(StudentDao studentDao) {
        this.studentDao = studentDao; // 학생 DAO 객체를 설정
    }

    // 모든 학생 정보를 조회하여 Map으로 반환하는 메서드
    public Map<String, Student> allSelect() {
        return studentDao.getStudentDB(); // DAO 객체를 통해 모든 학생 정보를 조회하여 반환
    }
}
