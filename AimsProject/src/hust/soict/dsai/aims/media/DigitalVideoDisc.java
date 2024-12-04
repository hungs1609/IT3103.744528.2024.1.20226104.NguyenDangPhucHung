package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		nbDigitalVideoDiscs++;
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	public String toString() {

		return "DVD - title: " + this.getTitle() +
				" - category: " + this.getCategory() +
				" - director: " + this.getDirector() +
				" - length: " + this.getLength() +
				" - cost: " + this.getCost() + "$";
	}
}
