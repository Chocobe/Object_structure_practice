package chapter_6.chapter_6_command_query_separation;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
	private String subject;			// 주제
	private LocalDateTime from;		// 시작 일시
	private Duration duration;		// 소요 시간
	
	
	public Event(String subject, LocalDateTime from, Duration duration) {
		this.subject = subject;
		this.from = from;
		this.duration = duration;
	}
}
