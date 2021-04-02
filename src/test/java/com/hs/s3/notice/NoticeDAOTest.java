package com.hs.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hs.s3.MyAbstractTest;
import com.hs.s3.board.notice.NoticeDAO;
import com.hs.s3.board.notice.NoticeDTO;
import com.hs.s3.util.Pager;

public class NoticeDAOTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;

	// --- getList ---------------------------------------
//	@Test
	public void getListTest() throws Exception {
		Pager pager = new Pager();
		List<NoticeDTO> ar = noticeDAO.getList(pager);
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
	@Test
	public void setInsertTest() throws Exception{
		for(int i=0;i<120;i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setTitle("test title"+i);
			noticeDTO.setWriter("test writer"+i);
			noticeDTO.setContents("test contents"+i);
			int result = noticeDAO.setInsert(noticeDTO);
			if(i%10==0) {
				Thread.sleep(500);
			}
		}
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
//	@Test
	public void setUpdateTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("title4");
		noticeDTO.setWriter("writer4");
		noticeDTO.setContents("나리는 꽃가루에 눈이 따끔해 (아야)\n"
				+ "눈물이 고여도 꾹 참을래\n"
				+ "내 마음 한켠 비밀스런 오르골에 넣어두고서\n"
				+ "영원히 되감을 순간이니까 \n"
				+ "\n"
				+ "우리 둘의 마지막 페이지를 잘 부탁해\n"
				+ "어느 작별이 이보다 완벽할까\n"
				+ "Love me only till this spring\n"
				+ "\n"
				+ "오 라일락 꽃이 지는 날 good bye\n"
				+ "이런 결말이 어울려 \n"
				+ "안녕 꽃잎 같은 안녕\n"
				+ "하이얀 우리 봄날의 climax\n"
				+ "아 얼마나 기쁜 일이야\n"
				+ "\n"
				+ "Ooh ooh \n"
				+ "Love me only till this spring\n"
				+ "봄바람처럼\n"
				+ "Ooh ooh \n"
				+ "Love me only till this spring\n"
				+ "봄바람처럼\n"
				+ "\n"
				+ "기분이 달아 콧노래 부르네 (랄라)\n"
				+ "입꼬리는 살짝 올린 채\n"
				+ "어쩜 이렇게 하늘은 더 바람은 또 완벽한 건지\n"
				+ "오늘따라 내 모습 맘에 들어\n"
				+ "\n"
				+ "처음 만난 그날처럼 예쁘다고 말해줄래\n"
				+ "어느 이별이 이토록 달콤할까\n"
				+ "Love resembles misty dream\n"
				+ "\n"
				+ "오 라일락 꽃이 지는 날 good bye\n"
				+ "이런 결말이 어울려\n"
				+ "안녕 꽃잎 같은 안녕\n"
				+ "하이얀 우리 봄날의 climax\n"
				+ "아 얼마나 기쁜 일이야\n"
				+ "\n"
				+ "Ooh ooh \n"
				+ "Love resembles misty dream\n"
				+ "뜬구름처럼\n"
				+ "Ooh ooh \n"
				+ "Love resembles misty dream\n"
				+ "뜬구름처럼\n"
				+ "\n"
				+ "너도 언젠가 날 잊게 될까\n"
				+ "지금 표정과 오늘의 향기도\n"
				+ "단잠 사이에 스쳐간\n"
				+ "봄날의 꿈처럼\n"
				+ "\n"
				+ "오 라일락 꽃이 지는 날 good bye\n"
				+ "너의 대답이 날 울려\n"
				+ "안녕 약속 같은 안녕\n"
				+ "하이얀 우리 봄날에 climax\n"
				+ "아 얼마나 기쁜 일이야\n"
				+ "\n"
				+ "Ooh ooh \n"
				+ "Love me only untill this spring\n"
				+ "봄바람처럼\n"
				+ "Ooh ooh \n"
				+ "Love me only untill this spring\n"
				+ "봄바람처럼\n"
				+ "\n"
				+ "Ooh ooh \n"
				+ "Love resembles misty dream\n"
				+ "뜬구름처럼\n"
				+ "Ooh ooh \n"
				+ "Love resembles misty dream\n"
				+ "뜬구름처럼\n"
				+ " ");
		noticeDTO.setNum(4L);
		int result = noticeDAO.setUpdate(noticeDTO);
		assertEquals(1, result);
	}
}
