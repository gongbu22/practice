package java04;

public class CircleArray {
	public static void main(String[] args) {
		Circle3 [] c; //Circle3 배열에 대한 레퍼런스 c 선언
		c = new Circle3[5]; //5개의 레퍼런스 배열 생성
		
		for (int i=0; i<c.length; i++) { //배열의 개수 만큼
			c[i] = new Circle3(i); // i번째 원소 객체 생성
		}
		
		for(int i=0; i<c.length; i++) { //배열의 모든 Circle 객체의 면적 출력
			System.out.println((int)(c[i].getArea())+" ");
		}
	}
}
