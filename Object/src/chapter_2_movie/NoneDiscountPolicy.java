package chapter_2_movie;

public class NoneDiscountPolicy implements DiscountPolicy {

	// DiscountPolicy의 calculateDiscountAmount()에서 호출 자체가 안된다.
	// 여기의 getDiscountAmount는 그저 개념적일 뿐이다.
	// 개념적인 혼란과 결합을 일으키는 부분
	// DiscountPolicy 클래스를 interface로 변경하자.
	// (기존의 DiscountPolicy 클래스는 DefaultDiscountPolicy 클래스로 변경)
	@Override
	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
	
}
