package accessmodifier;

public class P {
	
	private void privateMethod() {
		System.out.println("In a privare method of class P");
	}
	void defaultMethod() {
		System.out.println("In a defualt method of class P");
	}
	protected void protectedMethod() {
		System.out.println("In a protected method of class P");
	}
	public void publicMethod() {
		System.out.println("In a public method of class P");
	}
	public static void main(String[]args) {
		M objM = new M();
		N objN = new N();
		System.out.println("long variable of class M: "+ objM.longvar);
		System.out.println("float variable of class M: "+ objM.floatvar);
	}


}
