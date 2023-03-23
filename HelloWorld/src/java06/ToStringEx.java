package java06;

public class ToStringEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a); //a는 a.toString()으로 자동변환됨

	}

}
