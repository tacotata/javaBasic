package javaUtill_02;

public class LambdaExam {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0; i <10; i++) {
					System.out.println("hello");
				}
			}
		}).start();

	}

}
