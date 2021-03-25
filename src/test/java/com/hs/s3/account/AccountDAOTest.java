package com.hs.s3.account;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hs.s3.MyAbstractTest;

public class AccountDAOTest extends MyAbstractTest {

	@Autowired
	private AccountDAO accountDAO;
	
	@Test
	public void getListTest() throws Exception {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId("id3");
		List<AccountDTO> ar =accountDAO.getList(accountDTO);
		assertEquals(1, ar.size());
	}
	
//	@Test
	public void setInsertTest() throws Exception {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountNumber("66-666-6666");
		accountDTO.setAccountBalance(0L);
		accountDTO.setId("id3");
		accountDTO.setBookNumber(1L);
		int result = accountDAO.setInsert(accountDTO);
		assertEquals(1, result);
	}

}
