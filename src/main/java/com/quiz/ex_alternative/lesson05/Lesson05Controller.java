package com.quiz.ex_alternative.lesson05;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/lesson05")
public class Lesson05Controller {
	
	@RequestMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@RequestMapping("/ex02")
	public String ex02() {
		return "lesson05/ex02";
	}
	
	
	@RequestMapping("/ex03")
	public String ex03(Model model) {
		Date date = new Date();
		model.addAttribute("date",date);
		LocalDateTime localDateTime = LocalDateTime.now();
		model.addAttribute("localDateTime",localDateTime);
		model.addAttribute("localDate",LocalDate.now());
		model.addAttribute("ZonedDateTime",ZonedDateTime.now());
		
		return "lesson05/ex03";
	}
	
	
	@RequestMapping("/quiz02")
	public String quiz02(
			Model model
			) {
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		model.addAttribute("musicRanking",musicRanking);
		return "lesson05/quiz02";
	}
	
	@RequestMapping(path="/add-seller-view", method = RequestMethod.GET)
	public String addSellerView() {
		return "lesson04/addSeller";
	}
}
