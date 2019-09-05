package chapter_10_inheritance.chapter_10_music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private List<Song> tracks = new ArrayList<Song>();
	private Map<String, String> singers = new HashMap<String, String>();
	
	
// 음악 추가하기
	public void append(Song song) {
		tracks.add(song);
		singers.put(song.getSinger(), song.getTitle());
	}
	
	
// 플레이 리스트 getter
	public List<Song> getTracks() {
		return tracks;
	}
	
	
// 가수/제목 목록 getter
	public Map<String, String> getSingers() {
		return singers;
	}
}
