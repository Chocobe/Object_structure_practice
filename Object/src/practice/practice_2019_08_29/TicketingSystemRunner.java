package practice.practice_2019_08_29;

import java.time.Duration;

public class TicketingSystemRunner {
	public static void main(String[] args) {
		Theater theater = new Theater();
		
		
		// 컨텐츠 titanic 생성 & 테스트
		Content titanic = new Movie(
						"타이타닉", 
						Money.wons(9000), 
						Duration.ofMinutes(180));
	
		Customer customer_1 = new Customer(Money.wons(18000));
		hasEnter(theater.enter(customer_1, titanic));
		
		Customer customer_2 = new Customer(Money.wons(0), new Invitation(titanic));
		hasEnter(theater.enter(customer_2, titanic));
		
		
		// 컨텐츠 chocobe 생성 & 테스트
		Content chocobe = new Movie(
						"초코비", 
						Money.wons(12600), 
						Duration.ofMinutes(150));
		
		hasEnter(theater.enter(customer_1, chocobe));
		
		hasEnter(theater.enter(customer_2, chocobe));
		
		
		// 초대장 테스트
		System.out.println("----- 초대장 테스트 -----\n");
		
		Customer customer_3 = new Customer(Money.wons(9000), new Invitation(titanic));
		hasEnter(theater.enter(customer_3, chocobe));
		
		System.out.println("----- 초대장 테스트 -----\n");
		hasEnter(theater.enter(customer_3, titanic));
		
		System.out.println("----- 초대장 테스트 -----\n");
		hasEnter(theater.enter(customer_3, chocobe));
		
		System.out.println("----- 초대장 테스트 -----\n");
		hasEnter(theater.enter(customer_3, titanic));
	}
	
	
// 결과 출력 메소드
	public static void hasEnter(boolean result) {
		ResultOutputFunction function = 
				(boolean state) -> { 
					if(state) {
						System.out.println("[시스템] : 손님이 입장하였습니다.");
						
					} else {
						System.out.println("[시스템] : 손님이 돌아갔습니다.");
					}
					
					System.out.println("\n------------------------------------------\n");
				};
		
		function.printing(result);
					
	}
}
