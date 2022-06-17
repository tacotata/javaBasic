package javaBasic_01;

public class WrapperExam {
	
	public static void main(String[] args) {
		
		int i =5; 
		Integer i2 = new Integer(5);
		
		//오토박싱 : 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
		Integer i3 = 5;
		
		int i4 = i3.intValue();
		
		//오토언박싱 : 오토박싱과 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
		int i5 = i3;		
	}

}
