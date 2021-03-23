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
//	@Test
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

	// ----------- memberDelete Test
	// --------------------------------------------------------------------------------------------
//	@Test
	public void memberDeleteTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id8");
		int result = memberDAO.memberDelete(memberDTO);
		assertEquals(1, result);
	}

	// ----------- memberUpdate Test
	// --------------------------------------------------------------------------------------------
	@Test
	public void memberUpdateTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id7");
		memberDTO = memberDAO.memberLogin(memberDTO);

		memberDTO.setPw("testPw");
		memberDTO.setName("testName");
		memberDTO.setPhone("testPhone");
		memberDTO.setEmail("testEmail");

		int result = memberDAO.memberUpdate(memberDTO);
		
		assertEquals(1, result);
	}

} // ==========================================================================================
