package com.hs.s3.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankbookDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.hs.s3.bankbook.BankbookDAO";

	// BANKBOOK 전체 조회
	public List<BankbookDTO> getList() throws Exception {
		return sqlSession.selectList(NAMESPACE + ".getList");
	}
//----------------------------------------------------------------------------------------------------------------------
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) throws Exception {
		bankbookDTO = sqlSession.selectOne(NAMESPACE + ".getSelect", bankbookDTO);
		return bankbookDTO;
	}// === getSelect method END ===
//----------------------------------------------------------------------------------------------------------------------
	public int setWrite(BankbookDTO bankbookDTO) throws Exception {
		int result = sqlSession.insert(NAMESPACE + ".setWrite", bankbookDTO);

		return result;
	}
//----------------------------------------------------------------------------------------------------------------------
}
