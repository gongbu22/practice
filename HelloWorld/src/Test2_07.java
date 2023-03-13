import java.util.Scanner;

public class Test2_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요>>");
		String grade = scanner.next();
		
		switch (grade){
		case "A": case "B":
			System.out.println("Excellent");
			break;
		case "C": case "D":
			System.out.println("Good");
			break;
		default:
			System.out.println("Bye");
		}
	}
}
