package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SellerMapper {
	public void InsertSeller(
			@Param("nickname") String nickname, 
			@Param("profileUrl") String profileUrl, 
			@Param("temperature") double temperature
			);

}
