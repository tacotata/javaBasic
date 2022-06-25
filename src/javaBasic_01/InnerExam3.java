package javaBasic_01;

public class InnerExam3 {
	//내부클래스3 
	//지역 중첩 클래스 또는 지역 클래스(local class)
	//메소드 안에서 선언되는 경우
	public void exec() {
		 class Cal {
			int value = 0;
			public void pluse() {
				value++;
			}
		}
		 //메소드 안에서만 사용 
		 Cal cal  = new Cal();
		 cal.pluse();
		 System.out.println(cal.value);
		
	}

	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();

	}

}
