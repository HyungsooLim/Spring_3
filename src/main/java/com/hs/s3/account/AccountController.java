package com.hs.s3.account;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hs.s3.member.MemberDTO;

@Controller
@RequestMapping("/account/**")
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	
	@RequestMapping(value="accountList")
	public void getList(HttpSession session) throws Exception {
		AccountDTO accountDTO = new AccountDTO();
		MemberDTO memberDTO=(MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		List<AccountDTO> ar =accountService.getList(accountDTO);
		
	}
	
	
	
	
	
}
