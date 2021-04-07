package com.hs.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	// ----------------------------------- memberUpdate
	// -------------------------------------------------------------------
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberUpdate(memberDTO);
	}
	
	// ----------------------------------- memberDelete
	// -------------------------------------------------------------------
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberDelete(memberDTO);
	}

	// ----------------------------------- memberLogin
	// -------------------------------------------------------------------
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberLogin(memberDTO);
	}

	// ----------------------------------- memberJoin
	// -------------------------------------------------------------------	
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar) throws Exception {
		//1. 저장할 폴더 지정
		
		
		
		
		return 0;
		//return memberDAO.memberJoin(memberDTO);
	}
}
