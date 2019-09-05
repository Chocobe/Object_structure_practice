package chapter_10_inheritance.chapter_10_music;

public class Song {
	private String singer;
	private String title;
	
	
// 생성자
	public Song(String singer, String title) {
		this.singer = singer;
		this.title = title;
	}
	
	
// getter
	public String getSinger() {
		return singer;
	}
	
	public String getTitle() {
		return title;
	}
}
