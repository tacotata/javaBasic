package javaThread;

public class JoinExam {

	public static void main(String[] args) {

		MyThread5  thread = new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
//		시작
//		MyThread5 :0
//		MyThread5 :1
//		MyThread5 :2
//		MyThread5 :3
//		MyThread5 :4
//		종료		
	}

}
