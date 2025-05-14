package com.quiz.booking;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.booking.service.BookingBO;

@Controller
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	BookingBO bookingBO;
	@RequestMapping("/booking-list-view")
	public String BookingListView(Model model) {
		model.addAttribute("bookList",bookingBO.getBookingList());
		return("booking/bookingList");
	}
	
	@RequestMapping("/make-booking-view")
	public String MakeBookingView() {
		return("booking/makeBooking");
	}
	
	@RequestMapping("/check-booking-view")
	public String CheckBookingView() {
		return("booking/checkBooking");
	}
	
	@DeleteMapping("/delete-book")
	public Map<String,Object> deleteBook(
			@RequestParam("id") int id
			){
		bookingBO.removeBook(id);
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		return result;
		
	}
	@PostMapping("/insert-book")
	public void addBook(
			@RequestParam("name") String name
			,@RequestParam("date") String date
			,@RequestParam("day") int day
			,@RequestParam("people") int people
			,@RequestParam(value = "status", defaultValue = "대기중") String status
			,@RequestParam("phoneNumber")String phoneNumber
			
			) {
			bookingBO.addBook(name, date, day, people, status, phoneNumber);

	}
	
	
	
	

}
