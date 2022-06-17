package javaUtill_01;

public class BoxExam {

	public static void main(String[] args) {
		
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		//Java5에는 Generic이라는 문법이 사용됨으로써 인스턴스를 만들때 사용하는 타입을 지정하는 문법이 추가
		//Generic을 사용함으로써 선언할때는 가상의 타입으로 선언하고, 사용시에는 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있습니다. 
		// 장점 -> 1.클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있습니다.
		//		  2.반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.
		
		//Generic을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스입니다.
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		
		
	}

}
