package Lap02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
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

}
