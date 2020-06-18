package Encapsulation;

public class Students {
	
	private String Name;
	private String DOB;
	private int stuID;
	
	
	public Students () {}
	public Students(String name, int stuID, String DOB) {
		super();
		this.Name= name;
		this.DOB = DOB;
		this.stuID = stuID;
	}
	public Students(String name, int stuID) {
			this.Name= name;
			this.stuID = stuID;
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
		
	}
	
	
	
	
	


