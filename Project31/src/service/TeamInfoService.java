package service;

import java.util.List;

import model.Team_intro;

public interface TeamInfoService {
	public int t_infoWrite(Team_intro team_intro); //insert
	public int t_infoUpdate(Team_intro team_intro); //update
	public Team_intro t_infoSelectOne(int t_no); //selectOne
	public List<Team_intro> t_infoMemberList(); //selectAll
}
