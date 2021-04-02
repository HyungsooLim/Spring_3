package com.hs.s3.board;

import java.util.List;

import com.hs.s3.util.Pager;

public interface BoardDAO {
	//상수, 추상메서드
	//접근 지정자는 무조건 public abstract
	
	//list
	public abstract List<BoardDTO> getList(Pager pager) throws Exception;

	//전체 글의 개수
	public abstract long getTotalCount(Pager pager) throws Exception;
	
	//글 조회
	public abstract BoardDTO getSelect(BoardDTO boardDTO) throws Exception;
	
	//hit update
	public abstract int setHitUpdate(BoardDTO boardDTO) throws Exception;
	
	//글 추가
	public abstract int setInsert(BoardDTO boardDTO) throws Exception;
	
	//글 수정
	public abstract int setUpdate(BoardDTO boardDTO) throws Exception;
	
	//글 삭제
	public abstract int setDelete(BoardDTO boardDTO) throws Exception;
}
