package com.hs.s3.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account/**")
public class AccountController {

	
	@RequestMapping(value="accountList")
	public void getList() throws Exception {
		
	}
	
	
	
	
	
}
