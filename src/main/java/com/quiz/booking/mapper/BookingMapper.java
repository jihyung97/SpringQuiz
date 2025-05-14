package com.quiz.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.booking.domain.Book;

@Mapper
public interface BookingMapper {
	
	public List<Book> selectBookingList();
	public int selectBookByNameAndPhoneNumber(
			@Param("name") String name
			,@Param("phoneNumber") String phoneNumber
			);
	public void deleteBookById(int id);
	public void insertBook (@Param("name") String name
							,@Param("date") String date
							,@Param("day") int day
							,@Param("people") int people
							,@Param("status") String status
							,@Param("phoneNumber") String phoneNumber
			);

}
