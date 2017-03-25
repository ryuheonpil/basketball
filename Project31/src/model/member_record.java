package model;

public class member_record {
	private int m_no;
	private int t_no;
	private int year;
	private double total;
	private int point;
	private int assist;
	private int rebound;
	private double steal;
	private double block;
	private double th_point;
	private double free_throw;
	private double free_rate;
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public int getT_no() {
		return t_no;
	}
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	public int getRebound() {
		return rebound;
	}
	public void setRebound(int rebound) {
		this.rebound = rebound;
	}
	public double getSteal() {
		return steal;
	}
	public void setSteal(double steal) {
		this.steal = steal;
	}
	public double getBlock() {
		return block;
	}
	public void setBlock(double block) {
		this.block = block;
	}
	public double getTh_point() {
		return th_point;
	}
	public void setTh_point(double th_point) {
		this.th_point = th_point;
	}
	public double getFree_throw() {
		return free_throw;
	}
	public void setFree_throw(double free_throw) {
		this.free_throw = free_throw;
	}
	public double getFree_rate() {
		return free_rate;
	}
	public void setFree_rate(double free_rate) {
		this.free_rate = free_rate;
	}
	@Override
	public String toString() {
		return "member_record [m_no=" + m_no + ", t_no=" + t_no + ", year=" + year + ", total=" + total + ", point="
				+ point + ", assist=" + assist + ", rebound=" + rebound + ", steal=" + steal + ", block=" + block
				+ ", th_point=" + th_point + ", free_throw=" + free_throw + ", free_rate=" + free_rate + "]";
	}
	
	
}
