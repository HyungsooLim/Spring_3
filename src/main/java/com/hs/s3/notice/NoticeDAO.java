package com.hs.s3.notice;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hs.s3.util.Pager;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.hs.s3.notice.NoticeDAO";

	// --- getList ---------------------------------------
	public List<NoticeDTO> getList(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE + ".getList", pager);
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
	
	// --- setHitUpdate ---------------------------------------
	public int setHitUpdate(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.update(NAMESPACE+".setHitUpdate", noticeDTO);
	}
}
