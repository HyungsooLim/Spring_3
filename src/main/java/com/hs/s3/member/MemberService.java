package com.hs.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;

	// ----------------------------------- memberLogin
	// -------------------------------------------------------------------
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberLogin(memberDTO);
	}

	// ----------------------------------- memberJoin
	// -------------------------------------------------------------------	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberJoin(memberDTO);
	}
}
