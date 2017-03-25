package model;

public class file {
	private int no;
	private String b_category;
	private int b_no;
	private String original_file;
	private String original_directory;
	private double size;
	private String date;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getB_category() {
		return b_category;
	}
	public void setB_category(String b_category) {
		this.b_category = b_category;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getOriginal_file() {
		return original_file;
	}
	public void setOriginal_file(String original_file) {
		this.original_file = original_file;
	}
	public String getOriginal_directory() {
		return original_directory;
	}
	public void setOriginal_directory(String original_directory) {
		this.original_directory = original_directory;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "file [no=" + no + ", b_category=" + b_category + ", b_no=" + b_no + ", original_file=" + original_file
				+ ", original_directory=" + original_directory + ", size=" + size + ", date=" + date + "]";
	}
	
	
}
