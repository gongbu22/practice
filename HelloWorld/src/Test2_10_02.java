import java.util.Scanner;

public class Test2_10_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("커피를 주문하세요>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		double price=0;
		
		if (coffee.equals("에스프레소")) {
			if (count>=10) {
				price=2000*0.95;
			}else {
				price= 2000;
			}
		}else if(coffee.equals("아메리카노")) {
			price=2500;
		}else if (coffee.equals("카푸치노")) {
			price=3000;
		}else if (coffee.equals("카페라떼")) {
			price=3500;
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
		System.out.println((count*price)+"원 입니다.");
		scanner.close();
	}
}
