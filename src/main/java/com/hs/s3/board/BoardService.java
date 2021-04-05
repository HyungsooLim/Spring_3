package com.hs.s3.board;

import java.util.List;

import com.hs.s3.util.Pager;
import com.hs.s3.util.Pager_backUp;

public interface BoardService {

		//list
		public abstract List<BoardDTO> getList(Pager pager) throws Exception;

		//글 조회
		public abstract BoardDTO getSelect(BoardDTO boardDTO) throws Exception;
			
		//글 추가
		public abstract int setInsert(BoardDTO boardDTO) throws Exception;
		
		//글 수정
		public abstract int setUpdate(BoardDTO boardDTO) throws Exception;
		
		//글 삭제
		public abstract int setDelete(BoardDTO boardDTO) throws Exception;
	
	
}
