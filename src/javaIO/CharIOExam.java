package javaIO;


import java.io.FileWriter;
import java.io.PrintWriter;



public class CharIOExam {

	 public static void main(String[]args){
         
         PrintWriter pw = null; 
         String str = "안녕하세요. PrintWriter입니다.";
        try{
            pw = new PrintWriter(new FileWriter("test.txt"));
            
            String line = null;		
			pw.println(str);
             
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            pw.close();
           
        }
        
    }

}
