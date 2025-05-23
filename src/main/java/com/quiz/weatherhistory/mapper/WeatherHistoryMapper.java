package com.quiz.weatherhistory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.weatherhistory.domain.WeatherHistory;

@Mapper
public interface WeatherHistoryMapper {
	public void insertWeatherHistory(WeatherHistory weatherhistory);
	public List<WeatherHistory> selectWeatherHistoryList();

}
