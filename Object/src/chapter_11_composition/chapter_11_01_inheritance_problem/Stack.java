package chapter_11_composition.chapter_11_01_inheritance_problem;

import java.util.EmptyStackException;
import java.util.Vector;

public class Stack<E> {
	private Vector<E> elements = new Vector<E>();
	
	
	public E push(E item) {
		elements.add(item);
		
		return item;
	}
	
	
	public E pop() {
		if(elements.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return elements.remove(elements.size() - 1);
	}
}
