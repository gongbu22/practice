import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("좋아하는 과일, 과일수, 해당과일 재고여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(); //문자열 토큰 읽기
		System.out.println("좋아하는 과일이름은 "+name+"입니다.");
		int count = scanner.nextInt(); //정수 토큰 읽기
		System.out.println("과일 갯수는"+count+"개 입니다.");
		boolean store = scanner.nextBoolean(); //논리토큰읽기
		System.out.println("과일재고여부는"+store+"입니다.");
		
		scanner.close(); //scanner 스트림 닫기
	}
}
