package chapter_4.chapter_4_rectangle;

public class Rectangle_pop {
	private int left;
	private int top;
	private int right;
	private int bottom;
	
	
// 생성자
	public Rectangle_pop(int left, int top, int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	
	
// left
	// accessor
	public int getLeft() { return left;	}
	// mutator
	public void setLeft(int left) { this.left = left; }
	
	
// top
	// accessor
	public int getTop() { return top; }
	// mutator
	public void setTop(int top) { this.top = top; }
	
	
// right
	// accessor
	public int getRight() { return right; }
	// mutator
	public void setRight(int right) { this.right = right; }
	
	
// bottom
	// accessor
	public int getBottom() { return bottom; }
	// mutator
	public void setBottom(int bottom) { this.bottom = bottom; }
}
