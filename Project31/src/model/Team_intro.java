package model;

public class Team_intro {
	private int t_no;
	private String content;
	private int file_no;
	private String date;
	public int getT_no() {
		return t_no;
	}
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getFile_no() {
		return file_no;
	}
	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "team_intro [t_no=" + t_no + ", content=" + content + ", file_no=" + file_no + ", date=" + date + "]";
	}
	
	
}
