package com.biswajeet.websessiondemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biswajeet.websessiondemo.service.UserInfo;

@Controller
public class DemoController {

	/*
	 * @Autowired UserInfo userInfo;
	 */
	
	@RequestMapping("/open.do")
	public ModelAndView execute (HttpServletRequest request,
	        HttpServletResponse response) throws IOException{
		UserInfo userInfo = new UserInfo();
		HttpSession session = request.getSession();
		userInfo.setUserId("rout");
		userInfo.setFirstName("Biswajeet");
		userInfo.setLastName("Rout");
		session.setAttribute("userInfo", userInfo);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
}
