package viethoangit;

import java.util.Scanner;

public class Lap1Bai3 {
	public static void main(String[] args) {
		System.out.println("Run bài 03");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cạnh khối lập phương: ");
		double canh = scanner.nextDouble();

		System.out.println("Thể tích: " + Math.pow(canh, 3));
		scanner.close();
	}

}
