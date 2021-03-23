package com.hs.s3.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hs.s3.MyAbstractTest;

public class BankbookDAOTest extends MyAbstractTest {
	@Autowired
	private BankbookDAO bankbookDAO;
	
	@Test
	public void setUpdateTest() throws Exception {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(30L);
		
		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
		
		bankbookDTO.setBookName("New Product");
		
		int result = bankbookDAO.setUpdate(bankbookDTO);
		
		assertEquals(1, result);
	}
	
//	@Test
	public void setDeleteTest() throws Exception {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(32L);
		int result = bankbookDAO.setDelete(bankbookDTO);
		assertEquals(1, result);
	}
	
	
//	@Test
	public void getListTest() throws Exception {
		List<BankbookDTO> ar = bankbookDAO.getList();
		assertNotEquals(0, ar.size());
	}

//	@Test
	public void getSelectTest() throws Exception {
		BankbookDTO bankbookDTO = bankbookDAO.getSelect(null);

		assertNotNull(bankbookDTO);
	}

//	@Test
	public void setWriteTest() throws Exception {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookName("Test");
		bankbookDTO.setBookRate(0.12);
		bankbookDTO.setBookSale("Y");
		int result = bankbookDAO.setWrite(bankbookDTO);

		assertEquals(1, result);
	}

}
