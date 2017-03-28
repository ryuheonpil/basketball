package service;

import java.util.List;

import model.Team_f_board;


public interface TeamFreeboardService {
	public List<Team_f_board> t_freeSelectAll(); //selectAll
	public List<Team_f_board> t_freeSearch(String title); //selectBySearch
	public int t_freeWrite(Team_f_board team_f_board); //insert
	public int t_freeUpdate(Team_f_board team_f_board); //update
	public int t_freeDlete(int b_no); //delete
	public Team_f_board t_freeSelectOne(int b_no); //selectOne
	
}
