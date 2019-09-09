package practice.practice_2019_08_29;

public class Invitation {
	private Content content;
	
	
// 생성자
	public Invitation(Content content) {
		this.content = content;
	}
	
	public boolean isValid(Content content) {
		if(this.content.isEqual(content.getTitle())) {
			System.out.println("[초대장] : 초대장이 유효합니다.");
			return true;
		}
		
		System.out.println("[초대장] : 해당 컨텐츠에 이용할 수 없는 초대장 입니다.");
		return false;
	}
}
