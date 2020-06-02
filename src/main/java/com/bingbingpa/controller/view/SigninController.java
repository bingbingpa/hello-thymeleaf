package com.bingbingpa.controller.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Sign in 처리
 * 
 * @author jeongdae
 */
@Slf4j
@Controller
@RequestMapping("/sign")
public class SigninController {
	

	/**
	 * Sign in 페이지
	 * @param request
	 * @param model
	 * @return
	 */
	@GetMapping("/signin")
	public String signin(HttpServletRequest request, Model model) {

		return "/sign/signin";
	}
}
