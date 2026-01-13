package com.springbootstudy.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootstudy.app.domain.Category;
import com.springbootstudy.app.domain.Post;
import com.springbootstudy.app.service.DishService;
import com.springbootstudy.app.service.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;
	
	@Autowired
	private DishService dishService;
	
	@GetMapping({"/", "/postList"})
	public String PostList(@RequestParam(name="tag", required=false) Integer tag, Model model) {
		
		Integer selectedTag = (tag == null) ? 0 : tag; // 0 = 전체
	    
		List<Post> posts = postService.PostList(selectedTag);
		List<Category> categories = postService.getAllCategories();
	    
		categories.forEach(c -> System.out.println(c.getCategoryId() + " : " + c.getCname()));
	    
	    String selectedTagName;
	    if(selectedTag ==0) {
	    	selectedTagName= "전체";
	    } else {
	    	selectedTagName = categories.stream()
	    										.filter(c -> c.getCategoryId() == selectedTag)
	    										.map(Category::getCname)
	    										.findFirst()
	    										.orElse("전체");
	    }

		model.addAttribute("PList", posts);
		model.addAttribute("activeMenu", "travel");
		model.addAttribute("categories", categories);
		model.addAttribute("selectedTag", selectedTag);
		model.addAttribute("selectedTagName", selectedTagName);
		
		return "views/postList";
		
		
	}
	
	@GetMapping("/dishList")
	public String dishList(Model model) {
		
		model.addAttribute("DList", dishService.DishList());
		model.addAttribute("activeMenu", "dish");
		
		return "views/dishList";
	}
}
