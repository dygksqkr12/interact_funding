package com.kh.interactFunding.funding.model.service;

import java.util.List;



import java.util.Map;

import com.kh.interactFunding.funding.model.vo.Attachment;
import com.kh.interactFunding.funding.model.vo.Funding;

import com.kh.interactFunding.member.model.vo.Member;

import com.kh.interactFunding.funding.model.vo.FundingExt;


public interface FundingService {
	
	//김윤수
	
	//김경태
	
	//김주연
	List<FundingExt> statusYList(Member loginMember);
	List<FundingExt> statusNList(Member loginMember);
	int ready1FundingInsertNo(Funding funding);
	int saveCharge(Map<String, Object> param);
	int saveBasicInfo(FundingExt funding);
	int insertAttachment(Attachment attach);
	int saveStory(Funding funding);
	int finalSubmit(Funding funding);
	
	//박요한
	List<Funding> news(Map<String, Object> param);
	List<Funding> community(Map<String, Object> param);
	List<Funding> supporter(Map<String, Object> param);
	
	//배기원
	public List<Funding> indexfundingList();
	List<Funding> indexEarlyList();
	int indexTotalContents();
	public List<Funding> indexfundinglike();
	//이승우
	public List<Funding> fundingList(Map<String, Object> map);



	
	//천호현
	public Funding selectOneFunding(int funding_no);
	public int selectOneFunding2(int funding_no);

}
