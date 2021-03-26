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

	// --- setInsert ---------------------------------------
//	@Test
	public void setInsertTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("title6");
		noticeDTO.setWriter("writer6");
		noticeDTO.setContents("");
		int result = noticeDAO.setInsert(noticeDTO);
		assertEquals(1, result);
	}
	
	// --- setDelete ---------------------------------------
//	@Test
	public void setDeleteTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(5L);
		int result = noticeDAO.setDelete(noticeDTO);
		assertEquals(1, result);
	}
	
	// --- setUpdate ---------------------------------------
	@Test
	public void setUpdateTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("title2");
		noticeDTO.setWriter("writer2");
		noticeDTO.setContents("");
		noticeDTO.setNum(2L);
		int result = noticeDAO.setUpdate(noticeDTO);
		assertEquals(1, result);
	}
}
