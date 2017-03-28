package service;

import java.util.List;

import model.R_board;

public interface RecruitService {
	public int m_recruitWrite(R_board r_board);
	public int m_recruitUpdate(R_board r_board);
	public int m_recruitDelete(int b_no);
	public R_board m_recruitSearch(int b_no);
	public List<R_board> m_recruitSelectAll();
}
