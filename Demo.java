package datastructures;
import java.io.*; 
import java.util.*; 

public class Demo {
 
	 public static void main(String[] args) 
	 { 
	     // Default initialization of Stack 
	     Stack stack1 = new Stack(); 

	     // Initialization of Stack using Generics 
	     Stack<String> stack2 = new Stack<String>(); 

	     // pushing the elements 
	     stack1.push(5); 
	     stack1.push("mango"); 
	     stack1.push("banana"); 
	     stack1.push("Apple");
	     stack1.push("cherry");
	     stack1.push("guvva");
	     
	     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("All"));
	     
	     // Fetching the element at the head of the Stack 1
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 

	     stack2.push("kadapa"); 
	     stack2.push("tirupati"); 
	     stack2.push("bangalore"); 
	     stack2.push("hyderbad");
	     
	     
	     // Fetching the element at the head of the Stack 2
	     System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 
	     
	     stack2.push("34"); 
	     stack2.push("32"); 
	     stack2.push("23"); 
	     stack2.push("74");
	     
	     
	     // Fetching the element at the head of the Stack 2
	     System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 
	     
	     stack2.push("A"); 
	     stack2.push("B"); 
	  
	     // Fetching the element at the head of the Stack 2
	     System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 




	     // Priniting the Stack Elements 
	     System.out.println(stack1); 
	     System.out.println(stack2); 
	     
	     // Removing elements using pop() method 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 2: " + stack2.pop());      
	 } 
	}



