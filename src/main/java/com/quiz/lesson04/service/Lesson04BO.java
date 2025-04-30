package com.quiz.lesson04.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.Seller;
import com.quiz.lesson04.mapper.SellerMapper;

@Service
public class Lesson04BO {
	@Autowired
	SellerMapper sellerMapper;
	
	public void addSeller(String nickname, 
			String profileUrl, 
			double temperature) {
		sellerMapper.insertSeller(nickname, profileUrl, temperature);
	}
	public Seller  getLatestSeller(){
		return sellerMapper.selectLatestSeller();
	}
	public Seller  getSellerById(int id){
		return sellerMapper.selectSellerById(id);
	}
	
	

}
