package javaBasic_01;

public class InnerExam2 {
	//내부클래스 2 
	//정적 중첩 클래스 또는 스테틱 클래스 (static class)
	
	static class Cal {
		int value = 0;
		public void pluse() {
			value++;
		}
	}
	

	public static void main(String[] args) {
		//static이니까 InnerExam2  생성할 필요가 없다.
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.pluse();
		System.out.println(cal.value);
	}

}
