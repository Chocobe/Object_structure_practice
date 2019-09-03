package chapter_9_flaxible_structure;

public class CastTest {
	private static double fee = 0;
	
	public static void main(String[] args) {
		int val_1 = 10;
		System.out.println(add(val_1));
	}
	
	
	public static double add(double val) {
		return fee + val;
	}
}
