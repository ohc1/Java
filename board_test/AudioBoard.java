package submit03.submit_01;

public class AudioBoard extends Board{
	String audio;	// 오디오 파일
	
	public AudioBoard(String title,  String contents, String audio) {
		super(title, contents);
		this.audio = audio;
	}

	@Override
	public String toString() {
		return super.toString() + ", AudioBoard [audio=" + audio + "]";
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
}