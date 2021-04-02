package com.hs.s3.board;

import java.util.List;

import com.hs.s3.util.Pager;

public interface BoardService {

	//list
	public abstract List<BoardDTO> getList(Pager pager) throws Exception;
	
	
}
