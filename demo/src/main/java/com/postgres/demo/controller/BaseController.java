package com.postgres.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.demo.dto.MemberDataRequest;
import com.postgres.demo.service.MemberService;

@RestController
@RequestMapping("/member/")
public class BaseController {

	@Autowired
	MemberService service;
	
	@RequestMapping("/save")
	public String saveMemberData()
	
	{
		
		MemberDataRequest request = new MemberDataRequest();
		request.setMemberId((long) 1005);
		request.setMemberName("Ashish");
		request.setMemberAddress("Mumbai");
		System.out.println("hi");
		service.saveMemberData(request);
		return "saved";
	}
}
