package com.hs.s3.notice;

import java.math.MathContext;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.s3.util.Pager;

@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;

	// --- getList ---------------------------------------
	public List<NoticeDTO> getList(Pager pager) throws Exception {
		long perPage = 10; // 한 페이지당 보여줄 글의 개수
		long perBlock = 5; // 한 블럭 당 보여줄 숫자의 개수

		// -------- startRow, lastRow 계산 ---------
		long startRow = (pager.getCurPage() - 1) * perPage + 1;
		long lastRow = pager.getCurPage() * perPage;

		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		// -----------------------------------------

		// -----------------------------------------
		// 1. totalCount
		long totalCount = noticeDAO.getTotalCount();
		System.out.println("totalCount : "+totalCount);

		// 2. totalPage
		long totalPage = totalCount / perPage;
		if (totalCount % perPage != 0) {
			totalPage++;
		}

		// 3. totalBlock
		long totalBlock = totalPage / perBlock;
		if (totalPage % perBlock != 0) {
			totalBlock++;
		}
		
		// 4. curBlock
		long curBlock = pager.getCurPage() / perBlock;
		if(pager.getCurPage() % perBlock != 0) {
			curBlock++;
		}
			
		// 5. startNum, lastNum
		long startNum = (curBlock-1)*perBlock+1;
		long lastNum = curBlock*perBlock;
		
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		
		System.out.println("TotalPage : "+totalPage);
		System.out.println("TotalBlock : "+totalBlock);
		System.out.println("CurBlock : "+curBlock);


		return noticeDAO.getList(pager);
	}

	// --- getSelect ---------------------------------------
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.getSelect(noticeDTO);
	}

	// --- setInsert ---------------------------------------
	public int setInsert(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setInsert(noticeDTO);
	}

	// --- setUpdate ---------------------------------------
	public int setUpdate(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setUpdate(noticeDTO);
	}

	// --- setDelete ---------------------------------------
	public int setDelete(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setDelete(noticeDTO);
	}
}
