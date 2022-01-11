package abstractmethods;

public abstract class vechile {
	abstract void run();
	abstract void stop();
	public void fuel(int k) {
		System.out.println("feaul is"  +k);
	}
	public void fuel(float d,String l) {
		System.out.println("feaul is" +d+"compeny"+1);
	}
	public void fuel(char k,int l) {
		System.out.println("feaul"+l+"car logo"+k);
	}
	int speed=10;
	long distance=1000L;
	
	vechile(int k){
		System.out.println("distance"+k);
	}
		
		

	}

