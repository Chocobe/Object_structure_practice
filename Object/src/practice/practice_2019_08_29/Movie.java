package practice.practice_2019_08_29;

import java.time.Duration;

@SuppressWarnings("unused")
public class Movie implements Content {
	private String title;
	private Money fee;
	private Duration runningTime;
	
	
	public Movie(String title, Money fee, Duration runningTime) {
		this.title = title;
		this.fee = fee;
		this.runningTime = runningTime;
	}
	
	
	private boolean compareTo(String title) {
		if(this.title == title) {
			return true;
		}
		
		return false;
	}
	
	
	@Override
	public String getTitle() {
		return title;
	}
	
	
	@Override
	public Money getFee() {
		return fee;
	}
	
	
	@Override
	public boolean isEqual(String title) {
		if(this.compareTo(title)) {
			return true;
		}
		
		return false;
	}
}
