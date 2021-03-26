package com.hs.s3.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountDAO accountDAO;
	
	public List<AccountDTO> getList(AccountDTO accountDTO) throws Exception{
		return accountDAO.getList(accountDTO);
	}
	
	public int setInsert(AccountDTO accountDTO) throws Exception {
		//1. Random
		//2. Time
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
//		System.out.println(time);
		
		String t = time+"";
		t = String.valueOf(time);
		
		String result=t.substring(0, 4)+"-";
		result = result+t.substring(4, 8)+"-";
		result = result+t.substring(8);
		
//		System.out.println(result);
		
		//SimpleDateFormat
//		SimpleDateFormat sd = new SimpleDateFormat("ddyyyyMM-hhmmss-S");
//		String r = sd.format(ca.getTime());
//		System.out.println(r);
				
		//3. Java API
//		String str = UUID.randomUUID().toString();
//		System.out.println(str);
		
		accountDTO.setAccountNumber(result);
		return accountDAO.setInsert(accountDTO);
		
	}
	
}
