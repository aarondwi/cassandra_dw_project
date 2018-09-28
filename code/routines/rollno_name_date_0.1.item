package routines;

import java.util.Date;
import java.util.UUID;

public class rollno_name_date {
	private UUID surrkey;
	public int rollno;
	public Integer course_id,semester;
	public String name,dept,previous_name;
	public Date start_date,end_date;
	
	public rollno_name_date(UUID uuid,int rollno,String name,Date start_date){
		this.surrkey=uuid;
		this.rollno=rollno;
		this.name=name;
		this.start_date=start_date;
		this.end_date=null;
		this.course_id=null;
		this.semester=null;
		this.previous_name=null;
		this.dept=null;
	}
	public void setTheRest(Integer course_id,Integer semester,String dept,String previous_name){
		this.course_id=course_id;
		this.semester=semester;
		this.dept=dept;
		this.previous_name=previous_name;
	}
	
	public void setUUID(String uuid){
		this.surrkey=java.util.UUID.fromString(uuid);
	}
	public void setEndDate(Date end_date){
		this.start_date=null;
		this.end_date=end_date;
	}
	
	public String getUUID(){
		return this.surrkey.toString();
	}
}
