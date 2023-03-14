package java03;

import java.util.Random;
import java.util.Scanner;

public class Test3_chanllenge {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("up & down 게임입니다. 숨겨진 수를 맞추어보세요.");
			Random r = new Random();
			int k = r.nextInt(100);
		for(int i=1; i<=100; i++) {
			
			System.out.print(i+">> ");
			int number = scanner.nextInt();
			
			if(number>k) {
				System.out.println("더 낮게");
			}else if(number<k) {
				System.out.println("더 높게");
			}else if(number==k) {
				System.out.println("맞았습니다.");
				break;
			}
			
			}
		System.out.println("다시하시겠습니까?(y/n)");
		String answer = scanner.next();
		if(answer.equals("n")) {
			System.out.println("종료합니다.");
			scanner.close();
			break;
		}
		
		}
	}
}
