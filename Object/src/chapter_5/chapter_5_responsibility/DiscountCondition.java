package chapter_5.chapter_5_responsibility;

// PeriodCondition과 SequenceCondition의 역할로 만들어 준다. (interface)
public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screnning);
	
// 기간조건과 순서조건 두개의 독립된 타입을 개별 클래스로 분리하기
	
//	// 이 조건객체의 타입
//	private DiscountConditionType type;
//	
//	// 순서조건에 사용할 필드변수
//	private int sequence;
//	
//	// 기간조건에 사용할 필드변수
//	private DayOfWeek dayOfWeek;
//	private LocalTime startTime;
//	private LocalTime endTime;
//	
//	
//// screening은 이 조건에 만족하는가?
//	public boolean isSatisfiedBy(Screening screening) {
//		if(type == DiscountConditionType.PERIOD) {
//			return isSatisfiedByPeriod(screening);
//		}
//		
//		return isSatisfiedBySequence(screening);
//	}
//	
//	
//// 기간조건에 만족하는가?
//	private boolean isSatisfiedByPeriod(Screening screening) {
//		return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
//						startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
//						endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
//	}
//	
//	
//// 순번조건에 만족하는가?
//	private boolean isSatisfiedBySequence(Screening screening) {
//		return sequence == screening.getSequence();
//	}
}
