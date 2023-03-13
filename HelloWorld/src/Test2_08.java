import java.util.Scanner;

public class Test2_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("커피를 주문하세요>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		int total = 0;
		
		switch (coffee) {
		case "에스프레소" :
			total = count*2000;
			System.out.println(total+"원 입니다.");
			break;
		case "아메리카노":
			total = count*2500;
			System.out.println(total+"원 입니다.");
			break;
		case "카푸치노":
			 total=count*3000;
			 System.out.println(total+"원 입니다.");
			 break;
		case "카페라떼":
			total=count*3500;
			System.out.println(total+"원 입니다.");
			break;
		}
		
		scanner.close();
	}
}
