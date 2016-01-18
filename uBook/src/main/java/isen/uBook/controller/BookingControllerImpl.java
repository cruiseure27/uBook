package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.model.Booking;
import isen.uBook.repository.BookingRepository;
import isen.uBook.repository.MemberRepository;
import isen.uBook.repository.PlaceRepository;
import isen.uBook.repository.RessourceRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BookingControllerImpl implements BookingController{
	
	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private RessourceRepository ressourceRepository;
	
	static String VIEW_NAME = "/uBook/booking";
	
	@Override
	public ModelAndView crudChange(Booking booking, BindingResult bindingResult) {
		log.info(booking.getMember().getId().toString());
		if (bindingResult.hasErrors()) {
			log.warn("There are errors! " + bindingResult);
			return getBookingList();
		}
		bookingRepository.save(booking);
		return getBookingList();
	}

	@Override
	public ModelAndView getBookingList() {
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("booking", new Booking());
		view.addObject("bookingsList",bookingRepository.findAll());
		view.addObject("membersList", memberRepository.findAll());
		view.addObject("placesList", placeRepository.findAll());
		view.addObject("ressourcesList", ressourceRepository.findAll());
		return view;
		
	}

	@Override
	public Booking getBooking(Integer id) {
		return (Booking) bookingRepository.findOne(id);
	}

}
