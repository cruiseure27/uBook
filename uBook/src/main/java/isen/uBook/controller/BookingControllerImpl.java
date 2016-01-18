package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.model.Booking;
import isen.uBook.repository.BookingRepository;

@Controller
public class BookingControllerImpl implements BookingController{
	
	@Autowired
	private BookingRepository bookingRepository;
	
	static String VIEW_NAME = "/uBook/booking";
	
	@Override
	public ModelAndView crudChange(Booking booking, BindingResult bindingResult) {
		ModelAndView view = new ModelAndView(VIEW_NAME);
		System.out.println(booking.getMember().getFirstName());
		if (bindingResult.hasErrors()) {
			//log.warn("There are errors! " + bindingResult);
			return view;
		}
		bookingRepository.save(booking);
		//view.addObject("booking", new Booking());
		return view;
	}

	@Override
	public ModelAndView getBookingList() {
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("booking", new Booking());
		return view;
		
	}

	@Override
	public Booking getBooking(Integer id) {
		return null;//(Booking) bookingRepository.findOne(id);
	}

}
