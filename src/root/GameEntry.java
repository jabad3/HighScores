package root;
import java.util.Comparator;

/**
 * <code>GameEntry</code> is a generic node used in <code>Scores</code> to track "high-score" entries in video games.
 * @author Joseph Abad
 */
public class GameEntry implements Comparable<GameEntry>{
	private String playername;
	private int score;
	
	
	/**
	 * Creates a <code>GameEntry</code> object.
	 * @param playername A string for the player name
	 * @param score	the high-score for this entry
	 */
	public GameEntry(String playername, int score) {
		this.playername = playername;
		this.score = score;
	}

	/*
	 * Getters and Setters
	 */
	public String getName() {
		return this.playername;
	}
	public int getScore() {
		return this.score;
	}
	public void setName(String newplayername) {
		this.playername = newplayername;
	}
	public void setScore(int newscore) {
		this.score = newscore;
	}
	
	/*
	 * Overrides
	 */
	@Override
	public String toString() {return "(name: " + playername + ", score: " + score + ")";}

	@Override
	public int compareTo(GameEntry x) {
		int otherScore = x.getScore();
		String otherName = x.getName().toUpperCase();
		
		if(this.getScore()!=otherScore) {
			return otherScore - this.getScore();
		} else if(this.getName().toUpperCase() != otherName) {
			return otherName.compareTo(this.getName().toUpperCase());
		} else {
			return 0;
		}
	}
	
	/*
	 * Implementations
	 */
	public static Comparator<GameEntry> GameEntryComparator = new Comparator<GameEntry>() {
		@Override
		public int compare(GameEntry entry1, GameEntry entry2) {		
			if(entry1==null && entry2==null) {
				return 0;
			}
			if(entry1==null || entry2==null) {
				return (entry1 == null) ? 1:-1;
			}
			
			String firstName = entry1.getName().toUpperCase();
			int firstScore = entry1.getScore();
				String secondName = entry2.getName().toUpperCase();
				int secondScore = entry2.getScore();
			
			if(firstScore!=secondScore) {
				return secondScore - firstScore;
			} else if(firstName != secondName) {
				return secondName.compareTo(firstName);
			} else {return 0;}
		}
	};
}