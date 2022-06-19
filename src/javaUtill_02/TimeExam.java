package javaUtill_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);//2022-06-19T19:54:52.586613500
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1);//2012-12-12
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);//17:18
		LocalTime lt2 =LocalTime.parse("10:15:30");
		System.out.println(lt2);//10:15:30

		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);//2022-06-19
		System.out.println(timePoint.getMonthValue());//6
		System.out.println(timePoint.getMonth());//JUNE
		
		Month month = timePoint.getMonth();
		System.out.println(month.getValue());//6
		System.out.println(timePoint.getHour());//19
		
	}

}
