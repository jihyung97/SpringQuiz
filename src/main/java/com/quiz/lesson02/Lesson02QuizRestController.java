package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quiz.Quiz02;
import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.service.StoreBO;

@RestController
public class Lesson02QuizRestController {

   
	
	@Autowired // DI: spring bean 가져옴
	private StoreBO storeBO;
      
 
	
	// http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/quiz01")
	public List<Store> quiz02() {
		return storeBO.getStoreList(); // list -> JSON
	}

}
