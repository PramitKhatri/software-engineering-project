package com.project.eclinic.Controller;



import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	

	
	@GetMapping("/Login")
	public String ShowLogin() {
		return "Login";
	}
	
	@PostMapping("/Login")
	public String DoLogin(@ModelAttribute User u, Model modeld) {
		if(u.getUsername().equals("doctor")&&u.getPassword().equals("1234")) {
			
			
			
			return "patient";
		}
		
		modeld.addAttribute("error","Please try again!!");
		return "Login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		
		session.invalidate();
		
		return "login";
	}

}
