import java.util.Iterator;

/**
 * AlbumIterator that implements the built in java Iterator
 * @author henryvy
 *
 */
public class AlbumIterator implements Iterator{
	private Song[] song;
	private int position = 0;
	
	/**
	 * Constructor
	 * @param song
	 */
	public AlbumIterator(Song[] song) {
		this.song = song;
	}
	
	/**
	 * Goes to next song in the song array list
	 */
	public Song next() {
		Song s = song[position];
		position++;
		return s;
	}

	/**
	 * Checks if there is a next song in the song array list
	 */
	public boolean hasNext() {
		if(position >= song.length || song[position] == null) {
			return false;
		} else {
			return true;
		}
	}


}
