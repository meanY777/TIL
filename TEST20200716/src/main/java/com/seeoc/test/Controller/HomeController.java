package com.seeoc.test.Controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seeoc.test.Service.MemberService;
import com.seeoc.test.VO.MemberVO;
import com.seeoc.test.VO.removeID;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		System.out.println("첫페이지가 뜨");
		return "home";
	}
	
	@RequestMapping(value="/member/joinForm", method=RequestMethod.GET)
	public String joinForm() {
		
		System.out.println("회원가입창으로?");
		return "member/joinForm";
	}
//	이거 			
	@RequestMapping(value="/member/checkForm", method = RequestMethod.POST)
	public String checkForm(MemberVO member) {
		
		String page =memberService.memberService(member);
		
		
		return page;
	}
	@RequestMapping(value="/member/table", method = RequestMethod.GET)
	public String toList(Model model) {
		ArrayList<MemberVO> list =memberService.list;
		
		model.addAttribute("list", list);
		return "member/listForm";
	}
	@RequestMapping(value="/member/remove", method = RequestMethod.GET)
	public String remove(removeID id) {
		
		memberService.removeMember(id);
		
		
		return "member/listForm";
	}
	
}
