package chapter_5.chapter_5_responsibility;

public class NoneDiscountMovie extends DiscountPolicy {
// 생성자
	public NoneDiscountMovie(DiscountCondition ...conditions) {
		super(conditions);
	}
	
	
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
