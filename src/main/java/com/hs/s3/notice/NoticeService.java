package com.hs.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;

	// --- getList ---------------------------------------
	public List<NoticeDTO> getList() throws Exception {
		return noticeDAO.getList();
	}
}
