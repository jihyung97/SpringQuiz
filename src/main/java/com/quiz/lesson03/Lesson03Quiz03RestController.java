package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.service.Lesson03QuizBO;
@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz03RestController {
	@Autowired
	Lesson03QuizBO lesson03QuizBO;
	
	

}
