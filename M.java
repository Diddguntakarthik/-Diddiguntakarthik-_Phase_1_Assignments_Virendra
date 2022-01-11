package accessmodifier;

public class M {
	private int inrvar = 57;
	long longvar = 98765;
	protected float floatvar = 876.9876f;
	
	private void privateMethod() {
		System.out.println("In a privare method of class M");
	}
	void defaultMethod() {
		System.out.println("In a defualt method of class M");
	}
	protected void protectedMethod() {
		System.out.println("In a protected method of class M");
	}
	public void publicMethod() {
		System.out.println("In a public method of class M");
	}
}


