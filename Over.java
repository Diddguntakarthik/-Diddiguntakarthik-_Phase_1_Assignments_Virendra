package abstractmethods;

public class Over {
	int side;
	float radius;
	int length;
	int breadth;
	Over() {
	}
	Over(int s) {
		side = s;
	}
	Over(float r){
		radius = r;
	}
	
	Over(int l , int b){
		length = l;
		breadth = b;
	}
	public float areaOfCircle() {
		return  3.14f*radius*radius;
	}
	public int areaOfSquare() {
		return side*side;
	}
	public int areaOfRectangle() {
		return length*breadth;
	}
	public int area(int height , int base) {
		return (height*base)/2;
	}
	public float area(float diagonal1,float diagonal2) {
		return (diagonal1 *diagonal2)/2;
	}
	
	public static void main(String[] args) {
		Over circle = new Over(98.98f);
		Over square = new Over (54);
		Over rectangle = new Over(43,35);
		Over traingle = new Over();
		Over rhombus =new Over();
		System.out.println("Area of circle:"+ circle.areaOfCircle());
		System.out.println("Area of Square:"+ square.areaOfCircle());
		System.out.println("Area of rectangle:"+rectangle.areaOfRectangle());
		System.out.println("Area of traingle:"+traingle.area(43,  9));
		System.out.println("Area of rhombus:"+rhombus.area(44.09f, 77.76f));
		
	}

}


