package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

// 학생 등록 서비스
public class StudentRegisterService {
    private StudentDao studentDao; // 학생 정보를 담은 DAO 객체

    // 기본 생성자
    public StudentRegisterService(StudentDao studentDao) {
        this.studentDao = studentDao; // 학생 DAO 객체를 설정
    }
    
    // 학생을 등록하는 메서드
    public void register(Student student) {
        // 동일한 학번을 가진 학생이 이미 등록되어 있는지 확인 후 등록 진행
        if (verify(student.getsNum())) {
            studentDao.insert(student); // 학생 정보를 DAO를 통해 등록
        } else {
            System.out.println("똑같은 학번을 가진 학생이 이미 등록됨"); // 이미 등록된 학생의 학번이 중복되었을 경우 메시지 출력
        }
    }
    
    // 학번 중복 여부를 확인하는 메서드
    public boolean verify(String sNum) {
        // 학번으로 학생 정보를 조회
        Student existingStudent = studentDao.select(sNum); // 학생 DAO를 통해 해당 학번의 학생 정보를 조회
        // 학번이 중복되지 않으면 true 반환, 중복되면 false 반환
        return existingStudent == null ? true : false; // 학번이 중복되지 않으면 true, 중복되면 false 반환
    }
}
