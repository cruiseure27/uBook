package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.model.Booking;
import isen.uBook.repository.BookingRepository;
import isen.uBook.repository.MemberRepository;
import isen.uBook.repository.PlaceRepository;
import isen.uBook.repository.RessourceRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DisplayBookControllerImpl implements DisplayBookController{

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private RessourceRepository ressourceRepository;
	
	static String VIEW_NAME = "uBook/reservations";
	
	@Override
	public ModelAndView getBookingList(){
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("bookingsList",bookingRepository.findAll());
		return view;
	}
	
}
