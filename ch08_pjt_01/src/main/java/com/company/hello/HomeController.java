package com.company.hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // 이 클래스가 Spring MVC 컨트롤러임을 나타냅니다.
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// 로그 정보를 기록하기 위한 Logger 인스턴스입니다.
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)  // HTTP GET 요청을 루트 URL "/"에 매핑합니다.
	public String home(Locale locale, Model model) {
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
	
}
