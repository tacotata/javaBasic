package javaBasic_01;

public class InnerExam {
	//내부 클래스 : 클래스 안에 선언된 클래스 
	//어느 위치에 선언하느냐에 따라 4가지 형태 
	//1. 클래스 안에 인스턴스 변수 , 즉 필드에 선언하는 위체에 선언 == 중첩클래스 , 인스턴스 클래스 
	class Cal {
		int value = 0;
		public void pluse() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerExam c = new InnerExam();
		InnerExam.Cal  cal = c.new Cal(); 
		cal.pluse();
		System.out.println(cal.value);//1

	}

}
