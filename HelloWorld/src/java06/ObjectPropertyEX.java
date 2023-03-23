package java06;

public class ObjectPropertyEX {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.getClass().getName()); //클래스 이름
		System.out.println(p.hashCode()); //해시코드 값
		System.out.println(p.toString()); //객체의 문자열

	}

}
