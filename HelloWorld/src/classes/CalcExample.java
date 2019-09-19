package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 넣으세요.");
		int a = sc.nextInt();
		System.out.println("두번째 값을 넣으세요.");
		int b = sc.nextInt();
		Calculator cal = new Calculator();
		cal.execute(a, b);

	}
}
