package ch04_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.Student;

// 학생 정보 출력 서비스
public class PrintStudentInformationService {
    private StudentAllSelectService allSelectService; // 모든 학생 정보 조회 서비스

    // 기본 생성자
    public PrintStudentInformationService(StudentAllSelectService allSelectService) {
        this.allSelectService = allSelectService; // 모든 학생 정보 조회 서비스를 설정
    }
    
    // 학생 정보를 출력하는 메서드
    public void printStudentInfo() {
        // 모든 학생 정보 조회
        Map<String, Student> allStudent = allSelectService.allSelect();
        // 학생 정보 출력
        Set<String> keys = allStudent.keySet(); // 모든 학생의 학번을 가져옴
        Iterator<String> iterator = keys.iterator(); // 학생 학번을 반복자로 설정
        
        System.out.println("STUDENT LIST START -------------");
        // 학생 정보 출력 반복문
        while (iterator.hasNext()) {
            String key = iterator.next(); // 다음 학생 학번 가져오기
            Student student = allStudent.get(key); // 학번을 이용하여 학생 정보 가져오기
            // 학생 정보 출력
            System.out.print("sNum:" + student.getsNum() + "\t");
            System.out.print("|sId:" + student.getsId() + "\t");
            System.out.print("|sPw:" + student.getsPw() + "\t");
            System.out.print("|sName:" + student.getsName() + "\t");
            System.out.print("|sAge:" + student.getsAge() + "\t");
            System.out.print("|sGender:" + student.getsGender() + "\t");
            System.out.println("|sMajor:" + student.getsMajor() + "\t");
        }
        System.out.println("END ----------------------------");
    }
}
