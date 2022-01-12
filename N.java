package accessmodifier;

public class N {
	private int inrvar = 8987;
	long longvar = 986544l;
	protected float floatvar = 876.9876f;
	
	private void privateMethod() {
		System.out.println("In a privare method of class N");
	}
	void defaultMethod() {
		System.out.println("In a defualt method of class N");
	}
	protected void protectedMethod() {
		System.out.println("In a protected method of class N");
	}
	public void publicMethod() {
		System.out.println("In a public method of class N");
	}


}
