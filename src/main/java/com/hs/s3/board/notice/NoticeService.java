package com.hs.s3.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.s3.board.BoardDTO;
import com.hs.s3.board.BoardService;
import com.hs.s3.util.Pager;
import com.hs.s3.util.Pager_backUp;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;

	// --- getList ---------------------------------------
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// -------- startRow, lastRow 계산 ---------
			pager.makeRow();
		// -------- Paging 계산 --------------------
			long totalCount = noticeDAO.getTotalCount(pager);
			pager.makeNum(totalCount);

		return noticeDAO.getList(pager);
	}

	
	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getSelect(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
