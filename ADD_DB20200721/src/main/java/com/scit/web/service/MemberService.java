package com.scit.web.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web.dao.MemberDAO;
import com.scit.web.dao.MemberMapper;
import com.scit.web.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private HttpSession session;
	
	public String memberJoin(MemberVO member) {
		int cnt =0;
		cnt =dao.memberJoin(member);
		String page="";
		if(cnt == 0) {
			page="redirect:joinFail";
		}else {
			 page="redirect:/";
		}
		return page;
	}
	
	public ArrayList<MemberVO> joinList(){
		
		//여기 혹은 컨트롤러에서 로그인된 사람들만 보여주게 하는 처리를 한다.
		//스코프에 값이 있냐 없냐.
		
		return dao.joinList();
	}
	
	public int memberDelete(String member_id) {
		
		int cnt=dao.memberDelete(member_id);
		
		return cnt;
	}
	
	public MemberVO memberSelectOne(String member_id) {
		
		MemberVO member = dao.memberSelectOne(member_id);
		
		return member;
	}
	public int memberUpdate(MemberVO member) {
		int cnt = dao.memberUpdate(member);
		return cnt;
	}
	
	public String memberLogin(MemberVO member) {
		//로그인 성공 여부에 따라서 리턴될 
		String page ="";
		
		MemberVO loginCheck = dao.memberSelectOne(member.getMember_id());
		//여기서 Null 체크를 해줘야하고, 회원가입이 되어있지 않은, 값을 비교하면
		//그런 객체가 .getMember_pw를 호출하면 널포인터 익셉션이 뜬다.
		if(loginCheck!=null&&loginCheck.getMember_pw().equals(member.getMember_pw())) {
			//로그인 성공
			//SessionScope가 필요- > HTTPSession이 Session 스코프
			//Model과 비슷하다. 모양이 addAttribute()
			//(스트링, 오브젝트) 어떤 객체가 들어올 지 모르니까.
			//그래서 나중에 오브젝트에서 스트링으로 꺼낼 때는 다시 형변환함.
			session.setAttribute("loginId",member.getMember_id());
			page = "redirect:/";
			
		}else {
			//로그인 실패
			//입력데이터가 유지가 되니까, 전에 입력한 아이디 비밀번호가 유지되니까
			//리다이렉트
			page = "redirect:/member/loginForm";
		}
		
		return page;
	}
	public void memberLogout() {
		//session에서 로그인 정보를 삭제하는 기능
		
//		싹 다 지워지는 것.
//		session.invalidate();
//		하나씩 지우는 것. 지정된 이름으로
		session.removeAttribute("loginId");
	}
	
}
