package PO;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public class stackAndList{ 
	
	static class Stack{
	//Stacks are a type of vector
	private Vector<Integer> stack = new Vector();
	
	//Uses the collections max function to find the highest vale of the vector
	public int max() {
		if (stack.size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		
		return Collections.max(stack);
	}
	
	//Adds a final element  to the vector (ie a plate to the top of the stack)
	public void push(int plate) {
		stack.add(plate);
	}
	
	//Remove the final element of the vector (ie the top plate)
	public int pop() {
		if (stack.size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		return stack.remove(stack.size()-1);
	}
	}
	
	public static void findIntersection(LinkedList<Integer> x, LinkedList<Integer> y) {
		Set <Integer> hs = new HashSet<>();
		hs.addAll(y);
		for (Integer x: y) {
			if(!hs.add(x)) {
				System.out.println(x);
			}
		}
		System.out.println("Does not intersect");
	}

}