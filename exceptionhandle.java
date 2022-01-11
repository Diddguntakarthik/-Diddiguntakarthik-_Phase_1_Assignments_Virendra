package pro.exception;

public class exceptionhandle {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
		a[3]=30/0;
		a[5]=9;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ARRAYIndeoutofbounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}
		
		}

	}


