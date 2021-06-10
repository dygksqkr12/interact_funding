package com.kh.interactFunding.member.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.interactFunding.member.model.dao.MemberDao;
import com.kh.interactFunding.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	//김윤수

	@Override
	public int selectEmailCheck(Map<String, Object> map) {
		return memberDao.selectEmailCheck(map);
	}

	@Override
	public int insertMemberIf(Member member) {
		return memberDao.insertMemberIf(member);
	}

	@Override
	public Member selectOneMember(Member member) {
		return memberDao.selectOneMember(member);
	}
	
	//김경태
	
	//김주연
	
	//박요한
	
	//배기원
	
	//이승우
	
	//천호현
	
}
