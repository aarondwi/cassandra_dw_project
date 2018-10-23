package routines;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class data_checker {
	public static String computeKoleksi(String initial){
		return (initial!=null && !initial.equals(""))?initial:"none";
	}
	
	public static String computeStatus(String st){
		String hasil="b";
		try{ hasil=st.toLowerCase(); }
		catch(Exception e){hasil="b";}
		return hasil;
	}

	public static Date computeDate(String initial) throws ParseException{
		//initial expected format => 1/3/2013 12:22 / 7/23/2013 0:00
		SimpleDateFormat dt=new SimpleDateFormat("MM/dd/yyyy");
		Date hasil=dt.parse("01/01/1900");
		try{
			hasil=dt.parse(initial.split(" ")[0]);
		}
		catch(Exception e){
			hasil=dt.parse("01/01/1900");
		}
		return hasil;
	}
	
	public static Date computeDateCassandra(String initial) throws ParseException{
		//initial expected format => 1/3/2013 12:22 / 7/23/2013 0:00
		//in tcassandraoutput component, for some reason it always reduce the day by 1
		//so we need to add 1 day to it
		SimpleDateFormat dt=new SimpleDateFormat("MM/dd/yyyy");
		Date hasil=dt.parse("01/01/1900");
		Calendar c=Calendar.getInstance();
		try{
			//hasil=dt.parse(initial.split(" ")[0]);
			c.setTime(dt.parse(initial.split(" ")[0]));
			c.add(Calendar.DATE,1);
			hasil=c.getTime();
		}
		catch(Exception e){
			hasil=dt.parse("01/01/1900");
			//for some reason, below 1970-01-01 won't get reduce by 1 again
		}
		return hasil;
	}
	
	public static Integer computePenerbitInt(String initial){
		Integer hasil=0;
		try{
			hasil=Integer.valueOf(initial);
		}
		catch(Exception e){
			hasil=0;
		}
		return hasil;
	}
	
	public static String computePenerbitStr(String initial){
		String hasil="unknown";
		//null penerbit is unknown
		if(initial!=null && !initial.equals("")){
			hasil=initial;
		}
		return hasil;
	}
	
	public static Integer computeKategori(String initial){
		Integer hasil=0;
		try{
			Integer calc=(int)Math.floor(Double.valueOf(initial));
			if(calc>=10 && calc<=1000){//no known values for below or above this range
				calc=calc-(calc%10);
			}
			else calc=0;
			
			if(calc%100!=0){
				hasil=calc;
			}
			else hasil=0;//there are no code for 100, 200, etc
		}
		catch(Exception e){
			hasil=0;
		}
		return hasil;
	}
	
	public static String computeJenisUsul(String initial){
		//null value
		//or empty string
		//or space only
		return (initial!=null && 
				!initial.equals("") && 
				!initial.equals(" "))? initial:"u";//umum
	}

	public static Integer computeKodeStatus(Integer initial){
		return initial!=null?initial:1;//belum disetujui
	}
	
	public static Integer computeJurusan(String initial){
		Integer hasil=0;
		//number only and has a length of 8 means a student
		if(initial.matches("[0-9]+") && initial.length()==8){
			hasil=Integer.valueOf(initial.substring(0,3));
		}
		else{//means an employee
			hasil=0;
		}
		return hasil;
	}

	public static Integer computeYear(String initial){
		Integer hasil=1900;
		try{
			hasil=Integer.valueOf(
				(initial.split(" ")[0]).split("/")[2]
			);
		}
		catch(Exception e){
			hasil=1900;
		}
		return hasil;
	}
	
	public static Integer computeMonth(String initial){
		Integer hasil=1;
		try{
			hasil=Integer.valueOf(
				(initial.split(" ")[0]).split("/")[0]
			);
		}
		catch(Exception e){
			hasil=1;
		}
		return hasil;
	}
	
	public static Integer computeSemester(String initial){
		Integer hasil=0;
		try{
			//initial expected format => 1/3/2013 12:22
			hasil=Integer.valueOf((initial.split(" ")[0]).split("/")[0]);
			if(hasil<=6)hasil=2;
			else hasil=1;
		}
		catch(Exception e){
			hasil=0;
		}
		return hasil;
	}
	
	public static String computeTahunAjaran(String initial){
		String hasil="None";
		try{
			//initial expected format => 1/3/2013 12:22 (MM/dd/yyyy)
			Integer bulan=Integer.valueOf((initial.split(" ")[0]).split("/")[0]);
			Integer tahun=Integer.valueOf((initial.split(" ")[0]).split("/")[2]);
			
			if(bulan<=6)hasil=String.valueOf(tahun-1)+"/"+String.valueOf(tahun);
			else hasil=String.valueOf(tahun)+"/"+String.valueOf(tahun+1);
		}
		catch(Exception e){
			hasil="None";
		}
		
		return hasil;
	}
}