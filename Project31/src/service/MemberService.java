package service;

import java.util.List;

import model.Member;

public interface MemberService {
	public int  m_login(Member member);
	public int m_idCheck(String m_id);
	public int m_join(Member member);
	public Member m_idSearch(String m_id);
	public Member m_pwSearch(String m_pw);
	public int m_modify(int m_no);
	public int m_withdraw(int m_no);
}
