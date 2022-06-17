package javaBasic_01;

public class MathExam {

	public static void main(String[] args) {
	//Math클래스는 생성자가 private으로 되어 있기 때문에 new 연산자를 이용하여 객체를 생성할 수 없다.
	//객체를 생성할 수는 없지만 모든 메소드와 속성이 static으로 정의되어 있기 때문에 객체를 생성하지 않고도 사용할 수 있다.
		
		int value1 = Math.max(5, 30);
		System.out.println(value1);//30
		
		int value2 =Math.min(5, 30);
		System.out.println(value2);//5
		System.out.println(Math.abs(-10));//10절대값
		System.out.println(Math.random()); //double
		System.out.println(Math.sqrt(25)); //제곱근
		
		
		
	}

}
