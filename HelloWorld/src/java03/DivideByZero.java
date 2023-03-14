package java03;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int divided;
		int divisor;
		
		System.out.println("나뉨수를 입력하세요:");
		divided = scanner.nextInt();
		System.out.println("나눗수를 입력하시요:");
		divisor = scanner.nextInt();
		System.out.println(divided+"를 "+divisor+"로 나누면 몫은 "+divided/divisor+"입니다.");
	}
}
