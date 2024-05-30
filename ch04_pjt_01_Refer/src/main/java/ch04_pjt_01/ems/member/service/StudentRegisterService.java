package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentRegisterService {
	private StudentDao  studentDao;
	public StudentRegisterService() {  }
	public StudentRegisterService(StudentDao  studentDao) 
	{
		this.studentDao = studentDao ;
	}
	//아래에 메서드 추가
	public void register(Student student)
	{
		if(verify(student.getsNum() ))
			studentDao.insert(student);
		else
			System.out.println(
				"똑같은 학번을 가진 학생이 이미 등록됨");
	}
	public Boolean verify(String sNum)
	{
		Student obstudent = studentDao.select(sNum); 
		return obstudent == null ?  true:false  ;
	}
}
