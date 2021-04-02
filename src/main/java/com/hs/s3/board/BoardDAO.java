package com.hs.s3.board;

import java.util.List;

import com.hs.s3.util.Pager;

public interface BoardDAO {
	//상수, 추상메서드
	//접근 지정자는 무조건 public abstract
	
	//list
	public abstract List<BoardDTO> getList(Pager pager) throws Exception;

}
