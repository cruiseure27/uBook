package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.repository.BookingRepository;
import lombok.extern.slf4j.Slf4j;

@Controller
public class DisplayBookControllerImpl implements DisplayBookController{

	@Autowired
	private BookingRepository bookingRepository;
	
	static String VIEW_NAME = "uBook/reservations";
	
	@Override
	public ModelAndView getBookingList(){
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("bookingsList",bookingRepository.findAll());
		return view;
	}
	
}
