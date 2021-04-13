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
	public int setUpdate(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		//1. file들을 HDD에 저장
		for(MultipartFile mf:files) {
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			String fileName = fileManager.save("notice", mf, session);
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriginName(mf.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
			//2. DB에 Insert
			noticeDAO.setFileInsert(boardFileDTO);
		}
		
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}
	
	public int setFileDelete(BoardFileDTO boardFileDTO) throws Exception {
		// 1. 조회
		boardFileDTO = noticeDAO.getFileSelect(boardFileDTO);
		
		// 2. table 삭제
		int result = noticeDAO.setFileDelete(boardFileDTO);
		
		// 3. HDD에서 삭제
		if(result>0) {
			fileManager.delete("notice", boardFileDTO.getFileName(), session);
		}
		
		return result;
	}
	
	public String setSummerFileUpload(MultipartFile file) throws Exception {
		String fileName = fileManager.save("notice", file, session);
		
		return fileName;
	}

	public boolean setSummerFileDelete(String fileName) throws Exception {
		boolean result = fileManager.delete("notice", fileName, session);
		return result;
	}
}
