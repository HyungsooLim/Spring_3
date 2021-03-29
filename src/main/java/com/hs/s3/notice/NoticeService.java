package com.hs.s3.notice;

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
		long perPage = 10; // 한 페이지당 보여줄 글의 갯수

		// -------- startRow, lastRow 계산 ---------
		long startRow = (pager.getCurPage() - 1) * perPage + 1;
		long lastRow = pager.getCurPage() * perPage;

		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		// -----------------------------------------
		
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
