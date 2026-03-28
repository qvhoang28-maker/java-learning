package Lap02;

import java.util.Scanner;

public class Bai04 {
	public static void Bai1() {
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

	public static void Bai2() {
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
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				double x = -(double) c / b;
				System.out.printf("Phương trình bậc nhất có nghiệm x = %.2f", x);
			}
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = (double) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x =  %.2f" + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm riêng biệt: x1 = %.2f, x2 = %.2f", x1, x2);
			}
		}
		scanner.close();
	}

	public static void Bai3() {
		System.out.println("Lap 2 Bai 3");
		System.out.println("Chương trình tính tiền điện");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số điện của bạn: ");
		int numElec = scanner.nextInt();

		if (numElec > 0 && numElec <= 100) {
			int moNey = numElec * 1000;
			System.out.println("Số tiền điện phải đóng là: " + moNey);
		} else {
			int moNey = 100 * 1000 + (numElec - 100) * 1500;
			System.out.println("Số tiền phải đóng là: " + moNey);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập lựa chọn của bạn: ");
		int value = scanner.nextInt();

		switch (value) {
		case 1:
			Bai1();
			break;
		case 2:
			Bai2();
			break;
		case 3:
			Bai3();
			break;
		case 4:
			System.out.println("Bạn đã chọn thoát chương trình");
			System.exit(0);
		}
		scanner.close();
	}
}
