package com.hs.s3.member;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// ----------------------------------- memberUpdate
	// -------------------------------------------------------------------
	@RequestMapping(value = "memberUpdate")
	public void memberUpdate() throws Exception {
		
	}
	
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO, HttpSession session) throws Exception{
		int result = memberService.memberUpdate(memberDTO);
		if(result>0) {
			session.setAttribute("member", memberDTO);
		}
		return "redirect:../";
	}
	
	// ----------------------------------- memberDelete
	// -------------------------------------------------------------------
	@RequestMapping(value = "memberDelete")
	public String memberDelete(HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		int result = memberService.memberDelete(memberDTO);
		session.invalidate();
		return "redirect:../";
	}
	
	// ----------------------------------- memberPage
	// -------------------------------------------------------------------
	@RequestMapping(value = "memberPage")
	public void memberPage() throws Exception{
		
	}
	
	// ----------------------------------- memberLogout
	// -------------------------------------------------------------------
	@RequestMapping(value = "memberLogout", method = RequestMethod.GET)
	public String memberLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:../";
	}

	// ----------------------------------- memberLogin
	// -------------------------------------------------------------------
	@RequestMapping(value = "memberLogin")
	public void memberLogin() throws Exception {

	}

	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		memberDTO = memberService.memberLogin(memberDTO);
		session.setAttribute("member", memberDTO);
		return "redirect:../";
	}

	// ----------------------------------- memberJoin
	// -------------------------------------------------------------------
	@RequestMapping(value = "memberJoin")
	public void memberJoin() throws Exception {

	}

	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO, MultipartFile avatar, Model model) throws Exception {
		int result = memberService.memberJoin(memberDTO, avatar);
		
		// MultipartFile print -----------------------------------------------
		System.out.println("getName : "+avatar.getName());  // 파라미터명
		System.out.println("getOriginalFilename : "+avatar.getOriginalFilename()); // upload 시 파일명
		System.out.println("getSize : "+avatar.getSize()); // 파일의 크기 단위 = byte
		System.out.println("isEmpty : "+avatar.isEmpty()); // 파일의 존재유무
		
		
		String message = "회원가입 실패";
		String path = "../member/memberJoin";
		
		if(result>0) {
			message="회원가입 성공";
			path="../";
		}
		
		model.addAttribute("msg", message);
		model.addAttribute("path", path);

		return "common/commonResult";
	}
	
	@RequestMapping(value="memberJoinCheck")
	public void memberJoinCheck() throws Exception {
		
	}

}
