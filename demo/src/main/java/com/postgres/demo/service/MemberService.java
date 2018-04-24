package com.postgres.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgres.demo.dao.MemberDao;
import com.postgres.demo.dto.MemberDataRequest;
import com.postgres.demo.model.Member;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	

	Member member = new Member();
	
	
	public void saveMemberData(MemberDataRequest request) {
	
		
		member.setMemberId(request.getMemberId());
		member.setMemberName(request.getMemberName());
		member.setMemberAddress(request.getMemberAddress());
		dao.save(member);
		
	}

	
}
