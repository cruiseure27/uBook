package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.repository.MemberRepository;

@Controller
public class DisplayMemberControllerImpl implements DisplayMemberController {
	
	@Autowired
	private MemberRepository memberRepository;

	static String VIEW_NAME = "uBook/seeMembers";
	
	@Override
	public ModelAndView getBookingList(){
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("membersList",memberRepository.findAll());
		return view;
	}
	
	
}
