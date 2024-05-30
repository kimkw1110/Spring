package ch06_pjt_01.ems.member.service;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDao;

// 학생 정보 수정 서비스
public class StudentModifyService {
    private StudentDao studentDao; // 학생 정보를 담은 DAO 객체

    // 기본 생성자
    public StudentModifyService(StudentDao studentDao) {
        this.studentDao = studentDao; // 학생 DAO 객체를 설정
    }
    
    // 학생 정보를 수정하는 메서드
    public void modify(Student student) {
        // 수정하고자 하는 학생이 존재하는지 확인 후 수정 진행
        if (verify(student.getsNum())) {
            studentDao.update(student); // 수정하고자 하는 학생 정보를 DAO를 통해 업데이트
        } else {
            System.out.println("수정하고자 하는 학생이 없음"); // 학생 정보가 존재하지 않으면 메시지 출력
        }
    }
    
    // 학생 정보 존재 여부를 확인하는 메서드
    public boolean verify(String sNum) {
        // 학생 번호로 학생 정보 조회
        Student student = studentDao.select(sNum); // 학생 DAO를 통해 해당 학생 정보를 조회
        // 학생 정보가 존재하면 true 반환, 그렇지 않으면 false 반환
        return student != null ? true : false; // 학생 정보가 존재하면 true, 그렇지 않으면 false 반환
    }
}
