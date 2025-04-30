package com.quiz.lesson04;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.service.Lesson04BO;
@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	@Autowired
	private Lesson04BO lesson04BO;
	
	@RequestMapping(path="/add-seller-view", method = RequestMethod.GET)
	public String addSellerView() {
		return "lesson04/addSeller";
	}
	
	@PostMapping("/add-seller")
	public String addSeller(
			@RequestParam String nickname, 
			@RequestParam String profileUrl, 
			@RequestParam(value="temperature", defaultValue = "3.5") double temperature
			) {
		lesson04BO.addSeller(nickname, profileUrl, temperature);
		return "/afteraddSeller";
		
	}

}
