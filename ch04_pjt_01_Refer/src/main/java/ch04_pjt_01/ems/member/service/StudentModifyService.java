package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentModifyService {
	private StudentDao  studentDao;
	public StudentModifyService() {  }
	public StudentModifyService(StudentDao  studentDao) 
	{  
		this.studentDao = studentDao ;
	}
	//아래에 메셔드 추가
	public void modify(Student  student)
	{
		if(verify(student.getsNum()))
		{
			studentDao.update(student) ;
		}
		else
			System.out.println("수정하고자 하는 학생이 없음.");
	}
	public Boolean  verify(String  sNum) //boolean ==> Boolean
	{
		Student  student = studentDao.select(sNum) ;
		return  student != null ?  true : false ; 
	}
}





