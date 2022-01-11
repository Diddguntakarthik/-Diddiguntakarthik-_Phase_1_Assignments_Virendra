package pro.exception;

public class FinallyExample {

	public static void main(String args[]){  
		int a[]=new int[5];
		try{  
			int data=25/0;  
			System.out.println(data); 
			
		}  

		catch(NullPointerException e){
			System.out.println(e);
		} 
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		try {
			 a[5]=90;
			 System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
			
		}
	  finally
	  {
		  System.out.println("finally block is always executed");
	  }  

	  System.out.println("rest of the code...");  
	  }

}
