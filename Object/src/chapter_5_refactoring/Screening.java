package chapter_5_refactoring;

import java.time.LocalDateTime;

public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;
	
	
// movie
	// accessor
	public Movie getMovie() {
		return movie;
	}
	
	// mutator
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
// sequence
	// accessor
	public int getSequence() {
		return sequence;
	}
	
	// mutator
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	
// whenScreened
	// accessor
	public LocalDateTime getWhenScreened() {
		return whenScreened;
	}
	
	// mutator
	public void setWhenScreened(LocalDateTime whenScreened) {
		this.whenScreened = whenScreened;
	}
	
	
	
}
