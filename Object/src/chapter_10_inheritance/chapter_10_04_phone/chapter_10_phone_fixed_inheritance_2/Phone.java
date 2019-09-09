package chapter_10_inheritance.chapter_10_04_phone.chapter_10_phone_fixed_inheritance_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
	private double taxRate;
	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public Phone(double taxRate) {
		this.taxRate = taxRate;
	}
	
	
// Call 하나당 요금계산
	abstract protected Money calculateCallFee(Call call);
	
	
	public Money calculateFee() {
		Money result = Money.ZERO;
		
		for(Call call : calls) {
			result = result.plus(calculateCallFee(call));
		}
		
		return result.plus(result.times(taxRate));
	}
	
	
	public void call(Call call) {
		calls.add(call);
	}
}
