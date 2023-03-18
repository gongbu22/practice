package java04;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book3 [] book = new Book3[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.println("제목>>");
			String title = scanner.nextLine();
			System.out.println("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book3(title, author);
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println("("+book[i].title+","+book[i].author+")");
		}
		scanner.close();
	}
}
