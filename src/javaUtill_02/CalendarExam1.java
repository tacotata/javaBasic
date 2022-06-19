package javaUtill_02;

import java.util.Calendar;

public class CalendarExam1 {
	
	    public String hundredDaysAfter(){
	        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
	        Calendar cal = Calendar.getInstance();
	        
	        // 여기 있어야 월도 적용되징!!! 
	        cal.add(Calendar.DATE, 100);
	        
	        int year = cal.get(Calendar.YEAR);
	        int month = cal.get(Calendar.MONTH)+1; 	      
	        int date = cal.get(Calendar.DATE);
	        
	        StringBuffer sb = new StringBuffer();
	        String cals = sb.append(year).append("년").append(month).append("월").append(date).append("일").toString();
	       
	        return cals;
	        
	    }
	    
	    public static void main(String[] args){
	    	CalendarExam1 ce = new CalendarExam1();
	        System.out.println(ce.hundredDaysAfter());//2022년9월27일
	}

}
