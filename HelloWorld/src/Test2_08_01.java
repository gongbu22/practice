import java.util.Scanner;

public class Test2_08_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("커피 주문하세요>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		int price = 0;
		int total = 0;
		
		if (coffee.equals("에스프레소") ) {
			price=2000;
		} else if (coffee.equals("아메리카노")) {
			price=2500;
		} else if(coffee.equals("카푸치노")) {
			price=3000;
		} else if (coffee.equals("카페라떼")){
			price=3500;
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
		scanner.close();
		System.out.println((count*price)+"원 입니다.");
	}
}
