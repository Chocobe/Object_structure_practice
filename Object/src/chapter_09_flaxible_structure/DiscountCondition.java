package chapter_09_flaxible_structure;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
