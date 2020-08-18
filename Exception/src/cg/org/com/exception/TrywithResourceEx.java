package cg.org.com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResourceEx {
	
	    public static void main(String [] args)
	    {
	    String line;
	           
	    try(BufferedReader br =  new BufferedReader(new FileReader("test.txt"))){
	 
	        while((line=br.readLine())!=null){
	            System.out.println(line);
	        }
	    }catch (IOException e)
	    {
	        System.out.println(e.getMessage());
	    }
	   
	}
	}

