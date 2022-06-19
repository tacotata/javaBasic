package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		//inputStream 읽기, outputStream 쓰기
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaIO/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1; 
			//512바이트만틈 읽어
			byte[] buffer = new byte[512];
			
			while((readCount = fis.read(buffer))!= -1 ) {
				fos.write(buffer, 0, readCount);
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
		System.out.println(endTime - startTime);//1
		
		/*
		 * os에서 파일 읽어올 떄 기본으로 511byte씩 읽어옴 
		 * */

	}

}
