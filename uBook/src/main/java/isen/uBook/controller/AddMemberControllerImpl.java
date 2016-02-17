package isen.uBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import isen.uBook.model.Member;
import isen.uBook.repository.MemberRepository;

@Controller
public class AddMemberControllerImpl implements AddMemberController{
	
	static String VIEW_NAME = "/uBook/addMember";
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public ModelAndView crudChange(Member member, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return getMemberList();
		}
		memberRepository.save(member);
		return getMemberList();
	}
	
	@Override
	public ModelAndView getMemberList() {
		ModelAndView view = new ModelAndView(VIEW_NAME);
		view.addObject("member", new Member());
		return view;
		
	}

}
