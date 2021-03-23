package com.hs.s3.member;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	private final String NAMESPACE = "com.hs.s3.member.MemberDAO";

	// ----------- memberUpdate
	// -------------------------------------------------------------------------------------------
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		// id를 제외하고 나머지 수정
		return sqlSession.update(NAMESPACE + ".memberUpdate", memberDTO);
	}

	// ----------- memberDelete
	// -------------------------------------------------------------------------------------------
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return sqlSession.delete(NAMESPACE + ".memberDelete", memberDTO);
	}

	// ----------- memberJoin
	// -------------------------------------------------------------------------------------------
	// memberJoin - 데이터를 받아서 DB에 insert 하는 메서드
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + ".memberJoin", memberDTO);
	}

	// ----------- memberLogin
	// -------------------------------------------------------------------------------------------
	// login - id pw 받아 조회
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".memberLogin", memberDTO);
	}

} // =============================================================================================
