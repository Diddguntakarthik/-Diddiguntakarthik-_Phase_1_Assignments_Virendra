 package java.inheritence;

interface c{
	void a();
	void b();
	void c();
	 void d1();
}
abstract class B implements c {
	public void c()
	{
		System.out.println("I am c");
	}
}
class M extends B {
	public void a() {
		System.out.println("I am a");
		
	}

	@Override
	public void b() {
		System.out.println("I am b");
	}
	public void d1() {
		System.out.println("I am d");
		
	}

}
public class Abstractinterfaceboth {
	public static <C> void main(string args[]) {
		
		M obj = new M();
		
		obj.a();
		obj.b();
		obj.c();
		obj.d1();
		
	}
	
	

}
