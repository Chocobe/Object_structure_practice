package chapter_14_phone.chapter_14_01_phone_origin;

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
