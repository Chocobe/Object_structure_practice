package chapter_09_flaxible_structure;

import java.time.Duration;

public class Factory {
	public Movie createAvatarMovie() {
		return new Movie("아바타",
						 Duration.ofMinutes(120),
						 Money.wons(10000),
						 new AmountDiscountPolicy(Money.wons(800),
								 		new SequenceCondition(3),
								 		new SequenceCondition(10)));
	}
}
