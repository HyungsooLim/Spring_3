package com.hs.s3.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hs.s3.board.BoardDTO;
import com.hs.s3.board.BoardFileDTO;
import com.hs.s3.board.BoardService;
import com.hs.s3.util.FileManager;
import com.hs.s3.util.Pager;
import com.hs.s3.util.Pager_backUp;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;

	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private HttpSession session;
	

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
	public int setInsert(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		
		long num = noticeDAO.getNum();
		
		boardDTO.setNum(num);
		
		int result = noticeDAO.setInsert(boardDTO);
		
		//글 번호 찾기
		
		for (MultipartFile mf : files) {
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			String fileName = fileManager.save("notice", mf, session);
			
			boardFileDTO.setNum(num);
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriginName(mf.getOriginalFilename());
			
			noticeDAO.setFileInsert(boardFileDTO);
		} // --- for END ---

		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}

}
