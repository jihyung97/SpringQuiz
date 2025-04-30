package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.service.Lesson03QuizBO;

@RequestMapping("/lesson03/quiz04")
@RestController
public class Lesson03Quiz04RestController {
	@Autowired Lesson03QuizBO lesson03QuizBO;
	@RequestMapping("/1")
	public String quiz04_1(@RequestParam(value="id", defaultValue = "1")int id) {
		lesson03QuizBO.deleteRealEstateByIdService(id);
		return "삭제 성공 :" + id;
		
	}

}
