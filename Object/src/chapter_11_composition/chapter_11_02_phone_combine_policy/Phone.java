package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
	private List<Call> calls = new ArrayList<Call>();
	
	
// Call 하나당 요금계산
	abstract protected Money calculateCallFee(Call call);
	
	
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
