package chapter_6.chapter_6_command_query_separation;

import java.time.Duration;
import java.time.LocalDateTime;

public class MainRunner {
	public static void main(String[] args) {
		Event event = new Event("회의", 
						LocalDateTime.of(2019, 5, 8, 10, 30), Duration.ofMinutes(30));
	}
}
