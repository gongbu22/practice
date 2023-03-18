package java05;

class Point2 {
	private int x,y;
	public Point2() {
		this.x=this.y=0;
	}
	public Point2(int x, int y) {
		this.x = x; this.y=y;
		System.out.println("상위"+"("+x+","+y+")");
	}
	public void showPoint2() {
		System.out.println("("+x+","+y+")");
	}
}
