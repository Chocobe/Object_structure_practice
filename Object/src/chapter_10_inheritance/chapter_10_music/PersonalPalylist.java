package chapter_10_inheritance.chapter_10_music;

// 삭제기능이 추가된 Playlist
public class PersonalPalylist extends Playlist {
	
	
// 음악 삭제하기
	public void remove(Song song) {
		getTracks().remove(song);
		getSingers().remove(song.getSinger());
	}
}
