package com.quiz.ex_alternative.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/lesson06/ex01")
public class Lessson06ExController {
	
	
	@GetMapping("/add-user-view")
	public String addUserView() {
		return "lesson06/addUser";
		
	}
	
	
	
	//회원가입 진행- ajax가 한 요청
	@ResponseBody
	@PostMapping("/add-user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value="introduce",required = false) String introduce
			
			)
	{
		return "성공";
	}
	
	@GetMapping("/after-add-user-view")
	public String afterAddUserView(){
		return "lesson04/afterAddUser";
		}
	
	
	
	@GetMapping("/add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmark";
		
	}
	
	@GetMapping("/add-Bookmark")
	public String addBookmark() {
		return "lesson06/addBookmark";
		
	}
}


