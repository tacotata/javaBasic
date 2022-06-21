package javaThread;

public class MyThread1 extends Thread {
	
	String str;
	public MyThread1(String str) {
		this.str = str; 
		
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0; i <10; i++) {
			System.err.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
