package com.hs.s3.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hs.s3.util.DBConnector;

@Repository
public class BankbookDAO {
	@Autowired
	DBConnector dbConnector;

	// BANKBOOK 전체 조회
	public List<BankbookDTO> getList() throws Exception {
		Connection con = dbConnector.getConnection();
		String sql = "select * from BANKBOOK";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<BankbookDTO> ar = new ArrayList<BankbookDTO>();
		while (rs.next()) {
			BankbookDTO bankbookDTO = new BankbookDTO();
			bankbookDTO.setBookNumber(rs.getLong("BOOKNUMBER"));
			bankbookDTO.setBookName(rs.getString("BOOKNAME"));
			bankbookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankbookDTO.setBookSale(rs.getString("BOOKSALE"));
			ar.add(bankbookDTO);
		}
		rs.close();
		ps.close();
		con.close();
		
		return ar;
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) throws Exception {
		Connection con = dbConnector.getConnection();
		String sql = "select * from BANKBOOK where booknumber=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, bankbookDTO.getBookNumber());
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			bankbookDTO.setBookName(rs.getString("BOOKNAME"));
			bankbookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankbookDTO.setBookSale(rs.getString("BOOKSALE"));
		}else {
			bankbookDTO = null;
		}

		rs.close();
		ps.close();
		con.close();

		return bankbookDTO;
	}// === getSelect method END ===
	
	public int setWrite(BankbookDTO bankbookDTO) throws Exception{
		Connection con = dbConnector.getConnection();
		String sql = "insert into BANKBOOK\n"
				+ "values(bankbook_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bankbookDTO.getBookName());
		ps.setDouble(2, bankbookDTO.getBookRate());
		ps.setString(3, bankbookDTO.getBookSale());
		int result = ps.executeUpdate();
		
		if(result==0) {
			bankbookDTO=null;
		}
		
		ps.close();
		con.close();
		
		return result;
	}

}
