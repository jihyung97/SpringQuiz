package com.quiz.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lesson01Quiz01Controller {
	
	@ResponseBody
	@RequestMapping("/lesson01/quiz01/1")
	public String quiz01_1() {
		return "<h1>테스트 프로젝트 완성</h1>" + "<h2>해당 프로젝트를 통해서 문제 풀이를 진행합니다</h2>" ;
	}
	
	@ResponseBody
	@RequestMapping("/lesson01/quiz01/2")
	public Map<String,Object> quiz01_2() {
		Map<String,Object> scores = new HashMap<>();
		scores.put("국어", 80);
		scores.put("수학", 90);
		scores.put("영어", 85);
		return scores;
		
	}
	

}
