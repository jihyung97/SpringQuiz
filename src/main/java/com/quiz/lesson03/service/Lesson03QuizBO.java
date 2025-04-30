package com.quiz.lesson03.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.Real_Estate;
import com.quiz.lesson03.mapper.Lesson03Mapper;
@Service
public class Lesson03QuizBO {
	@Autowired
	private Lesson03Mapper lesson03Mapper;
	
	
	
	public Real_Estate getRealEstateByID(int id) {
		return(lesson03Mapper.selectRealEstateById(id));
		
	}
	
	public List<Real_Estate> getRealEstateByRentPrice(int rentPrice) {
		return(lesson03Mapper.selectRealEstateByRentPrice(rentPrice));
		
	}
	public List<Real_Estate>getRealEstateByComplex(@Param("price") int price,@Param("area") int area) {
		return(lesson03Mapper.selectRealEstateByComplex(price,area));
		
	}
	public int insertRealEstateService(Real_Estate realEstate) {
		return(lesson03Mapper.insertRealEstate(realEstate));
	}
	public int insertRealEstateByFieldService(
						@Param("id") int id ,
						@Param("realtorId") int realtorId ,
						@Param("address")String address,
				       @Param("area") int area,
				       @Param("type") String type,
				       @Param("price") int price,
				       @Param("rentPrice") int rentPrice
				       )
			
	{
		return(lesson03Mapper.insertRealEstateByField(id,realtorId,address,area,type,price,rentPrice));
	}
	public void deleteRealEstateByIdService(int id) {
		lesson03Mapper.deleteRealEstateById(id);
	}

}


