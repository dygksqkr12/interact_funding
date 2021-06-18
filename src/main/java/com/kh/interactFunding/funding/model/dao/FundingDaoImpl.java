package com.kh.interactFunding.funding.model.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.interactFunding.funding.model.vo.Attachment;
import com.kh.interactFunding.funding.model.vo.Funding;
import com.kh.interactFunding.funding.model.vo.FundingExt;
import com.kh.interactFunding.member.model.vo.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class FundingDaoImpl implements FundingDao{
	
	@Autowired
	private SqlSessionTemplate session;
	
	//김윤수
	
	//김경태
	
	//김주연
	@Override
	public List<FundingExt> statusYList(Member loginMember) {
		// TODO Auto-generated method stub
		return session.selectList("funding.statusYList",loginMember);
	}
	@Override
	public List<FundingExt> statusNList(Member loginMember) {
		// TODO Auto-generated method stub
		return session.selectList("funding.statusNList",loginMember);
	}
	@Override
	public int ready1FundingInsertNo(Funding funding) {
		// TODO Auto-generated method stub
		return session.insert("funding.ready1FundingInsertNo",funding);
	}
	@Override
	public int saveCharge(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.update("funding.saveCharge",param);
	}
	@Override
	public int saveBasicInfo(FundingExt funding) {
		// TODO Auto-generated method stub
		return session.update("funding.saveBasicInfo",funding);
	}
	@Override
	public int insertAttachment(Attachment attach) {
		// TODO Auto-generated method stub
		return session.insert("funding.insertAttachment",attach);
	}
	@Override
	public int saveStory(Funding funding) {
		// TODO Auto-generated method stub
		return session.update("funding.saveStory",funding);
	}
	@Override
	public int finalSubmit(Funding funding) {
		// TODO Auto-generated method stub
		return session.update("funding.finalSubmit",funding);
	}
	
	//박요한
	@Override
	public List<Funding> news(Map<String, Object> param) {
		return session.selectList("funding.news", param);
	}
	
	@Override
	public List<Funding> community(Map<String, Object> param) {
		return session.selectList("funding.community", param);
	}
	
	@Override
	public List<Funding> supporter(Map<String, Object> param) {
		return session.selectList("funding.supporter", param);
	}
	
	//배기원
	@Override
	public List<Funding> indexfundingList() {
		return session.selectList("funding.indexfundingList");
	}
	@Override
	public List<Funding> indexfundinglike() {
		return session.selectList("funding.indexfundinglike");
	}
	@Override
	public int indexTotalContents() {
		return session.selectOne("funding.indexTotalContents");
	}
	
	
	
	@Override
	public List<Funding> indexEarlyList() {
		// TODO Auto-generated method stub
		return session.selectList("funding.indexEarlyList");
	}
	//이승우
	@Override
	public List<Funding> fundingList(Map<String, Object> map) {
		int offset = (int)map.get("offset");
		int limit = (int)map.get("limit");
		RowBounds rowBounds = new RowBounds(offset, limit);
		log.debug("map@dap = {}",map);
		return session.selectList("funding.selectFundingList", map, rowBounds);
	}

	@Override
	public List<Map<String, String>> selectCategoryList() {
		return session.selectList("funding.selectCategoryList");
	}
	
	@Override
	public List<Funding> earlyList(Map<String, Object> map) {
		return session.selectList("funding.selectEarlyList", map);
	}
	
	@Override
	public int selectFundingListTotalContents(Map<String, Object> map) {
		return session.selectOne("funding.selectFundingListTotalContents", map);
	}
	
	//천호현

	@Override
	public Funding selectOneFunding(int funding_no) {
		return session.selectOne("funding.selectOneFunding", funding_no);
	}
	
	@Override
	public int selectOneFunding2(int funding_no) {
		return session.selectOne("funding.selectOneFunding2", funding_no);
	}

	
}
