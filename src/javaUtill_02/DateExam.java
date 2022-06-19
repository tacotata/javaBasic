package javaUtill_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString()); //Sun Jun 19 18:41:52 KST 2022
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(ft.format(date));//2022.06.19 at 06:41:52 오후 KST
		
		System.out.println(date.getTime());//1655631813960
		
		long today = System.currentTimeMillis();// 시스템 현재 시간을 long 값으로 주세요 
		System.out.println(today); //1655631814051
		
		System.out.println(today - date.getTime());//91
	}

}
