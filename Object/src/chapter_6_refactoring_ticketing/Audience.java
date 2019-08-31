package chapter_6_refactoring_ticketing;

public class Audience {
	private Bag bag;
	
	
	public Audience(Bag bag) {
		this.bag = bag;
	}
	
	
	public Bag getBag() {
		return bag;
	}
}
