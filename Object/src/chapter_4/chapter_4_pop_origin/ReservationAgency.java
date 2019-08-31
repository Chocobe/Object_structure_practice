package chapter_4.chapter_4_pop_origin;

public class ReservationAgency {
	public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
		Movie movie = screening.getMovie();
		
		boolean discountable = false;
		for(DiscountCondition condition : movie.getDiscountConditions()) {
			if(condition.getType() == DiscountConditionType.PERIOD) {
				discountable = 
						screening.getWhenScreened().getDayOfWeek() == condition.getDayOfWeek() &&
						screening.getWhenScreened().toLocalTime().compareTo(condition.getStartTime()) >= 0 &&
						screening.getWhenScreened().toLocalTime().compareTo(condition.getEndTime()) <= 0;
						
			} else {
				discountable = screening.getSequence() == condition.getSequence();
			}
			
			if(discountable) {
				break;
			}			
		}
		
		Money fee;
		if(discountable) {
			Money discountAmount = Money.ZERO;
			
			switch(movie.getMovieType()) {
			case PERCENT_DISCOUNT:
				discountAmount = movie.getFee().times(movie.getDiscountPercent());
				break;
				
			case AMOUNT_DISCOUNT:
				discountAmount = movie.getDiscountAmount();
				break;
				
			case NONE_DISCOUNT:
				discountAmount = Money.ZERO;
				break;
			}
			
			fee = movie.getFee().minus(discountAmount).times(audienceCount);
			
		} else {
			fee = movie.getFee();
		}
		
		return new Reservation(customer, screening, fee, audienceCount);
	}
}
