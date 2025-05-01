package com.ex_alternative.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ex_alternative.lesson04.domain.Student;

@Controller
@RequestMapping("/lesson04/ex02")
public class Lesson04Ex02Controller {

	@PostMapping("/add=student")
	public String addStudent(
			@ModelAttribute Student student
			) {
		
		return "lesson04/afterAddStudent" ;
		
		
	}
	
	
}
