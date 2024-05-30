package ch06_pjt_01.ems.member.service;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDao;

// 학생 정보 조회 서비스
public class StudentSelectService {
    private StudentDao studentDao; // 학생 정보를 담은 DAO 객체

    // 기본 생성자
    public StudentSelectService(StudentDao studentDao) {
        this.studentDao = studentDao; // 학생 DAO 객체를 설정
    }
    
    // 학생 정보를 조회하는 메서드
    public Student select(String sNum) {
        // 학번을 기반으로 학생 정보를 조회하고, 해당 학생이 존재하는지 확인 후 반환
        if (verify(sNum)) {
            return studentDao.select(sNum); // 해당 학생이 존재하면 해당 학생 정보를 반환
        } else {
            System.out.println("검색된 학생이 없음"); // 학생이 존재하지 않을 경우 메시지 출력
        }
        
        return null;
    }
    
    // 학생 정보의 존재 여부를 확인하는 메서드
    public boolean verify(String sNum) {
        // 학번을 기반으로 학생 정보를 조회하여 존재 여부를 반환
        Student student = studentDao.select(sNum); // 학생 DAO를 통해 해당 학번의 학생 정보를 조회
        return student != null ? true : false; // 학생 정보가 존재하면 true, 그렇지 않으면 false 반환
    }
}
