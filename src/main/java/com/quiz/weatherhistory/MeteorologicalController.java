package com.quiz.weatherhistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.domain.Realtor;
import com.quiz.weatherhistory.domain.WeatherHistory;
import com.quiz.weatherhistory.service.WeatherHistoryBO;

@Controller
@RequestMapping("/weather")
public class MeteorologicalController {
	
	@Autowired
	WeatherHistoryBO weatherHistoryBO;
	
	@RequestMapping("/add-weather-view")
	public String AddWeatherView() {
		
		
		
		return("weatherHistory/AddWeatherView");
		
	}
	@RequestMapping("/weather-list")
	public String WeatherList(Model model) {
		model.addAttribute("weatherList",weatherHistoryBO.getWeatherHistoryList());
		return("weatherHistory/WeatherView");
	}
	
	//@PostMapping("/add-realtor")
//	public String addRealtor(
//			@ModelAttribute Realtor realtor,
//			Model model
//			) {
//		
//		realtorBO.addRealtor(realtor);
//		int id = realtor.getId();
//		Realtor new_realtor = realtorBO.selectRealtorByIdService(id);
//		model.addAttribute("new_realtor",new_realtor);
//		return  "lesson04/afterAddRealtor";
//	}
	
	@PostMapping("/add-weather")
	public String  AddWeather(
			@ModelAttribute WeatherHistory weatherHistory
			
			) {
		
		weatherHistoryBO.addWeatherHistory(weatherHistory);
		return "redirect:/weather/weather-list";
		
		
	}
	

}
