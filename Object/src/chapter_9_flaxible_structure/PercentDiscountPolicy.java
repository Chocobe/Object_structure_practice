package chapter_9_flaxible_structure;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
	private double percent;
	
	
// 생성자
	public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
		super(conditions);
		this.percent = percent;
	}
	
	
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
