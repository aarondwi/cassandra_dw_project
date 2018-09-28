package routines;
//for scd type 3
public class rollno_name {
	private int rollno;
	private String previous_name,name;
	public rollno_name(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		this.previous_name=null;
	}
	public void setPreviousNames(String name){
		this.previous_name=name;
	}
	public int getRollNo(){
		return this.rollno;
	}
	public String getName(){
		return this.name;
	}
	public String getPreviousName(){
		return this.previous_name;
	}
}

