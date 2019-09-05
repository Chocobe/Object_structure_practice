package chapter_04.chapter_4_pop_structure;

import java.time.LocalDateTime;

public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;
	
	
	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}
	
	
	public Money calculateFee(int audienceCount) {
		switch(movie.getMovieType()) {
		case AMOUNT_DISCOUNT:
			if(movie.isDiscountable(whenScreened, audienceCount)) {
				return movie.calculateAmountDiscountedFee().times(audienceCount);
			}
			
			break;
			
		case PERCENT_DISCOUNT:
			if(movie.isDiscountable(whenScreened, audienceCount)) {
				return movie.calculatePercentDiscountedFee().times(audienceCount);
			}
			
			break;
			
		case NONE_DISCOUNT:
			return movie.calculateNoneDiscountedFee().times(audienceCount);
		}
		
		return movie.calculateNoneDiscountedFee().times(audienceCount);
	}
	
	
// 캡슐화를 위한 변경
	
//// movie
//	// accessor
//	public Movie getMovie() {
//		return movie;
//	}
//	
//	// mutator
//	public void setMovie(Movie movie) {
//		this.movie = movie;
//	}
//	
//	
//// sequence
//	// accessor
//	public int getSequence() {
//		return sequence;
//	}
//	
//	// mutator
//	public void setSequence(int sequence) {
//		this.sequence = sequence;
//	}
//	
//	
//// whenScreened
//	// accessor
//	public LocalDateTime getWhenScreened() {
//		return whenScreened;
//	}
//	
//	// mutator
//	public void setWhenScreened(LocalDateTime whenScreened) {
//		this.whenScreened = whenScreened;
//	}
}
