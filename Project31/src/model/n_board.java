package model;

public class n_board {
	private int b_no;
	private String title;
	private String content;
	private String date;
	private int count;
	private int file_no;
	private int m_no;
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFile_no() {
		return file_no;
	}
	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	@Override
	public String toString() {
		return "n_board [b_no=" + b_no + ", title=" + title + ", content=" + content + ", date=" + date + ", count="
				+ count + ", file_no=" + file_no + ", m_no=" + m_no + "]";
	}
	
	
}
