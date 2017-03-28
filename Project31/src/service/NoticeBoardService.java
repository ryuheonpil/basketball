package service;

import java.util.List;

import model.N_board;

public interface NoticeBoardService {
	public int m_noticeSearch(String title);
	public int m_noticeWrite(N_board n_board);
	public int m_noticeUpdate(N_board n_board);
	public int m_noticeDelete(int b_no);
	public N_board m_noticeSelectOne(int b_no);
	public List<N_board> m_noticeSelectAll();
}
