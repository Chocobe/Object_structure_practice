package chapter_7_procedure_abstraction;

import java.util.Scanner;

public class PayCalculateSystem {
	private static Scanner scanner = new Scanner(System.in);
	
	private static String[] employees = { "직원A", "직원B", "직원C" };
	private static int[] basePays = { 400, 300, 250 };
	
	public static void main(String[] args) {
		System.out.print("이름입력 : ");
		String name = scanner.nextLine();
		
		systemRunner(name);
	}	
	
	
	public static void systemRunner(String name) {
		int taxRate = getTaxRate();
		int pay = calculatePayFor(name, taxRate);
		describeResult(name, pay);
	}
	
	
	private static int getTaxRate() {
		System.out.print("세율을 입력하세요 : ");
		return scanner.nextInt();
	}
	
	
	private static int calculatePayFor(String name, int taxRate) {
		int index = -1;
		int basePay = 0;
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].equals(name)) {
				index = i;
				basePay = basePays[index];
				
				return basePay - (basePay * taxRate / 100);
			}
		}
		
		return 0;
	}
	
	
	private static void describeResult(String name, int pay) {
		System.out.println("이름 : " + name + ", 급여 : " + pay);
	}
}
