package cg.org.com.exception;

public class TestEx {
	
	    
	      public static void test1() throws Exception
	      {
	            System.out.println("this is the test1 method");
	            throw new Exception ("thrown from test1 method");
	      }
	      
	      public static void test2() throws Exception
	      {
	          try{
	          test1();
	          }
	          catch(Exception e)
	          {
	               System.out.println("test2 method");
	               throw e;
	          }
	      }

	 

	    public static void main(String[] args) throws Exception {
	        
	            test2();
	        
	        
	           

	 

	    }

	 

	}



//
public static void main(String[] args) throws Exception {
    
    test2();


   



}



}
//
going to make some conflicts

