package com.hs.s3.board.notice;

import java.util.List;

import com.hs.s3.board.BoardDTO;
import com.hs.s3.board.BoardFileDTO;

public class NoticeDTO extends BoardDTO {

	private List<BoardFileDTO> boardFiles;

	public List<BoardFileDTO> getBoardFiles() {
		return boardFiles;
	}

	public void setBoardFiles(List<BoardFileDTO> boardFiles) {
		this.boardFiles = boardFiles;
	}


	
	
	
	
}
