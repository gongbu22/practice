import java.util.Scanner;

public class Twnties {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하시요:");
		int age = scanner.nextInt(); //정수입력
		if ((age>=20)&& (age<30)) { //age가 20~29 사이인지 검사
			System.out.print("20대입니다.");
			System.out.print("20대라서 행복합니다! 아자아자 화이팅!");
		} else
			System.out.print("20대가 아닙니다.");
		
		scanner.close();
	}
}
