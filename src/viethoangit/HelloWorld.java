package viethoangit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("FN = " + Math.sqrt(49));
		int firstNum = scanner.nextInt();

		System.out.print("SN = ");
		int secondNum = scanner.nextInt();
		System.out.println("Min = " + Math.min(firstNum, secondNum));

	}
}
