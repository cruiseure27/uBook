package isen.uBook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



public interface DisplayBookController {
	
	
	
	/**
	 * Récupération de la liste des résérvations
	 * 
	 */
	@RequestMapping(value = "uBook/reservations", method = RequestMethod.GET)
	public ModelAndView getBookingList();
	
	@RequestMapping(value = "uBook/reservations", method = RequestMethod.DELETE)
	public void deleteBookingById(Integer id);
}
