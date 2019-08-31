package chapter_6.chapter_6_command_query_separation;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainRunner {
	public static void main(String[] args) {
		// 반복일정 생성
		RecurringSchedule schedule = new RecurringSchedule("회의", 
						DayOfWeek.WEDNESDAY, 
						LocalTime.of(10, 30), 
						Duration.ofMinutes(30));
		
		// 이벤트 생성
		Event meeting= new Event("회의", 
						LocalDateTime.of(2019, 5, 9, 10, 30), 
						Duration.ofMinutes(30));
		
		assert meeting.isSatisfied(schedule) == false;
		meeting.reschedule(schedule);		
		
		assert meeting.isSatisfied(schedule) == true;
		
		System.out.println("정상 종료");
	}
}
