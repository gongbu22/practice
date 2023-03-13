import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.(1~3)");
		int a = scanner.nextInt();
		switch (a) {
		case 1: 
			System.out.println("!");
			break;
		case 2:
			System.out.println("@");
			break;
		case 3:
			System.out.println("#");
			break;
		default:
			System.out.println("*");
		}
		scanner.close();
	}
}
