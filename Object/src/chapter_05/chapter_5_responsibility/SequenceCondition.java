package chapter_05.chapter_5_responsibility;

//DiscountCondition 역할을 할당 -> implements DiscountCondition
public class SequenceCondition implements DiscountCondition {
	private int sequence;
	
	
	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}
	
	
	public boolean isSatisfiedBy(Screening screening) {
		return sequence == screening.getSequence();
	}
}
