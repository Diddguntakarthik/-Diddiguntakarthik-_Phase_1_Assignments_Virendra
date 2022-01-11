package collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Treemap {

	    public static void main(String[] args) {
	    	
	        TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
	        marks.put("mango", 120);
	        marks.put("cherry", 99);
	        marks.put("kiwi", 130);
	        marks.put("banana", 190);
	        marks.put("lichi", 89);
	        marks.put("muskmelon", 142);
	        marks.put("watermelon",87 );
	        marks.put("apple", 45);
	        marks.put("guvva", 934);
	        marks.put("dragon fruit", 345);
	    
	        
	        
	    
	        
	       
	        
	        for(String key: marks.keySet()){
				System.out.println(key  +" : "+ marks.get(key));
	        }
	    }
	}

	

