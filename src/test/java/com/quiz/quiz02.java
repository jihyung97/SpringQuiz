package com.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class quiz02 {
	
	@RequestMapping("/1")
	public List<Map<String,Object>> movieList(){
//		List<Map<String,Object>> list = new ArrayList();
//		Map<String,Object> movie = new HashMap<>();
//		movie.put("rate", 15);
//		movie.put("director", "봉준호");
//		movie.put("time", 131);
//		movie.put("title", "기생충");
//		
//		list.add(movie);
//		
//		movie.put("rate", 0);
//		movie.put("director", "로베르토 베니니");
//		movie.put("time", 116);
//		movie.put("title", "인생은 아름다워");
//		
//		list.add(movie);
//		
//		movie.put("rate", 12);
//		movie.put("director", "크리스토퍼 놀란");
//		movie.put("time", 147);
//		movie.put("title", "인셉션");
//		
//		list.add(movie);
//		
//		movie.put("rate", 19);
//		movie.put("director", "윤종빈");
//		movie.put("time", 133);
//		movie.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
//		
//		list.add(movie);
//		
//
//		movie.put("rate", 15);
//		movie.put("director", "프란시스 로렌스");
//		movie.put("time", 137);
//		movie.put("title", "헝거게임");
//		
//		list.add(movie);
//		return list;
		
		List<Map<String,Object>> list = new ArrayList<>();

		// 첫 번째 영화 데이터
		Map<String, Object> movie1 = new HashMap<>();
		movie1.put("rate", 15);
		movie1.put("director", "봉준호");
		movie1.put("time", 131);
		movie1.put("title", "기생충");
		list.add(movie1);
		
		// 두 번째 영화 데이터
		Map<String, Object> movie2 = new HashMap<>();
		movie2.put("rate", 0);
		movie2.put("director", "로베르토 베니니");
		movie2.put("time", 116);
		movie2.put("title", "인생은 아름다워");
		list.add(movie2);
		
		// 세 번째 영화 데이터
		Map<String, Object> movie3 = new HashMap<>();
		movie3.put("rate", 12);
		movie3.put("director", "크리스토퍼 놀란");
		movie3.put("time", 147);
		movie3.put("title", "인셉션");
		list.add(movie3);
		
		// 네 번째 영화 데이터
		Map<String, Object> movie4 = new HashMap<>();
		movie4.put("rate", 19);
		movie4.put("director", "윤종빈");
		movie4.put("time", 133);
		movie4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(movie4);
		
		// 다섯 번째 영화 데이터
		Map<String, Object> movie5 = new HashMap<>();
		movie5.put("rate", 15);
		movie5.put("director", "프란시스 로렌스");
		movie5.put("time", 137);
		movie5.put("title", "헝거게임");
		list.add(movie5);
		
		return list;  // 리스트 반환
		
		
	}
	
	

}
