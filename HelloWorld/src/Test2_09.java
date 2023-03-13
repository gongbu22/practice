import java.util.Scanner;

public class Test2_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하세요>>");
		int gamenumber = scanner.nextInt();
		
		int first = gamenumber/10;
		int second = gamenumber%10;
		if (gamenumber>=10) {
			if ((first%3==0)&&(second%3==0)) {
				System.out.println("박수짝짝");
			}else if ((first%3==0) || (second%3==0)) {
				System.out.println("박수짝");
			} else {
				System.out.println("박수없음");
			}
		}else {
			if (gamenumber%3==0) {
				System.out.println("박수짝");
			}else {
				System.out.println("박수없음");
			}
		}
		scanner.close();
	}
}
