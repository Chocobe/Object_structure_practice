package practice.localDateTimeTester;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeTester {
	public static void main(String[] args) {
		LocalDateTime when = LocalDateTime.of(2019, 8, 31, 18, 48);
		
		// 년도 비교
		if(when.getYear() == 2019) {
			System.out.println("년도가 동일합니다");
			
		} else {
			System.out.println("년도가 다릅니다");
		}
		
		
		// 월 비교
		if(when.getMonthValue() == 8) {
			System.out.println("월이 동일합니다");
			
		} else {
			System.out.println("월이 다릅니다");
		}
		
		
		// 일 비교
		if(when.getDayOfMonth() == 31) {
			System.out.println("날짜가 동일합니다");
			
		} else {
			System.out.println("날짜가 다릅니다");
		}
		
		
		// LocalDate 비교
		if(when.toLocalDate().equals(LocalDate.of(2019, 8, 31))) {
			System.out.println("동일하다");
			
		} else {
			System.out.println("다르다");
		}
	}
}
