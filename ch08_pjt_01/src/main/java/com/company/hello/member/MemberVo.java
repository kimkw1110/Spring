package com.company.hello.member;

public class MemberVo {
	private String m_id;	// 회원 ID를 저장하는 변수
	private String m_pw;	// 회원 비밀번호를 저장하는 변수
	private String m_mail;	// 회원 이메일을 저장하는 변수
	private String m_phone;	// 회원 전화번호를 저장하는 변수
	
	public String getM_id() {
		// 회원 ID를 반환하는 메서드
		return this.m_id;
	}
	
	public void setM_id(String m_id) {
		// 회원 ID를 설정하는 메서드
		this.m_id = m_id;
		System.out.println("setM_id 메서드 호출됨");  // 설정 메서드 호출 시 메시지 출력
	}
	
	public String getM_pw() {
		// 회원 비밀번호를 반환하는 메서드
		return this.m_pw;
	}
	
	public void setM_pw(String m_pw) {
		// 회원 비밀번호를 설정하는 메서드
		this.m_pw = m_pw;
		System.out.println("setM_pw 메서드 호출됨");  // 설정 메서드 호출 시 메시지 출력
	}
	
	public String getM_mail() {
		// 회원 이메일을 반환하는 메서드
		return m_mail;
	}
	
	public void setM_mail(String m_mail) {
		// 회원 이메일을 설정하는 메서드
		this.m_mail = m_mail;
		System.out.println("setM_mail 메서드 호출됨");  // 설정 메서드 호출 시 메시지 출력
	}
	
	public String getM_phone() {
		// 회원 전화번호를 반환하는 메서드
		return this.m_phone;
	}
	
	public void setM_phone(String m_phone) {
		// 회원 전화번호를 설정하는 메서드
		this.m_phone = m_phone;
		System.out.println("setM_phone 메서드 호출됨");  // 설정 메서드 호출 시 메시지 출력
	}
}
