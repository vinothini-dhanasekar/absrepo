package cg.org.com.exception;


	


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;


	public class ExceptionEx2 {
	    
	    public static void main(String [] args) throws FileNotFoundException
	    {
	          
	           System.out.println("this is the main method");
	           
	            
	                m1();
	            
	     }
	    
	   public static void  m1() throws FileNotFoundException 
	  {
	       
	         System.out.println("this is the m1 method ");
	         
	        m2();
	     
	  }
	   
	   public static void m2() throws FileNotFoundException 
	   {      
	      
	              
	          System.out.println("This is the method 2");
	          FileInputStream obj = new FileInputStream("def.txt");
	      
	      
	     
	       
	       
	       
	   }
	  



	
	 






}