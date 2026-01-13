package com.springbootstudy.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UesrsController {
	
	@GetMapping("/usersjoin")
    public String joinPage() {
        return "views/usersJoinForm"; 
    }
	@GetMapping("/mypage")
    public String myPage() {
        return "views/mypageForm"; 
    }
 
}
