package javaIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class CharIOExam {

	 public static void main(String[]args){
         BufferedReader br = null;
         PrintWriter pw = null; 
        String str = "안녕하세요. PrintWriter입니다.";
        try{
             //System.out.println("안녕하세요. PrintWriter입니다.");
           // br = new BufferedReader(new InputStreamReader(System.));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
			//파일 끝이면 null 값 리턴함 
			
				pw.println(str);
		
             
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            pw.close();
           
        }
      
        
    }

}
