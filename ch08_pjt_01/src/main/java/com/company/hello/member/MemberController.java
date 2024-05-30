package com.company.hello.member;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // 이 클래스가 Spring MVC 컨트롤러임을 나타냅니다.
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	// 로그 정보를 기록하기 위한 Logger 인스턴스입니다.

	@RequestMapping(value = "/", method = RequestMethod.GET)  // HTTP GET 요청을 루트 URL "/"에 매핑합니다.
	public String home(Locale locale, Model model) {
		System.out.println("MemberController의 home()메서드");
		logger.info("Welcome home! The client locale is {}.", locale);
		// 클라이언트의 로케일 정보를 포함한 환영 메시지를 로그에 기록합니다.
		
		Date date = new Date();  // 현재 날짜와 시간을 나타내는 새로운 Date 객체를 생성합니다.
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		// 지정된 로케일에 따라 날짜와 시간을 형식화하기 위한 DateFormat 객체를 생성합니다.
		
		String formattedDate = dateFormat.format(date);
		// 현재 날짜와 시간을 형식화하여 문자열로 변환합니다.
		
		model.addAttribute("serverTime", formattedDate);
		// 형식화된 날짜 문자열을 모델에 "serverTime" 속성으로 추가하여 뷰에 전달합니다.
		
		return "home";  // "home" 뷰 이름을 반환하여 해당 뷰를 렌더링합니다.
	}
	
	@RequestMapping("/signup")  // "/signup" URL 요청을 처리하는 메서드입니다.
	public String signup() {
		return "sign_up";  // "sign_up" 뷰 이름을 반환하여 해당 뷰를 렌더링합니다.
	}
	
	@RequestMapping("/signin")  // "/signin" URL 요청을 처리하는 메서드입니다.
	public String signin() {
		return "sign_in";  // "sign_in" 뷰 이름을 반환하여 해당 뷰를 렌더링합니다.
	}
	
//	MemberService memberService = new MemberService();  // 의존성 주입을 사용하지 않는 서비스 인스턴스 생성 (주석 처리됨)

	@Autowired  // 의존성 주입을 통해 MemberService 인스턴스를 자동으로 주입합니다.
	MemberService memberService;
	
	@RequestMapping("/signUpConfirm")  // "/signUpConfirm" URL 요청을 처리하는 메서드입니다.
	public String signUpConfirm(MemberVo memberVo) {
		System.out.println("MemberController의 signUpConfirm() 메서드 호출됨");
		// 회원가입 확인 메서드 호출 로그를 출력합니다.
		System.out.println("입력한 id = " + memberVo.getM_id());
		System.out.println("입력한 암호 = " + memberVo.getM_pw());
		System.out.println("입력한 메일주소 = " + memberVo.getM_mail());
		System.out.println("입력한 전화번호 = " + memberVo.getM_phone());
		// 입력된 회원 정보를 로그로 출력합니다.
		memberService.signUpConfirm(memberVo);
		// memberService를 통해 회원가입을 처리합니다.
		return "result";  // "result" 뷰 이름을 반환하여 해당 뷰를 렌더링합니다.
	}
	
	@RequestMapping("/signInConfirm")  // "/signInConfirm" URL 요청을 처리하는 메서드입니다.
	public String signInConfirm(MemberVo memberVo) {
		System.out.println("MemberController의 signInConfirm() 메서드");
		// 로그인 확인 메서드 호출 로그를 출력합니다.
		System.out.println("전달된 id=" + memberVo.getM_id());
		System.out.println("전달된 pwd=" + memberVo.getM_pw());
		// 전달된 로그인 정보를 로그로 출력합니다.
		MemberVo signedmem = memberService.signInConfirm(memberVo);
		// memberService를 통해 로그인 확인을 처리합니다.
		if (signedmem != null)
			return "signin_ok";  // 로그인 성공 시 "signin_ok" 뷰를 반환합니다.
		else
			return "signin_ng";  // 로그인 실패 시 "signin_ng" 뷰를 반환합니다.
	}
	
//	@RequestMapping("/signUpConfirm")
//	public String signUpConfirm(
//			@RequestParam String m_id,
//			@RequestParam String m_pw,
//			@RequestParam String m_mail,
//			@RequestParam String m_phone) {
//		System.out.println("signUpConfirm() 메서드 호출됨");
//		System.out.println("입력한 id = " + m_id);
//		System.out.println("입력한 암호 = " + m_pw);
//		System.out.println("입력한 메일주소 = " + m_mail);
//		System.out.println("입력한 전화번호 = " + m_phone);
//		return "result";
//	}
// 위 코드는 주석 처리된, @RequestParam을 사용한 signUpConfirm() 메서드입니다.
}
