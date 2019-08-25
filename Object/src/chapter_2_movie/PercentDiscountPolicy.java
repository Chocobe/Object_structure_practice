package chapter_2_movie;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
	private double percent;
	
	
// 생성자
	public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
		super(conditions);
		this.percent = percent;
	}
	
	
	@Override
	public Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
