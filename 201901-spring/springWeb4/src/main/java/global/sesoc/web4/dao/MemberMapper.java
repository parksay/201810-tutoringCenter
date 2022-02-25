package global.sesoc.web4.dao;

import java.util.ArrayList;

import global.sesoc.web4.vo.Member;

/**
 * 회원정보 관련 Mybatis 사용 메서드.
 * customerMapper.xml의 id와 매핑
 */
public interface MemberMapper {
	//회원정보 저장
	public int insert(Member member);
	//ID로 해당 회원 정보 검색
	public Member selectOne(String id);
	//전체 회원정보 목록 검색
	public ArrayList<Member> getList();
	//ID로 해당 회원 정보 삭제
	public int delete(String id);
	
}
