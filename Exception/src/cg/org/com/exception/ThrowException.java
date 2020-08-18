package cg.org.com.exception;

	import java.io.FileNotFoundException;

	 

	public class ThrowException {
	        
	        void proc() throws FileNotFoundException 
	        {

	 

	            try {

	 

	               throw new FileNotFoundException ("caught exception");

	 

	             } 
	            catch(FileNotFoundException e) 
	            {

	 

	                  System.out.println("Caught inside demoproc.");

	 

	                  throw e; // rethrow the exception

	 

	       }
	            }

	 

	    public static void main(String args[]) {

	 

	        ThrowException t=new ThrowException();

	 

	         try {

	 

	              t.proc();

	 

	             } 
	         catch(FileNotFoundException  e) 
	         {

	 

	                     System.out.println("Recaught: " + e); 

	 

	              } 
	    } 
	    }

	 


	 

