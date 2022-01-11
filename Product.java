package inheritance;

public class Product {

	int id = 78;
	String name= "Amul";
	
	
}
	class classA extends Product {
		int count = 50;
		String category = "Butter";
		
		
	}
	
	class classB extends Product {
		int count = 90;
		String category = "Milk";
		
		
	}
	
	class classC extends Product {
		int count = 56;
		String category = "choco";
		
		void display(){
			System.out.println("Id = " +id +" "+ "Name = " + name + " count = "+ count + " category = " + category);
		}
	}

	class subA extends classA {
		int price = 30;
		int total = count * price;
		void display(){
			System.out.println("Id = " +id +" "+ "Name = " + name + " count = "+ count + " category = " + category +" "+ "total = "+total);
		}
	}

	class subB extends classB {
		int price = 10;
		int total = count * price;
		void display(){
			System.out.println("Id = " +id +" "+ "Name = " + name + " count = "+ count + " category = " + category +" " + "total = "+total);
		}

	public static void main(String[] args) {
		subA a = new subA();
		a.display();
		subB b = new subB();
		b.display();
		classC c = new classC();
		c.display();
	}

}


