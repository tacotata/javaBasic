package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

	public static void main(String[] args) {
		//inputStream 읽기, outputStream 쓰기
		long startTime = System.currentTimeMillis();	
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaIO/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");//아무경로를 주지않으면 프로젝트 밑에 생성
			
			
			int readData = -1; 
			//한바이트씩 읽을 수 있음 마지막 한바이트를 저장함 
			//읽어들인 데이터가 있으면 항상 양수 return함 
			while((readData = fis.read())!= -1 ) {
				fos.write(readData);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);//18
	}

}
