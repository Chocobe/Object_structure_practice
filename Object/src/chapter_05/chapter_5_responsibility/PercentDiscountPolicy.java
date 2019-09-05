package chapter_05.chapter_5_responsibility;

public class PercentDiscountPolicy extends DiscountPolicy {	
	private double percent;
	
	
// 생성자
	public PercentDiscountPolicy(DiscountCondition ...conditions) {
		super(conditions);		
	}
	
	
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getFee().times(percent);
	}
	
	
//	@Override
//	protected Money calculateDiscountAmount() {
//		return getFee().times(percent);
//	}
}
