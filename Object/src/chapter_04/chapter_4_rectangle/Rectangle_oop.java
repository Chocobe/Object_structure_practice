package chapter_04.chapter_4_rectangle;

public class Rectangle_oop {
	private int length;
	private int height;
	
	
// 생성자
	public Rectangle_oop(int length, int height) {
		this.length = length;
		this.height = height;
	}
	
	
// 사각형 크기 수정
	public void enlarge(int multiple) {
		length *= multiple;
		height *= multiple;
	}
}
