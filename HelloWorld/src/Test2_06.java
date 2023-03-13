import java.util.Scanner;

public class Test2_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("돈의 액수를 입력하세요 >>");
		int money = scanner.nextInt();
		
		if (money >=50000) {
			int fivemillion = money/50000;
			System.out.println("오만원"+fivemillion+"개,");
			int million = (money%50000)/10000;
			System.out.println("만원"+million+"개,");
			int thousand = ((money%50000)%10000)/1000;
			System.out.println("천원"+thousand+"개,");
			int fivehundred = (((money%50000)%10000)%1000)/500;
			System.out.println("500원"+fivehundred+"개,");
			int hundred = ((((money%50000)%10000)%1000)%500)/100;
			System.out.println("100원"+hundred+"개,");
			int ten = (((((money%50000)%10000)%1000)%500)%100)/10;
			System.out.println("10원"+ten+"개,");
			int one = (((((money%50000)%10000)%1000)%500)%100)%10;
			System.out.println("1원"+one+"개");
		}else if (money >=10000) {
			int million = money/10000;
			System.out.println("만원"+million+"개,");
			int thousand = (money%10000)/1000;
			System.out.println("천원"+thousand+"개,");
			int fivehundred = ((money%10000)%1000)/500;
			System.out.println("500원"+fivehundred+"개,");
			int hundred = (((money%10000)%1000)%500)/100;
			System.out.println("100원"+hundred+"개,");
			int ten = ((((money%10000)%1000)%500)%100)/10;
			System.out.println("10원"+ten+"개,");
			int one = ((((money%10000)%1000)%500)%100)%10;
			System.out.println("1원"+one+"개");
		} else if (money >=1000) {
			int thousand = money/1000;
			System.out.println("천원"+thousand+"개,");
			int fivehundred = (money%1000)/500;
			System.out.println("500원"+fivehundred+"개,");
			int hundred = ((money%1000)%500)/100;
			System.out.println("100원"+hundred+"개,");
			int ten = (((money%1000)%500)%100)/10;
			System.out.println("10원"+ten+"개,");
			int one = (((money%1000)%500)%100)%10;
			System.out.println("1원"+one+"개");
		} else if (money >=500) {
			int fivehundred = money/500;
			System.out.println("500원"+fivehundred+"개,");
			int hundred = (money%500)/100;
			System.out.println("100원"+hundred+"개,");
			int ten = ((money%500)%100)/10;
			System.out.println("10원"+ten+"개,");
			int one = ((money%500)%100)%10;
			System.out.println("1원"+one+"개");
		} else if (money>=100) {
			int hundred = money/100;
			System.out.println("100원"+hundred+"개,");
			int ten = (money%100)/10;
			System.out.println("10원"+ten+"개,");
			int one = (money%100)%10;
			System.out.println("1원"+one+"개");
		} else if (money>=10) {
			int ten = money/10;
			System.out.println("10원"+ten+"개,");
			int one = money%10;
			System.out.println("1원"+one+"개");
		} else {
			int one = money%10;
			System.out.println("1원"+one+"개");
		}
		scanner.close();
	}
}
