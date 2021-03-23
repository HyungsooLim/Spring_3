package com.hs.s3.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	// memberJoin
	// URL : /member/memberJoin GET
	@RequestMapping(value = "/member/memberJoin", method = RequestMethod.GET)
	public String memberJoin() {

		return "member/memberJoin";
	}

	// memberJoin2 -> 회원가입 진행
	// URL : /member/memberJoin POST
//	@RequestMapping(value = "/member/memberJoin", method = RequestMethod.POST)
//	public void memberJoin(MemberDTO memberDTO) throws Exception {
//		
//		int result = memberService.memberJoin(memberDTO);
//		if (result != 0) {
//			System.out.println("회원가입 성공");
//		} else {
//			System.out.println("회원가입 실패");
//		}
//	}

	// memberJoin print
	// URL : /member/memberLogin
	@RequestMapping(value = "/member/memberLogin", method = RequestMethod.GET)
	public String memberLogin() {
//		System.out.println(name);
//		System.out.println(age);
		System.out.println("Member Login");
		return "member/memberLogin";
	}

	// memberLogin2 print
	@RequestMapping(value = "/member/memberLogin", method = RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, ModelAndView modelAndView) throws Exception {
	
		memberDTO = memberService.memberLogin(memberDTO);
		
		modelAndView.addObject("DTO", memberDTO);
		modelAndView.setViewName("member/memberPage");
		
		return modelAndView;
	}// === memberLogin method END ===
}
