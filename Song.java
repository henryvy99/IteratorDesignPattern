/**
 * Song class for defining a song type
 * @author henryvy
 *
 */
public class Song {
	private String name;
	private String artist;
	private double length;
	private String genre;
	
	/**
	 * Song constructor
	 * @param name
	 * @param artist
	 * @param length
	 * @param genre
	 */
	public Song(String name, String artist, double length, String genre) {
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}
	
	/**
	 * Prints song
	 */
	public void print() {
		System.out.println(this.name + " by " + this.artist + " category: " + this.genre + " length: " + this.length + " min");
	}
}
