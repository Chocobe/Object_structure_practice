package chapter_11_composition.chapter_11_03_phone_change_to_composition;

public interface RatePolicy {
	Money calculateFee(Phone phone);
}
