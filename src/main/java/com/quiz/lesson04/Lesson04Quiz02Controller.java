package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.domain.Realtor;
import com.quiz.lesson04.service.RealtorBO;

@Controller
@RequestMapping("/lesson04/quiz02")
public class Lesson04Quiz02Controller {
	
	@Autowired
	RealtorBO realtorBO;
	
	@RequestMapping("/add-realtor-view")
	public String addRealtorView() {
		return "lesson04/addRealtor";
	}
	
	@RequestMapping("/add-realtor-view2")
	public String addRealtorView2() {
		return "lesson04/addRealtor";
	}
	
	@PostMapping("/add-realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor,
			Model model
			) {
		
		realtorBO.addRealtor(realtor);
		int id = realtor.getId();
		Realtor new_realtor = realtorBO.selectRealtorByIdService(id);
		model.addAttribute("new_realtor",new_realtor);
		return  "lesson04/afterAddRealtor";
	}
	

}
