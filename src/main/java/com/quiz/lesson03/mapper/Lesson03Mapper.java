package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.Real_Estate;

@Mapper
public interface Lesson03Mapper {
	public Real_Estate selectRealEstateById(int id);
	public List<Real_Estate> selectRealEstateByRentPrice(int rentPrice);
	public List<Real_Estate> selectRealEstateByComplex(@Param("price") int price,@Param("area") int area);
	public int insertRealEstate(Real_Estate realEstate);
	public int insertRealEstateByField(
										@Param("id")int id,
										@Param("realtorId")int realtorId,
										@Param("address")String address,
										@Param("area") int area,
										@Param("type") String type,
										@Param("price") int price,
										@Param("rentPrice") int rentPrice
								       );
	public void deleteRealEstateById (
				int id
			);
	
	
}
