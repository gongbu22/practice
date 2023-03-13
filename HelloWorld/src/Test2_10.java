import java.util.Scanner;

public class Test2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("커피를 주문하세요>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		double total=0;
		
		if (coffee.equals("에스프레소")) {
			if (count>=10) {
				total=(count*2000)*0.95;
			}else {
				total= count*2000;
			}
		}else if(coffee.equals("아메리카노")) {
			total=count*2500;
		}else if (coffee.equals("카푸치노")) {
			total=count*3000;
		}else if (coffee.equals("카페라떼")) {
			total=count*3500;
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
		System.out.println(total+"원 입니다.");
		scanner.close();
	}
}
