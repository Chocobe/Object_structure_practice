package chapter_04.chapter_4_rectangle;

public class AnyClass_pop {
	public void anyMethod(Rectangle_pop rectangle, int multiple) {
		rectangle.setLeft(rectangle.getLeft() * multiple);
		rectangle.setTop(rectangle.getTop() * multiple);
		rectangle.setRight(rectangle.getRight() * multiple);
		rectangle.setBottom(rectangle.getBottom() * multiple);
	}
}
