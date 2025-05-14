package com.quiz.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.booking.domain.Book;
import com.quiz.booking.mapper.BookingMapper;

@Service
public class BookingBO {
	@Autowired
	private BookingMapper bookingMapper;
	
	public void addBook(
			String name
			, String date
			, int day
			, int people
			, String status
			, String phoneNumber
	) {
		bookingMapper.insertBook(
				
				 name
				,  date
				,  day
				,  people
				,  status
				,  phoneNumber
				
				);
		
	
	};
	
	public List<Book> getBookingList() {
		return bookingMapper.selectBookingList();
	}
	
	public void removeBook(int id) {
		bookingMapper.deleteBookById(id);
	}
	public boolean confirmDuplicate(String name, String phoneNumber) {
		
		return bookingMapper.selectBookByNameAndPhoneNumber(name, phoneNumber) == 0 ? false : true;
	}

			
			
			
	

}
