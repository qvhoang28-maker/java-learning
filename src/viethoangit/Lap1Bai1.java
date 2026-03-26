package viethoangit;

import java.util.Scanner;

public class Lap1Bai1 {
	public static void main(String[] args) {
		System.out.println("Run bài 01");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Tên Sinh Viên: ");
		String name = scanner.nextLine();

		System.out.println("Điểm trung bình: ");
		double point = scanner.nextDouble();

		System.out.println("Tên bạn là: " + name + ", điểm trung bình là: " + point);
		scanner.close();
	}
}
