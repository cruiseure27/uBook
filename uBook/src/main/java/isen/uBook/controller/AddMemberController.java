package isen.uBook.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.model.Member;

public interface AddMemberController {
	
	/**
	 * Création ou modification d'un membre
	 * 
	 * @param booking
	 *            booking à créer ou modifier
	 * 
	 */
	@RequestMapping(value = "uBook/addMember", method = RequestMethod.POST)
	public ModelAndView crudChange(@ModelAttribute("member") Member member, BindingResult bindingResult);
	
	/**
	 * Récupération de la liste des résérvations
	 * 
	 */
	@RequestMapping(value = "uBook/addMember", method = RequestMethod.GET)
	public ModelAndView getMemberList();

}
