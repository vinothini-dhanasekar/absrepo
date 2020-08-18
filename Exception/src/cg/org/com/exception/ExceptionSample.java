package cg.org.com.exception;


	import java.util.Scanner;
	import java.util.InputMismatchException;
	public class ExceptionSample {
	    public static void main(String [] args)
	    {
	         try{
	            Scanner scan = new Scanner(System.in);
	             System.out.println("Enter num");
	             int num1=scan.nextInt();
	             
	             System.out.println("Enter num");
	             int num2=scan.nextInt();
	             
	             System.out.println(num1/num2);
	    
	    }
	    catch (InputMismatchException e) {
	            System.out.println("Enter Numbers only");
	        }
	            // TODO Auto-generated catch block
	            
	        
	         catch (Exception e){
	             e.printStackTrace();
	             
	         }
	         
	         System.out.println("Main method ends here ");
	         
	    }
	
}
