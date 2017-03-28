package service;

import java.util.Date;
import java.util.List;

import model.Total_match;

public interface MatchService {
	public int m_matchingAdd(Total_match total_match);
	public int m_matchingAdminAdd(Total_match total_match);
	public int m_matchingUpdate(Total_match total_match);
	public int m_matchingAdminUpdate(Total_match total_match);
	public int m_matchingAdminDelete(int no);
	public Total_match m_matchingSearch(int no);
	public List<Total_match> m_matchingSelectAll();
	public Date m_matchingToday(Date date);
}
