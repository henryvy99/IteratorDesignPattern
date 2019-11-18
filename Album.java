import java.util.Iterator;

/**
 * Album class responsible for adding songs to an array of songs
 * @author henryvy
 *
 */
public class Album {
	static final int MAX_SONGS = 20;
	private Song[] songs;
	private int count;
	private String name;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Album(String name) {
		songs = new Song[MAX_SONGS];
		this.name = name;
	}
	
	/**
	 * Adds a new song if it has not exceeded the maximum number of songs
	 * @param name
	 * @param artist
	 * @param length
	 * @param genre
	 */
	public void addSong(String name, String artist, double length, String genre) {
		Song song = new Song(name, artist, length, genre);
		if (count >= MAX_SONGS) {
			System.err.println("Sorry, album is full!  Can't add song to album");
		} else {
			songs[count] = song;
			count++;
		}
		
	}
	
	/**
	 * Creates iterator for Album
	 * @return
	 */
	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
}
