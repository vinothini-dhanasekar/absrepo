package cg.org.com.exception;
import java.io.FileInputStream;


	public class ExceptionEx {


	    public static void main(String[] args) {
	        try
	        {
	            FileInputStream f = new FileInputStream("abc.txt");
	            System.out.println("abc file is available");
	            
	        }
	        catch(Exception IOException)
	        {
	            System.out.println("abc file is not found");
	        }
	        
	        try
	        {
	            FileInputStream f = new FileInputStream("def.txt");
	            System.out.println("def file is available");
	            
	        }
	        catch(Exception e)
	        {
	            System.out.println("def file is not found");
	        }
	        
	        finally
	        {
	            System.out.println("finally block");
	        }



	    }


	}
	 







	