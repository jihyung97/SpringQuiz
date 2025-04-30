package com.quiz.lesson04.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.mapper.SellerMapper;

@Service
public class Lesson04BO {
	@Autowired
	SellerMapper sellerMapper;
	
	public void addSeller(String nickname, 
			String profileUrl, 
			double temperature) {
		sellerMapper.InsertSeller(nickname, profileUrl, temperature);
	}
	
	

}
