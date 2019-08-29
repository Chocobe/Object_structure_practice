package chapter_5_responsibility;

public class AmountDiscountPolicy extends DiscountPolicy {
	private Money discountAmount;
	
// 생성자
	public AmountDiscountPolicy(DiscountCondition ...conditions) {
		super(conditions);
	}
	
	
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
	
	
//	@Override
//	protected Money calculateDiscountAmount() {
//		return discountAmount;
//	}
}
