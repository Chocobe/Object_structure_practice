package chapter_2_oop_structure;

public class SequenceCondition implements DiscountCondition {
	private int sequence;
	
	
// 생성자
	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}
	
	
// 순서 할인 조건검사
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(this.sequence);
	}
}
