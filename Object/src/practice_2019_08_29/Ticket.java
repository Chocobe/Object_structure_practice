package practice_2019_08_29;

public class Ticket {
	private Content content;
	
	
// 생성자
	public Ticket(Content content) {
		this.content = content;
	}
	
	
// 컨텐츠 요금 accessor
	public Money getFee() {
		return content.getFee();
	}
	
	
// 티켓 비교하기
	public boolean isEqual(String title) {
		if(content.isEqual(title)) {
			return true;
		}
		
		return false;
	}
}
