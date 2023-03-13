import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 철수와 영희 가위바위보 입력받기
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.println("철수 >>");
		String chulsu = scanner.next();
		System.out.println("영희 >>");
		String younghui = scanner.next();
		
		if (chulsu.equals("가위")) {
			if (younghui.equals("가위")) {
				System.out.println("비겼습니다.");
			} else if (younghui.equals("보")){
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("영희가 이겼습니다.");
			}
		} else if (chulsu.equals("보")) {
			if (younghui.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}else if (younghui.equals("보")) {
				System.out.println("비겼습니다.");
			}else if (younghui.equals("주먹")) {
				System.out.println("철수가 이겼습니다.");
			}
		} else {
			if (younghui.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if (younghui.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}else if (younghui.equals("주먹")) {
				System.out.println("비겼습니다.");
			}
		}
		
		scanner.close();
	}
}
