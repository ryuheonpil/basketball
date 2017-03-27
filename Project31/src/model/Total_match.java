package model;

public class Total_match {
	private int no;
	private String d_day;
	private String location;
	private int t_no_home;
	private int t_no_away;
	private int result;
	private int home_score;
	private int away_score;
	private String date;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getD_day() {
		return d_day;
	}
	public void setD_day(String d_day) {
		this.d_day = d_day;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getT_no_home() {
		return t_no_home;
	}
	public void setT_no_home(int t_no_home) {
		this.t_no_home = t_no_home;
	}
	public int getT_no_away() {
		return t_no_away;
	}
	public void setT_no_away(int t_no_away) {
		this.t_no_away = t_no_away;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getHome_score() {
		return home_score;
	}
	public void setHome_score(int home_score) {
		this.home_score = home_score;
	}
	public int getAway_score() {
		return away_score;
	}
	public void setAway_score(int away_score) {
		this.away_score = away_score;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "total_match [no=" + no + ", d_day=" + d_day + ", location=" + location + ", t_no_home=" + t_no_home
				+ ", t_no_away=" + t_no_away + ", result=" + result + ", home_score=" + home_score + ", away_score="
				+ away_score + ", date=" + date + "]";
	}
	
	
}
