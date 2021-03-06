package kr.co.bitdaily.login.service;

import java.util.List;

import kr.co.bitdaily.repository.vo.Member;

public interface LoginService {
	public Member selectUserPassForLogin(Member member) throws Exception;
	public Member selectMemberByName(Member member) throws Exception;
	public List<Member> retrieveMember() throws Exception;
	public Member retrieveMemberInfo(String id) throws Exception;
	public void insertMemberInfo(Member member) throws Exception;
	public Member selectMemberSeq(String id) throws Exception;
//	public void registMember(Member memberVO) throws Exception;
//	public void deleteMember(String id) throws Exception;
}
