package collections;
import java.util.*;

public class HashsetExample {


		public static void main(String[] args){
			
			//LinkedHashSet<String> hs=new LinkedHashSet<String>();
			HashSet<String> hs=new HashSet<String>();
			
			hs.add("bananna");
			hs.add("watermelon");
			hs.add("guava");
			hs.add("mango");
			hs.add("apple");
			hs.add("berry");
			hs.add("kiwi");
			hs.add("pineapple");
			hs.add("plum");
			hs.add("grapes");
			
					
			System.out.println("Hashset is "+hs);
			System.out.println("Size of Hashset is "+ hs.size());
			
			System.out.println("Does hashset contains this 'apple' element  " + hs.contains("u"));		
			System.out.println("is hashset empty  " + hs.isEmpty());
			System.out.println("remove the element "+hs.remove("i"));
			
			
		    hs.clear();
		    System.out.println("get class  " +hs.getClass());
			
		    System.out.println("is hashset empty  " +hs.isEmpty());
		    
		    
			
		}
	}

