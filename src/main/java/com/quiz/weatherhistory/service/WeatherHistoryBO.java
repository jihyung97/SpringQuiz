package com.quiz.weatherhistory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.weatherhistory.domain.WeatherHistory;
import com.quiz.weatherhistory.mapper.WeatherHistoryMapper;

@Service
public class WeatherHistoryBO {
	
	@Autowired
	WeatherHistoryMapper weatherHistoryMapper;
	
	public void addWeatherHistory(WeatherHistory weatherHistory) {
		weatherHistoryMapper.insertWeatherHistory(weatherHistory);
	}
	public List<WeatherHistory> getWeatherHistoryList(){
		return weatherHistoryMapper.selectWeatherHistoryList();
	}

}
