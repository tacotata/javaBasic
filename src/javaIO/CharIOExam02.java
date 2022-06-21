package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam02 {

	public static void main(String[] args) {
		BufferedReader br = null; 
		PrintWriter pw = null; 
		try {
			br = new BufferedReader(new FileReader("src/javaIO/charIOExam02.java"));
			//데코레이터 설명 위해서 아래처럼 사용함 PrintWriter만 사용할 수 있음 
			pw = new PrintWriter(new FileWriter("test.txt"));
			String line = null;
			//파일 끝이면 null 값 리턴함 
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
