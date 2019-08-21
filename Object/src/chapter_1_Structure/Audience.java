package chapter_1_Structure;

public class Audience {
	private Bag bag;
	
	
// 생성자
	public Audience(Bag bag) {
		this.bag = bag;
	}
	
	
// bag getter
	public Bag getBag() {
		System.out.println("가방을 엽니다");
		return this.bag;
	}
}
