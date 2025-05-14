package com.quiz.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	

}
