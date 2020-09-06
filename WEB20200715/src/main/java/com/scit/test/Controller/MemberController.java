package com.scit.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.VO.MemberVO;
import com.scit.test.service.MemberService;

@Controller
public class MemberController {
	
	
//	2번 방법 (빈으로 등록된 것 받)
//	사실, 요즘 버전은 @Autowired가 필요 없지만
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/joinform", method=RequestMethod.GET)
	public String MemberJoinForm() {
		
		System.out.println("회원 가입 폼 이동");
		
		return "member/joinform";
	}
	@RequestMapping(value="/member/join" ,method = RequestMethod.POST)
	public String MemberJoin(MemberVO member) {
		
//	원래는 MemberService 객체를 생성해서 메서드를 실행했어야 함.
//  그러나 빈으로 등록되어져 있기 때문에, 안해도 된다.
//	방법 1. 파라메터에 작성한다
//		단, 이는 메서드 안에서만 사용 가능함
//		2.멤버변수 형태로 사용
//		
//		int cnt = MemberService.MemberJoin(member);
//		
//		if(cnt==0) {
//			return "";
//		}else {
//			return "";
//		}
//		
		String page = memberService.MemberJoin(member);
		
		return page;
		
	}
}
