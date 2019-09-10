package chapter_11_composition.chapter_11_03_phone_change_to_composition;

import java.util.ArrayList;
import java.util.List;

public class Phone {
	private RatePolicy ratePolicy;
	private List<Call> calls = new ArrayList<Call>();
	
	public Phone(RatePolicy ratePolicy) {
		this.ratePolicy = ratePolicy;
	}
	
	public List<Call> getCalls() {
		return calls;
	}
	
	public Money calculateFee() {
		return ratePolicy.calculateFee(this);
	}
	
	public void call(Call call) {
		calls.add(call);
	}
}
