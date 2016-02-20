package isen.uBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
		List<Booking> bookingList =bookingRepository.findAll();
		for(Booking book : bookingList){
			if(book.getRessource()==booking.getRessource()){
				if(book.getBeginDate().getTime()==booking.getBeginDate().getTime()){
					bindingResult.addError(new FieldError("beginDate","beginDate","Une réservation est déjà effectué à cette date !"));
					bindingResult.reject("beginDate","Une réservation est déjà effectué à cette date !");
					ModelAndView view = new ModelAndView(VIEW_NAME);
					view.addObject("errorDate",true);
					view.addObject("booking", new Booking());
					view.addObject("bookingsList",bookingRepository.findAll());
					view.addObject("membersList", memberRepository.findAll());
					view.addObject("placesList", placeRepository.findAll());
					view.addObject("ressourcesList", ressourceRepository.findAll());
					return view;
				}
			}
		}
		bookingRepository.save(booking);
		return getBookingList();
	}

	@Override
	public ModelAndView getBookingList() {
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("errorDate",false);
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
