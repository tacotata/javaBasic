package javaUtill_02;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));//2022
		System.out.println(cal.get(Calendar.MONTH)+1);//6 월은 0부터 출력함
		System.out.println(cal.get(Calendar.DATE));//19
		System.out.println(cal.get(Calendar.HOUR));//6
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//18
		System.out.println(cal.get(Calendar.MINUTE));//54
		
		
		System.out.println("===================================");
		cal.add(Calendar.HOUR, 5);
		
		System.out.println(cal.get(Calendar.YEAR));//2022
		System.out.println(cal.get(Calendar.MONTH)+1);//6 월은 0부터 출력함
		System.out.println(cal.get(Calendar.DATE));//19
		System.out.println(cal.get(Calendar.HOUR));//11
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//23
		System.out.println(cal.get(Calendar.MINUTE));//55
		
		

	}

}
