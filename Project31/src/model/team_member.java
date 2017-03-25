package model;

public class team_member {
	private int t_no;
	private int m_no;
	private int m_grade;
	private String m_back;
	private String m_pos;
	private int m_height;
	private int m_weight;
	public int getT_no() {
		return t_no;
	}
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public int getM_grade() {
		return m_grade;
	}
	public void setM_grade(int m_grade) {
		this.m_grade = m_grade;
	}
	public String getM_back() {
		return m_back;
	}
	public void setM_back(String m_back) {
		this.m_back = m_back;
	}
	public String getM_pos() {
		return m_pos;
	}
	public void setM_pos(String m_pos) {
		this.m_pos = m_pos;
	}
	public int getM_height() {
		return m_height;
	}
	public void setM_height(int m_height) {
		this.m_height = m_height;
	}
	public int getM_weight() {
		return m_weight;
	}
	public void setM_weight(int m_weight) {
		this.m_weight = m_weight;
	}
	@Override
	public String toString() {
		return "team_member [t_no=" + t_no + ", m_no=" + m_no + ", m_grade=" + m_grade + ", m_back=" + m_back
				+ ", m_pos=" + m_pos + ", m_height=" + m_height + ", m_weight=" + m_weight + "]";
	}
	
	
}
