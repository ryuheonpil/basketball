package service;

import java.util.List;

import model.F_board;

public interface FreeBoardService {
	
	public int m_freeSearch(String title);
	public int m_freeWrite(F_board f_board); 
	public int m_freeUpdate(F_board f_board);
	public int m_freeDelete(int b_no);
	public F_board m_freeSelectOne(int b_no);
	public List<F_board> m_freeSelectAll();
}
