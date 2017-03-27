package model;

public class Team_record {
	private int t_no;
	private int year;
	private int total;
	private double avg;
	private int win;
	private int draw;
	private int lose;
	private double point;
	private double assist;
	private double rebound;
	private double steal;
	private double block;
	private double th_point;
	private double free_throw;
	private double free_rate;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public double getAssist() {
		return assist;
	}
	public void setAssist(double assist) {
		this.assist = assist;
	}
	public double getRebound() {
		return rebound;
	}
	public void setRebound(double rebound) {
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
		return "team_record [t_no=" + t_no + ", year=" + year + ", total=" + total + ", avg=" + avg + ", win=" + win
				+ ", draw=" + draw + ", lose=" + lose + ", point=" + point + ", assist=" + assist + ", rebound="
				+ rebound + ", steal=" + steal + ", block=" + block + ", th_point=" + th_point + ", free_throw="
				+ free_throw + ", free_rate=" + free_rate + "]";
	}
	
	
}
