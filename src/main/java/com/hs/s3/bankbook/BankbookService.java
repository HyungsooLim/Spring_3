package com.hs.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankbookService {
	@Autowired
	private BankbookDAO bankbookDAO;

	public List<BankbookDTO> getList() throws Exception {
		return bankbookDAO.getList();
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) throws Exception {
		return bankbookDAO.getSelect(bankbookDTO);
	}

}
