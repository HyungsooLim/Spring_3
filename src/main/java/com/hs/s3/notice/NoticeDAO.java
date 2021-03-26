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
	public int setInsert(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + ".setInsert", noticeDTO);
	}

	// --- setDelete ---------------------------------------
	public int setDelete(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+".setDelete", noticeDTO);
	}
	
	// --- setUpdate ---------------------------------------
	public int setUpdate(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.update(NAMESPACE+".setUpdate", noticeDTO);
	}
}
