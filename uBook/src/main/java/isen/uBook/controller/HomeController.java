package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import isen.uBook.repository.BookingRepository;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	
	@RequestMapping(value = "/uBook", method = RequestMethod.GET)
	public String home(){
		return "home";
	}
}
