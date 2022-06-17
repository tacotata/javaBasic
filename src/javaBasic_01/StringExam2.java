package javaBasic_01;

public class StringExam2 {

	public static void main(String[] args) {
		
		//String클래스는 불변클래스 이다.
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);//hello world
		System.out.println(str2);// world
		
		//자료형에 + 연산이 있을 때마다 새로운 String 객체가 생성된다
		String str3 = str1 + str2;
		System.out.println(str3);//hello world world
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);//hello world world
		
		long startTime1 = System.currentTimeMillis();
		
		String str5 =""; 
		//1번 돌때마다 StringBuffer 객체를 만들어냄 new 연산자 많이 사용할 수록 프로그램 느려짐
		for(int i = 0; i <10000; i++) {
			str5 = str5 + "*";
		}
		
		long endTime1 = System.currentTimeMillis();
		System.out.println(str5);
		
		
		//문자열을 반복문 안에서 더하는것은 성능상 문제가 생길 수 있으니 반드시 피하도록 합시다.
		//위에 코드 개선 
		 long startTime2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i <10000; i++) {
			sb.append("*");
		}
		
		long endTime2 = System.currentTimeMillis();
		
		String str6 = sb.toString();
		System.out.println(str6);
		
		
		long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);
	}
	

}
