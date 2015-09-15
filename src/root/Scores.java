package root;
import java.util.Arrays;

/**
 * <code>Scores</code> is a data-structure used to track high-scores in video games. It maintains 
 * <code>GameEntry</code> objects in descending order.
 * @author Joseph Abad
 */
public class Scores {
	private final int MAXENTRIES;
	private GameEntry[] scores;
	private int size;
	
	/**
	 * Creates a <code>Scores</code> object.
	 * @param maxentries The max capacity for this score-board. This number is the maximum amount of scores that can ever be stored. 
	 */
	public Scores(int maxentries) {
		this.MAXENTRIES = maxentries;
		this.scores = new GameEntry[this.MAXENTRIES];
		size = 0;
	}
	
	/*
	 * Methods
	 */
	
	/**
	 * Adds a <code>GameEntry</code> object to scores. If the <code>GameEntry</code> is not a high-score, it
	 * will not be added. The scores array is auto-sorted in descending order during addition.
	 * @param e the new <code>GameEntry</code> object to be added
	 */
	public void add(GameEntry e) {
		//Edge Case: e is null.
		if(e==null) return;
		//Edge Case: e is not a high-score.
		if((this.getSize()==MAXENTRIES)&&(scores[this.getSize()-1].getScore()>e.getScore())) return;
		//Edge Case: Empty array.
		if(size==0) { scores[0] = e; size++; return;} 
		//Edge Case: Full array, have to knock-off the tail node.
		else if(size==MAXENTRIES) { scores[MAXENTRIES-1] = null; size--;}
		
		//General Case: start shifting until you have reached correct insertion location.
		int currentIndex = size;
		for(;currentIndex>0;currentIndex--) {
			if(scores[currentIndex-1].getScore() > e.getScore()) break;
			else scores[currentIndex] = scores[currentIndex-1];
		}
		//Insert new object.
		scores[currentIndex]=e;
		size++;
	}

	/**
	 * Removes an object from scores, at the given index. No changes occur if the index is: larger than the 
	 * current size, negative, or null.
	 * @param index the index at which to remove the <code>GameEntry</code> object from.
	 */
	public void remove(int index) {
		//Edge Case: index is null, negative number, equal/larger than MAXINTERGER, or larger than size
		if(index<0 || index>MAXENTRIES || index>size) return;
		//Edge Case: index is first node or last node.
		if(size==1 && index==0) {scores[0] = null; size--; return;}
		else if(index==MAXENTRIES-1) {
			scores[MAXENTRIES-1]=null; size--; return;
		}
		//General Case:
		int currentIndex = index;
		for(;currentIndex<size-1;currentIndex++) {
			scores[currentIndex] = scores[currentIndex+1];
		}
		scores[currentIndex]=null;
		size--;
	}
	
	/**
	 * Removes a <code>GameEntry</code> object from scores, if the given reference exists. No changes will 
	 * occur if the reference is null or does not exist. If there are multiple references to an object in 
	 * <code>Scores</code>, the first one will be removed.
	 * @param e a reference to a <code>GameEntry</code> object that should be removed.
	 */
	public void remove(GameEntry e) {
		//Edge Case: e is null.
		if(e==null) return;
		//Edge Case: array is empty
		if(size==0) return;
		//Edge Case: All objects are the same.
		if( 	(size>1) &&	
				(scores[0]!=null) &&
				(scores[MAXENTRIES-1]!=null) &&
				(scores[0].getName()==scores[MAXENTRIES-1].getName()) && 
				(scores[0].getScore()==scores[MAXENTRIES-1].getScore()) && 
				(scores[0].getName()==e.getName() && scores[0].getScore()==e.getScore()) 
				) {
			scores[MAXENTRIES-1]=null; size--; return;
		}
		//Edge Case: e is at the end of the array (and many objects in array are different)
		if( 	(scores[MAXENTRIES-1]!=null) && 
				(scores[MAXENTRIES-1].getName()==e.getName()) && 
				(scores[MAXENTRIES-1].getScore()==e.getScore()) && 
				(
					(scores[0].getName()!=scores[MAXENTRIES-1].getName()) &&
					(scores[0].getScore()!=scores[MAXENTRIES-1].getScore())
				)
				) {
			scores[MAXENTRIES-1] = null;
			size--;
			return;
		}
		//General Case: Remove an existing e object, and shift when necessary.
		int i = 0;
		boolean matchFound = false;
		for(;i<size;i++) {
			if( (scores[i].getName()==e.getName()) && (scores[i].getScore()==e.getScore()) ) {
				matchFound = true;
				size--;
			}
			if(matchFound) scores[i] = scores[i+1];
		}
		if(matchFound) scores[i] = null;
	}
	
	/**
	 * Empties all the <code>GameEntry</code> objects maintained by <code>Scores</code>.
	 */
	public void clearAll() {
		size = 0;
		for(int i=0; i<MAXENTRIES; i++) {
			scores[i] = null;
		}
	}
	
	/*
	 * Getters and Setters
	 */
	
	/**
	 * Returns an array containing all the high-scores in <code>Scores</code>. The array is sorted 
	 * in descending order.
	 * @return an array with all the high-scores
	 */
	public GameEntry[] getScores() {
		GameEntry[] tempScores = scores;
		return tempScores;
	}
	
	/**
	 * Returns the number of high-scores in <code>Scores</code>.
	 * @return the number of high-scores
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * Returns the maximum capacity for high-scores. This integer is statically defined at object construction.
	 * @return the capacity for high-scores in <code>Scores</code>
	 */
	public int getSizeCapacity() {
		return MAXENTRIES;
	}
	
	/*
	 * Overrides
	 */
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Arrays.toString(scores);
	}
}