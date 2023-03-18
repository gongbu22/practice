package java05;

class ColorPoint2 extends Point2{
	private String color;
	public ColorPoint2(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint2() {
		System.out.println(color);
		showPoint2();
	}
}
