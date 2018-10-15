package routines;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		SimpleDateFormat dt=new SimpleDateFormat("MM/dd/yyyy");
		Date hasil=dt.parse("01/01/0001");
		try{
			hasil=dt.parse(initial.split(" ")[0]);
		}
		catch(Exception e){
			hasil=dt.parse("01/01/0001");
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
		Integer hasil=1;
		try{
			hasil=Integer.valueOf(
				(initial.split(" ")[0]).split("/")[2]
			);
		}
		catch(Exception e){
			hasil=1;
		}
		return hasil;
	}
}