package isen.uBook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public interface DisplayMemberController {
	
	/**
	 * Récupération de la liste des résérvations
	 * 
	 */
	@RequestMapping(value = "uBook/seeMembers", method = RequestMethod.GET)
	public ModelAndView getBookingList();


}
