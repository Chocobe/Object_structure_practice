package chapter_06.chapter_6_command_query_separation;

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
	

	// 개념적으로 "쿼리"형 메소드
	public boolean isSatisfied(RecurringSchedule schedule) {
		if(from.getDayOfWeek() != schedule.getDayOfWeek() ||
						!from.toLocalTime().equals(schedule.getFrom()) ||
						!duration.equals(schedule.getDuration())) {
			
			// "명령"형 메소드를 호출하면서, "명령" 과 "쿼리"가 혼합된 메소드가 되버렸다.
			// 삭제하자
//			reschedule(schedule);
			
			return false;
		}
		
		return true;
	}
	
	
	// "명령"형 메소드
	public void reschedule(RecurringSchedule schedule) {
		from = LocalDateTime.of(
						from.toLocalDate().plusDays(dayDistance(schedule)), 
						schedule.getFrom());
		duration = schedule.getDuration();
	}
	
	
	private long dayDistance(RecurringSchedule schedule) {
		System.out.println(
				"schedule : " + schedule.getDayOfWeek().getValue());
		System.out.println(
				"event : " + from.getDayOfWeek().getValue());
		
		return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
	}
}
