package javaThread;

public class TheardA {
	public static void main(String[] args) {
		ThreadB b  = new ThreadB();
		b.start();
		
		synchronized (b) {
			try{
				  // b.wait()메소드를 호출.
                // 메인쓰레드는 정지
                // ThreadB가 5번 값을 더한 후 notify를 호출하게 되면 wait에서 깨어남
				System.out.println("b가완료될때까지 기다립니다.");
				b.wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
			//깨어난 후 결과를 출력
			System.out.println("Total is :" +b.total);
		}
	}
}

//b가완료될때까지 기다립니다.
//0를 더합니다.
//1를 더합니다.
//2를 더합니다.
//3를 더합니다.
//4를 더합니다.
//Total is :10