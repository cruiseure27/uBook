package isen.uBook.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.model.Booking;



public interface BookingController {
	
	/**
	 * Création ou modification d'une reservation
	 * 
	 * @param booking
	 *            booking à créer ou modifier
	 * 
	 */
	@RequestMapping(value = "uBook/booking", method = RequestMethod.POST)
	public ModelAndView crudChange(@ModelAttribute("booking") Booking booking, BindingResult bindingResult);
	
	
	/**
	 * Récupération de la liste des résérvations
	 * 
	 */
	@RequestMapping(value = "uBook/booking", method = RequestMethod.GET)
	public ModelAndView getBookingList();

	/**
	 * Récupération d'une résérvation
	 * 
	 * @param id
	 *            Identifiant d'une résérvation
	 *
	 */
	@RequestMapping(value = "uBook/booking/{id}", 	method = RequestMethod.GET)
	public Booking getBooking(@PathVariable Integer id);

}
