package com.webmvc.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webmvc.springboot.app.models.DetailsDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	/*
	 * Note: By default if we put our .jsp files in the src/main/webapp folder, we can avoid returning with extention(.jsp). 
	 * Add the properties to change the views directory
	 * put the css files at the webapp level or in resource static folder
	 */
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home called");
		return "index" ;
	}
	
	/*
	 * Using the HttpServletRequest to get the parameters from client
	 */
	@RequestMapping("/add")
	public String add(HttpServletRequest httpServletRequest, HttpSession httpSession) {
		System.out.println("add called");
		int num1 = Integer.valueOf(httpServletRequest.getParameter("num1"));
		int num2 = Integer.valueOf(httpServletRequest.getParameter("num2"));
		int result = num1 + num2;
		httpSession.setAttribute("result", result);
		return "result";
	}
	
	/*
	 * Catch the parameters from client using method params
	 * make sure names of should be as per the URI like num1 ,num2
	 */
	@RequestMapping("/addv1")
	public String addv1(int num1, int num2, HttpSession httpSession) {
		System.out.println("add called");
		int result = num1 + num2;
		httpSession.setAttribute("result", result);
		return "result";
	
	}
	
	/*
	 * Catch the parameters from client using method params and @RequestParam("")
	 * make sure names in "" of @RequestParam("") should be as per the URI like num1 ,num2
	 */
	@RequestMapping("/addv2")
	public String addv2(@RequestParam("num1") int n1, @RequestParam("num2") int n2, HttpSession httpSession) {
		System.out.println("add called");
		int result = n1 + n2;
		httpSession.setAttribute("result", result);
		return "result";
	
	}
	
	
	/*
	 * Catch the parameters from client using method params and @RequestParam("")
	 * make sure names in "" of @RequestParam("") should be as per the URI like num1 ,num2
	 * Instead of HttpSession lets go with Architecture MVC by introducing the Model
	 */
	@RequestMapping("/addv3")
	public String addv3(@RequestParam("num1") int n1, @RequestParam("num2") int n2, Model model) {
		System.out.println("add called");
		int result = n1 + n2;
		model.addAttribute("result", result);
		return "result1";
	
	}
	
	/*
	 * Catch the parameters from client using method params and @RequestParam("")
	 * make sure names in "" of @RequestParam("") should be as per the URI like num1 ,num2
	 * Instead of HttpSession lets go with Architecture MVC by introducing the ModelAndView
	 */
	@RequestMapping("/addv4")
	public ModelAndView addv4(@RequestParam("num1") int n1, @RequestParam("num2") int n2, ModelAndView modelAndView) {
		int result = n1 + n2;
		modelAndView.addObject("result", result);
		modelAndView.setViewName("result1");
		return modelAndView;
	}
	

	
	/*
	 * Catch the parameters from client using method params and @RequestParam("")
	 * make sure names in "" of @RequestParam("") should be as per the URI like num1 ,num2
	 * Instead of HttpSession lets go with Architecture MVC by introducing the ModelAndView
	 */
	
	@RequestMapping("/home1")
	public String home1() {
		System.out.println("home1 called");
		return "index1" ;
	}
	
	//Method level @ModelAttribute("detailsDto1")
	@ModelAttribute("course")
	public String getCourse() {
		return "Java";
	}
	//Catch details from clients at param level using @ModelAttribute("detailsDto1")
	@RequestMapping("/addData")
	public String addData(@ModelAttribute("detailsDto1") DetailsDto detailsDto) {
		return "result2";
	}

}
