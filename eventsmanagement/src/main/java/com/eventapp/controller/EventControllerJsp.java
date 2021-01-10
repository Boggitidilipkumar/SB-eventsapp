package com.eventapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eventapp.service.EventService;

@Controller
public class EventControllerJsp {
	@GetMapping("/hello")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("hello");
		mv.addObject("key", "testing jsp page");
		return mv;
	}

	private EventService eventService;

	@Autowired
	public EventControllerJsp(EventService eventService) {
		this.eventService = eventService;
	}

	@GetMapping("/")
	public ModelAndView hello1(ModelAndView mv) {
		mv.setViewName("allEvents");
		mv.addObject("events", eventService.getAllEvents());
		return mv;

	}

}

/*
 * private ProductService productService;
 * 
 * @Autowired public ProductController(ProductService productService) {
 * this.productService = productService; }
 * 
 * @GetMapping("products") 
 * public ModelAndView hello(ModelAndView mv) {
 * mv.setViewName("allProducts");
 *  mv.addObject("message",
 * productService.getAllProduct()); 
 * return mv;
 * 
 * }
 */
