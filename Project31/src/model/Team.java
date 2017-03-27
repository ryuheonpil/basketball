package model;

public class Team {
	private int t_no;
	private String t_name;
	private String t_local;
	public int getT_no() {
		return t_no;
	}
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_local() {
		return t_local;
	}
	public void setT_local(String t_local) {
		this.t_local = t_local;
	}
	@Override
	public String toString() {
		return "team [t_no=" + t_no + ", t_name=" + t_name + ", t_local=" + t_local + "]";
	}
	
	
}
