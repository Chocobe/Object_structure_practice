package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
	private List<Call> calls = new ArrayList<Call>();
	
	
// Call 하나당 요금계산
	abstract protected Money calculateCallFee(Call call);
	
	
	// 훅 메소드(hook method)
	// 자식 클래스에서 코드 반복이 생기므로, 여기서 구현한다.
	protected Money afterCalculated(Money fee) {
		return fee;
	}
// 부모 클래스와 자식 클래스의 결합도를 낮추기 위한 추상 메소드
//	abstract protected Money afterCalculated(Money fee);
	
	
	public Money calculateFee() {
		Money result = Money.ZERO;
		
		for(Call call : calls) {
			result = result.plus(calculateCallFee(call));
		}
		
		return result;
	}
	
	
	public void call(Call call) {
		calls.add(call);
	}
}
