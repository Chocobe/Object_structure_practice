package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeInterval {
	private LocalDateTime from;
	private LocalDateTime to;
	
	
// 생성자
	private DateTimeInterval(LocalDateTime from, LocalDateTime to) {
		this.from = from;
		this.to = to;
	}
	
	
	public static DateTimeInterval of(LocalDateTime from, LocalDateTime to) {
		return new DateTimeInterval(from, to);
	}
	
	
	public static DateTimeInterval toMidnight(LocalDateTime from) {
		return new DateTimeInterval(
				from,
				LocalDateTime.of(from.toLocalDate(), 
								 LocalTime.of(23, 59, 59)));
	}
	
	
	public static DateTimeInterval fromMidnight(LocalDateTime to) {
		return new DateTimeInterval(
				LocalDateTime.of(to.toLocalDate(), LocalTime.of(0, 0)),
				to);
	}
	
	
	public static DateTimeInterval during(LocalDate date) {
		return new DateTimeInterval(
				LocalDateTime.of(date, LocalTime.of(0, 0)),
				LocalDateTime.of(date, LocalTime.of(23, 59, 59)));
	}
	
	
	public Duration duration() {
		return Duration.between(from, to);
	}
	
	
	public LocalDateTime getFrom() {
		return from;
	}
	
	
	public LocalDateTime getTo() {
		return to;
	}
}
