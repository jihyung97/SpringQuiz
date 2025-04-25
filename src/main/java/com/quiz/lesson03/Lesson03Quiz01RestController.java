package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.domain.Real_Estate;
import com.quiz.lesson03.service.Lesson03QuizBO;
@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {
	
	@Autowired
	private Lesson03QuizBO lesson03QuizBO;
	
	@RequestMapping("/1")
	public Real_Estate quiz01_1(
			@RequestParam(value="id", defaultValue = "1")int id
			) {
		return lesson03QuizBO.getRealEstateByID(id);
	}
	
	@RequestMapping("/2")
	public List<Real_Estate> quiz01_2(
			@RequestParam(value="rentPrice", defaultValue = "1")int rentPrice
			) {
		return lesson03QuizBO.getRealEstateByRentPrice(rentPrice);
	}
	
	@RequestMapping("/3")
	public List<Real_Estate> quiz01_3(
			@RequestParam(value="price", defaultValue = "1")int price,
			@RequestParam(value="area", defaultValue = "1")int area
			) {
		return lesson03QuizBO.getRealEstateByComplex(price,area);
	}
	
	@RequestMapping("/4")
	public String quiz02_1( ) {
		Real_Estate real_Estate = new Real_Estate();
		real_Estate.setAddress("쌍떼빌리버 오피스텔 814호");
		real_Estate.setArea(45);
		real_Estate.setType("월세");
		real_Estate.setPrice(100000);
		real_Estate.setRentPrice(120);
		return "결과는" + lesson03QuizBO.insertRealEstateService(real_Estate);
	}
	
	@RequestMapping("/5")
	public String quiz02_2(
			@RequestParam(value="realtor_id", defaultValue = "1")int realtor_id
			) {
		
		return "결과는" + lesson03QuizBO.insertRealEstateByFieldService(10000,realtor_id,"쌍떼빌리 814호",42,"월세",10000,150);
	}

}
