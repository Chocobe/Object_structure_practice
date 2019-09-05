package chapter_10_inheritance.chapter_10_music;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private List<Song> tracks = new ArrayList<Song>();
	
	
// 생성자
	public Playlist(List<Song> tracks) {
		this.tracks = tracks;
	}
	
	
// 음악 추가하기
	public void append(Song song) {
		tracks.add(song);
	}
	
	
// 플레이 리스트 getter
	public List<Song> getTracks() {
		return tracks;
	}
}
