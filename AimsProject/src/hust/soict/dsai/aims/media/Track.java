package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track() {
	}
	
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;  
	    
	    if (o == null || getClass() != o.getClass()) return false;  
	    
	    Track track = (Track) o;
	    return this.title.equals(track.title) && this.length == track.length;
	}

}
