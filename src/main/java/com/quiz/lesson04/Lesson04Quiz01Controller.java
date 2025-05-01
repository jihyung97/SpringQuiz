package com.quiz.lesson04;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.domain.Seller;
import com.quiz.lesson04.service.Lesson04BO;
@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	@Autowired
	private Lesson04BO lesson04BO;
	
	@RequestMapping(path="/add-seller-view", method = RequestMethod.GET)
	public String addSellerView() {
		return "lesson04/addSeller";
	}
	
	@PostMapping("/add-Seller")
	public String addSeller(
			@RequestParam ("nickname")String nickname, 
			@RequestParam ("profileUrl")String profileUrl, 
			@RequestParam(value="temperature", defaultValue = "3.5") double temperature
			) {
		lesson04BO.addSeller(nickname, profileUrl, temperature);
		return "lesson04/afterAddSeller";
		
	}
	
	@GetMapping("/seller-info-view")
	public String selectUserView(Model model,
			@RequestParam(value="id",required = false) Integer id
			) {
		// db select
		if(id == null) {
			Seller seller = lesson04BO.getLatestSeller();
			
			// model에 데이터 담아두기 => view가 model에서 꺼내 사용
			model.addAttribute("result", seller);
			model.addAttribute("title", "방금 등록한 셀러 정보");
		}else {
			Seller seller = lesson04BO.getSellerById(id);
			model.addAttribute("result", seller);
			model.addAttribute("title", "방금 등록한 셀러 정보");
			
		}
	
		// 화면
		return "lesson04/latestSeller";
	}
	
	

}
