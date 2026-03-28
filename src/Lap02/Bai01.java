package Lap02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Lap 1 Bai 01");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a = ");
		int a = scanner.nextInt();
		System.out.println("Nhập b = ");
		int b = scanner.nextInt();

		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x =  %.2f", x);
		}
		scanner.close();
	}
}
