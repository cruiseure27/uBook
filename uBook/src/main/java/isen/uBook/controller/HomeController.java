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
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(){
		return "home";
	}
	
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public ModelAndView homeMenu(@Valid Integer numberOfChoice,BindingResult bindingResult){
//		ModelAndView view = new ModelAndView("/");
//		
//		if (bindingResult.hasErrors()) {
//			//log.warn("There are errors! " + bindingResult);
//			return view;
//		}
//		
//		if(numberOfChoice==1){
//			return view;
//		}
//		if(numberOfChoice==2){
//			
//			return view;
//		}
//		/*Envoi la liste des réservations pour pouvoir gérer dans le front la creation d'une nouvelle réservation*/
//		if(numberOfChoice==3){
//			view = new ModelAndView("/uBook/booking");
//			view.addObject("booking",bookingRepository.findAll());
//			return view;
//		}
//		if(numberOfChoice==4){
//			return view;
//		}
//		
//		//view.addObject("booking", new Booking());
//		return view;
//	}
}
