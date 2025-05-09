package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson06")
@Controller
public class Lesson06QuizController {
	
	@GetMapping("/add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmark";
	}

}
