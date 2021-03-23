package com.hs.s3.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hs.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest {
	@Autowired
	private MemberDAO memberDAO;

	// ----------- memberLogin Test
	// --------------------------------------------------------------------------------------------
//	@Test
	public void memberLoginTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id1");
		memberDTO.setPw("pw1");
		memberDTO = memberDAO.memberLogin(memberDTO);
		assertNotNull(memberDTO);
	}

	// ----------- memberJoin Test
	// --------------------------------------------------------------------------------------------
	@Test
	public void memberJoinTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id8");
		memberDTO.setPw("pw8");
		memberDTO.setName("name8");
		memberDTO.setPhone("010-8888-8888");
		memberDTO.setEmail("name8@naver.com");
		int result = memberDAO.memberJoin(memberDTO);
		assertEquals(1, result);
	}
}
