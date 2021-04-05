package com.hs.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.s3.util.Pager_backUp;

@Service
public class BankbookService {
	@Autowired
	private BankbookDAO bankbookDAO;

	public List<BankbookDTO> getList(Pager_backUp pager) throws Exception {
		// 1. perPage, perBlock 세팅
		long perPage = 10; // 한 페이지 당 보여줄 글의 개수
		long perBlock = 5; // 한 블럭 당 보여줄 숫자의 개수
		
		// 2. startRow, lastRow 계산
		long startRow = (pager.getCurPage()-1)*perPage+1;
		long lastRow = pager.getCurPage()*perPage;
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		
		// 3. totalCount
		long totalCount = bankbookDAO.getTotalCount(pager);
		
		// 4. totalPage
		long totalPage = totalCount / perPage;
		if(totalCount % perPage !=0) {
			totalPage++;
		}
		
		// 5. totalBlock
		long totalBlock = totalPage / perBlock;
		if(totalPage % perBlock !=0) {
			totalBlock++;
		}
		
		// 6. curBlock
		long curBlock = pager.getCurPage() / perBlock;
		if(pager.getCurPage() % perBlock != 0) {
			curBlock++;
		}
		
		// 7. startNum, lastNum
		long startNum = (curBlock-1)*perBlock+1;
		long lastNum = curBlock*perBlock;
		
		// 8. curBlock == totalBlock 일때
		if(curBlock==totalBlock) {
			lastNum=totalPage;
		}
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		
		// 9. 이전
		if(curBlock != 1) {
			pager.setPre(true);
		}
		
		// 10. 이후
		if(curBlock != totalBlock) {
			pager.setNext(true);
		}
		
		
		return bankbookDAO.getList(pager);
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) throws Exception {
		return bankbookDAO.getSelect(bankbookDTO);
	}
	
	public int setDelete(BankbookDTO bankbookDTO) throws Exception {
		return bankbookDAO.setDelete(bankbookDTO);
	}
	
	public int setUpdate(BankbookDTO bankbookDTO) throws Exception {
		return bankbookDAO.setUpdate(bankbookDTO);
	}

}
