package service;

import java.util.List;

import model.Team;
import model.Team_member;

public interface TeamService {
	public Team m_teamCheck(String t_name);
	public int m_teamCreate(Team team);
	public List<Team> m_teamSearch(String t_name);
	public Team_member t_join(Team_member team_member);
	public int t_withdraw(int t_no , int m_no);
}
