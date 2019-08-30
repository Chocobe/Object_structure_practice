package chapter_5_refactoring;

public class ReservationAgency {
	
// 할인 가능한가?
	private boolean checkDiscountable(Screening screening) {
		Movie movie = screening.getMovie();
		
		return movie.getDiscountConditions().stream().anyMatch(
						condition -> condition.isDiscountable(condition, screening));
	}
	
	
// 요금 할인 해주기
	private Money calculateFee(Screening screening, boolean discountable, int audienceCount) {
		if(discountable) {
			return screening.getMovie().getFee().minus(
							calculateDiscountedFee(screening.getMovie())).times(audienceCount);
		}
		
		return screening.getMovie().getFee();
	}
	
	private Money calculateDiscountedFee(Movie movie) {
		switch(movie.getMovieType()) {
		case AMOUNT_DISCOUNT:
			return calculateAmountDiscountedFee(movie);
			
		case PERCENT_DISCOUNT:
			return calculatePercentDiscountedFee(movie);
			
		case NONE_DISCOUNT:
			return calculateNoneDiscountedFee(movie);
		}
		
		throw new IllegalArgumentException();
	}
	
	private Money calculateAmountDiscountedFee(Movie movie) {
		return movie.getDiscountAmount();
	}
	
	private Money calculatePercentDiscountedFee(Movie movie) {
		return movie.getFee().times(movie.getDiscountPercent());
	}
	
	private Money calculateNoneDiscountedFee(Movie movie) {
		return Money.ZERO;
	}
	
	
// 예약하기
	public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
		boolean discountable = checkDiscountable(screening);
		
//		Movie movie = screening.getMovie();
//		
//		boolean discountable = false;
//		for(DiscountCondition condition : movie.getDiscountConditions()) {
//			if(condition.getType() == DiscountConditionType.PERIOD) {
//				discountable = 
//						screening.getWhenScreened().getDayOfWeek() == condition.getDayOfWeek() &&
//						screening.getWhenScreened().toLocalTime().compareTo(condition.getStartTime()) >= 0 &&
//						screening.getWhenScreened().toLocalTime().compareTo(condition.getEndTime()) <= 0;
//						
//			} else {
//				discountable = screening.getSequence() == condition.getSequence();
//			}
//			
//			if(discountable) {
//				break;
//			}			
//		}
		
		
		Money fee = calculateFee(screening, discountable, audienceCount);
		
//		Money fee;
//		if(discountable) {
//			Money discountAmount = Money.ZERO;
//			
//			switch(movie.getMovieType()) {
//			case PERCENT_DISCOUNT:
//				discountAmount = movie.getFee().times(movie.getDiscountPercent());
//				break;
//				
//			case AMOUNT_DISCOUNT:
//				discountAmount = movie.getDiscountAmount();
//				break;
//				
//			case NONE_DISCOUNT:
//				discountAmount = Money.ZERO;
//				break;
//			}
//			
//			fee = movie.getFee().minus(discountAmount).times(audienceCount);
//			
//		} else {
//			fee = movie.getFee();
//		}
		
		
		return new Reservation(customer, screening, fee, audienceCount);
	}
}
