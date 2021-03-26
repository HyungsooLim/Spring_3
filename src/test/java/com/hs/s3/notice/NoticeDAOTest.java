package com.hs.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hs.s3.MyAbstractTest;

public class NoticeDAOTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;

	// --- getList ---------------------------------------
//	@Test
	public void getListTest() throws Exception {
		List<NoticeDTO> ar = noticeDAO.getList();
		assertEquals(3, ar.size());
	}

	// --- getSelect ---------------------------------------
//	@Test
	public void getSelectTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1L);
		noticeDTO =noticeDAO.getSelect(noticeDTO);
		assertNotNull(noticeDTO);
	}

}
