package javaBasic_01;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str); //hello world
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3) {
			//자기자신을 리턴했어 StringBuffer가 가지고 있는 메소드들은 대부분 자기 자신, this를 반환
			System.out.println("sb2 == sb3"); //sb2 == sb3
			
			//메소드 체이닝: 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
			
			String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
			System.out.println(str2); //hello world
		}
		
		/* 
		 * StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
		 * 
		 * String 자료형은 한번 값이 생성되면 그 값을 변경할 수가 없다. 
		 * 이렇게 값을 변경할 수 없는 것을 immutable 하다고 한다
		 * 
		 * 하지만 StringBuffer는 이와 반대로 값을 변경할 수 있다(mutable 하다). 
		 * 즉 한번 생성된 값을 언제든지 수정할 수 있다.
		 * 
		 * StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다. 
		 * new StringBuffer() 로 객체를 생성하는 것은 일반 String을 사용하는 것보다 메모리 사용량도 많고 속도도 느리다.
		 * 따라서 문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를, 
		 * 문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
		 * 
		 * */
		
	}

}
