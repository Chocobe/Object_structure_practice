package chapter_09_flaxible_structure;

public class Client {
	private Factory factory;
	
	
	public Client(Factory factory) {
		this.factory = factory;
	}
	
	
	public Money getAvatarFee() {
		Movie avatar = factory.createAvatarMovie();
		
		return avatar.getFee();
		
		// Factory 클래스로 책임 이동
//		Movie avatar = new Movie("아바타",
//								 Duration.ofMinutes(120),
//								 Money.wons(10000),
//								 new AmountDiscountPolicy(Money.wons(800),
//										 new SequenceCondition(10)));
//		
//		return avatar.getFee();
	}
}
