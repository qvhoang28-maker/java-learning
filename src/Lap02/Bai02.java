package Lap02;

import java.util.Scanner;

public class Bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x =  %.2f", x);
		}
	}

	public static void main(String[] args) {
		System.out.println("Lap 2 Bai 2");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập a = ");
		int a = scanner.nextInt();
		System.out.println("Nhập b = ");
		int b = scanner.nextInt();
		System.out.println("Nhập c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);
		if (a == 0) {
			//
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x =  %.2d" + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm riêng biệt: x1 = %.2f, x2 = %.2f", x1, x2);
			}
		}
		scanner.close();
	}
}
