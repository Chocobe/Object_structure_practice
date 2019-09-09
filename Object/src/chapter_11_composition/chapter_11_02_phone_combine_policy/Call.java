package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;
import java.time.LocalDateTime;

public class Call {
	private LocalDateTime from;
	private LocalDateTime to;
	
	
// 생성자
	public Call(LocalDateTime from, LocalDateTime to) {
		this.from = from;
		this.to = to;
	}
	
	
// 사용시간 구하기
	public Duration getDuration() {
		return Duration.between(from, to);
	}
	
	
// 시작시간 getter
	public LocalDateTime getFrom() {
		return from;
	}
}
