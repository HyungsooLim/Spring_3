package com.hs.s3.board.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

	@Autowired
	private CommentsDAO commentsDAO;
	
	
	public List<CommentsDTO> getList(CommentsDTO commentsDTO) throws Exception {
		return commentsDAO.getList(commentsDTO);
	}
	
	public int setInsert(CommentsDTO commentsDTO) throws Exception {
		return commentsDAO.setInsert(commentsDTO);
	}
	
	public int setDelete(int[] commentNum) throws Exception {
		int result = 0;
		for(int cn:commentNum) {
			result = commentsDAO.setDelete(cn);
		}
		return result;
	}
	
}