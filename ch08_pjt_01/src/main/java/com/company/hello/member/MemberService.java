package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service  // 이 클래스가 서비스 레이어의 빈임을 나타냅니다.
// @Component  // 일반적인 빈 등록을 위한 주석 (현재 사용되지 않음)
// @Repository  // 데이터 접근 계층을 위한 빈 등록을 위한 주석 (현재 사용되지 않음)
public class MemberService {
	
	@Autowired  // 의존성 주입을 통해 MemberDao 인스턴스를 자동으로 주입합니다.
	MemberDao memberDao;
	
	public int signUpConfirm(MemberVo memberVo) {
		// 회원 가입 확인을 처리하는 메서드입니다.
		System.out.println("MemberService의 signUpConfirm() 메서드 호출됨");
		System.out.println("inserted id = " + memberVo.getM_id());
		System.out.println("inserted 암호 = " + memberVo.getM_pw());
		System.out.println("inserted 메일주소 = " + memberVo.getM_mail());
		System.out.println("inserted 전화번호 = " + memberVo.getM_phone());
		// 전달된 회원의 ID, 비밀번호, 이메일, 전화번호를 출력합니다.
		
		memberDao.insertMember(memberVo);
		// memberDao를 통해 새로운 회원 정보를 데이터베이스에 삽입합니다.
		
		return 0;  // 회원 가입 확인 후 반환 값 (필요에 따라 수정 가능)
	} // end of signUpConfirm()
	
	@RequestMapping("/signInConfirm")  // "/signInConfirm" URL 요청을 처리하는 메서드입니다.
	public MemberVo signInConfirm(MemberVo memberVo) {
		// 로그인 확인을 처리하는 메서드입니다.
		System.out.println("MemberService의 signInConfirm() 메서드");
		System.out.println("전송된 id=" + memberVo.getM_id());
		System.out.println("전송된 pwd=" + memberVo.getM_pw());
		// 전달된 회원의 ID와 비밀번호를 출력합니다.
		MemberVo loginedMem = memberDao.selectMember(memberVo);
		// memberDao를 통해 회원 정보를 조회하고 로그인된 회원 객체를 반환합니다.
		
		return loginedMem;  // 로그인된 회원 객체를 반환합니다.
	}
}
