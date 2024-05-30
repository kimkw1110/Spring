package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentSelectService {
	private StudentDao  studentDao;
	public StudentSelectService() {  }
	public StudentSelectService(StudentDao  studentDao) 
	{
		this.studentDao = studentDao ;
	}
	//아래에 메서드 추가
	public Student select(String  sNum)
	{
		if(verify(sNum))
		{
			return studentDao.select(sNum);
		}
		else
		{
			System.out.println("검색된 학생이 없음.");
			return null ;
		}
	}
	public  boolean verify(String  sNum)
	{
		Student  student = studentDao.select(sNum);
		return  student != null ? true : false ;
	}
	
}





