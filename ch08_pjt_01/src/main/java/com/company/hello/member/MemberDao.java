package com.company.hello.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component  // 이 클래스가 Spring의 빈으로 등록됨을 나타냅니다.
public class MemberDao {
	Map<String, MemberVo> memberDB = new HashMap<String, MemberVo>();
	// 회원 정보를 저장할 맵입니다. 키는 회원 ID이고 값은 회원 객체입니다.

	public MemberVo selectMember(MemberVo memberVo) {
		// 전달된 회원 객체를 이용해 회원 정보를 조회하는 메서드입니다.
		System.out.println("MemberDao의 selectMember 함수");
		System.out.println("전송된 id=" + memberVo.getM_id());
		System.out.println("전송된 pwd=" + memberVo.getM_pw());
		// 전달된 회원의 ID와 비밀번호를 출력합니다.

		MemberVo signedMember = memberDB.get(memberVo.getM_id());
		// 회원 DB에서 ID로 회원 정보를 조회합니다.
		
		if (signedMember != null && memberVo.getM_pw().equals(signedMember.getM_pw()))
			// 조회된 회원 정보가 있고, 비밀번호가 일치하면 해당 회원 객체를 반환합니다.
			return signedMember;
		else
			// 조회된 회원 정보가 없거나, 비밀번호가 일치하지 않으면 null을 반환합니다.
			return null;
	}
	
	public void insertMember(MemberVo memberVo) {
		// 전달된 회원 객체를 회원 DB에 추가하는 메서드입니다.
		System.out.println("MemberDao의 insertMember() 메서드 호출됨");
		System.out.println("전달된 ID=" + memberVo.getM_id());
		System.out.println("전달된 pwd=" + memberVo.getM_pw());
		System.out.println("전달된 email=" + memberVo.getM_mail());
		System.out.println("전달된 phone=" + memberVo.getM_phone());
		// 전달된 회원의 ID, 비밀번호, 이메일, 전화번호를 출력합니다.
		
		memberDB.put(memberVo.getM_id(), memberVo);
		// 회원 DB에 새로운 회원을 추가합니다.
		printAllMember();
		// 모든 회원 정보를 출력합니다.
	}
	
	public void printAllMember() {
		// 회원 DB에 저장된 모든 회원 정보를 출력하는 메서드입니다.
		System.out.println("[MemberDao]의 printAllMember()");
		
		Set<String> keys = memberDB.keySet();
		// 회원 DB의 모든 키(ID)를 가져옵니다.
		Iterator<String> iterator = keys.iterator();
		// 키를 순회하기 위한 Iterator 객체를 생성합니다.
		
		while (iterator.hasNext()) {
			// 모든 키를 순회하면서 각 회원 정보를 출력합니다.
			String key = iterator.next();
			MemberVo memberVo = memberDB.get(key);
			
			System.out.println("m_id: " + memberVo.getM_id());
			System.out.println("m_pw: " + memberVo.getM_pw());
			System.out.println("m_mail: " + memberVo.getM_mail());
			System.out.println("m_phone: " + memberVo.getM_phone());
			// 각 회원의 ID, 비밀번호, 이메일, 전화번호를 출력합니다.
		}
	}
}
