package com.hs.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.hs.s3.notice.NoticeDAO";

	// --- getList ---------------------------------------
	public List<NoticeDTO> getList() throws Exception {
		return sqlSession.selectList(NAMESPACE + ".getList");
	}

	// --- getSelect ---------------------------------------
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".getSelect", noticeDTO);
	}

	// --- setInsert ---------------------------------------
	public void setInsert() throws Exception {
		
	}

}
