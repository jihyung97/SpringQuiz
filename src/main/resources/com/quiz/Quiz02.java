package com.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Quiz02 {
	
	@RequestMapping("/1")
	public List<Map<String,Object>> movieList(){
		List<Map<String,Object>> list = new ArrayList();
		Map<String,Object> movie1 = new HashMap<>();
		movie1.put("rate", 15);
		movie1.put("director", "봉준호");
		movie1.put("time", 131);
		movie1.put("title", "기생충");
		
		list.add(movie1);
		
		Map<String,Object> movie2 = new HashMap<>();
		movie2.put("rate", 0);
		movie2.put("director", "로베르토 베니니");
		movie2.put("time", 116);
		movie2.put("title", "인생은 아름다워");
		
		list.add(movie2);
		
		Map<String,Object> movie3 = new HashMap<>();
		movie3.put("rate", 12);
		movie3.put("director", "크리스토퍼 놀란");
		movie3.put("time", 147);
		movie3.put("title", "인셉션");
		
		list.add(movie3);
		
		Map<String,Object> movie4 = new HashMap<>();
		movie4.put("rate", 19);
		movie4.put("director", "윤종빈");
		movie4.put("time", 133);
		movie4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		
		list.add(movie4);
		
		Map<String,Object> movie5 = new HashMap<>();
		movie5.put("rate", 15);
		movie5.put("director", "프란시스 로렌스");
		movie5.put("time", 137);
		movie5.put("title", "헝거게임");
		
		list.add(movie5);
		return list;
		
		

		
		
		
	}
	
	@RequestMapping("/2")
	public List<Map<String,Object>> Introduce(){
		List<Map<String,Object>> IntList = new ArrayList();
		Map<String,Object> Introducing1 = new HashMap<>();
		Introducing1.put("title", "안녕하세여");
		Introducing1.put("user", "jihyung");
		Introducing1.put("content", "안녕하세요");
		
		
		IntList.add(Introducing1);
		
		Map<String,Object> Introducing2 = new HashMap<>();
		Introducing2.put("title", "안녕하세여");
		Introducing2.put("user", "jihyung");
		Introducing2.put("content", "안녕하세요");
		
		
		IntList.add(Introducing2);
		
		Map<String,Object> Introducing3 = new HashMap<>();
		Introducing3.put("title", "헐대박");
		Introducing3.put("user", "ggeung");
		Introducing3.put("content", "ggeug....");
		
		
		IntList.add(Introducing3);
		
		Map<String,Object> Introducing4 = new HashMap<>();
		Introducing4.put("title", "오늘 데이트한 이야기");
		Introducing4.put("user", "jihyung");
		Introducing4.put("content", "...");
		
		
		IntList.add(Introducing4);
		
	
		return IntList;
		
		

		
		
		
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Board> ex02_6() {
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다");
		board.setUser("jihyung97");
		board.setContent("안녕하세요 등업 부탁드려요");
		
		
		return new ResponseEntity<> (board,HttpStatus.BAD_REQUEST);
		
	} 
	
	
	

}
