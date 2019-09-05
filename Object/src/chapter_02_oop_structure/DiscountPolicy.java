package chapter_02_oop_structure;

public interface DiscountPolicy {
	public Money calculateDiscountAmount(Screening screening);
	
// NoneDiscountPolicy 클래스의 일관성을 위해,
// DiscountPolicy 클래스를 인터페이스로 변경.
// 아래의 기존 코드는 DefaultDiscountPolicy 클래스로 이동
	
//	private List<DiscountCondition> conditions = new ArrayList<>();
	

//// 생성자
//	public DiscountPolicy(DiscountCondition ... discountCondition) {
//		this.conditions = Arrays.asList(discountCondition);
//	}
//	
//	
//// 할인 계산
//	public Money calculateDiscountAmount(Screening screening) {
//		for(DiscountCondition each : conditions) {
//			if(each.isSatisfiedBy(screening)) {
//				return getDiscountAmount(screening);
//			}
//		}
//		
//		return Money.ZERO;
//	}
//	
//	
//// 할인을 계산할 메소드 (자식 메소드에게 위임 : 템플릿 메소드 패턴(Template Method pattern)
//	abstract protected Money getDiscountAmount(Screening screening);
}
