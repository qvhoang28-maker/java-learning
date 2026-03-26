package viethoangit;

import java.util.Scanner;

public class Lap1Bai2 {
	public static void main(String[] args) {
		System.out.println("Run bài 02");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Chiều dài HCN: ");
		double chieudai = scanner.nextDouble();

		System.out.println("Chiều rộng HCN: ");
		double chieurong = scanner.nextDouble();

		System.out.println("Chu vi HCN: " + (chieudai + chieurong) * 2);

		System.out.println("Diện tích HCN: " + (chieudai * chieurong));

		System.out.println("Cạnh nhỏ nhất: " + Math.min(chieudai, chieurong));
		scanner.close();
	}

}
