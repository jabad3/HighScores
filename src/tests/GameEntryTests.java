package tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import java.util.Arrays;
import root.GameEntry;

public class GameEntryTests {
	static GameEntry gameEntry;
	static GameEntry entry1;
	static GameEntry entry1_version2;
	static GameEntry entry2;
	static GameEntry entry3;
	static GameEntry entry4;
	static GameEntry entry5;
	static GameEntry entry6;
	static GameEntry entry7;	
	
	@BeforeClass
	public static void prepareForTests() {
		gameEntry 		= new GameEntry("Temp", 0);
		entry1 			= new GameEntry("Joseph", 600);
		entry1_version2 = new GameEntry("Jose", 600);
		entry2 			= new GameEntry("Vicki", 500);
		entry3 			= new GameEntry("Luis", 400);
		entry4 			= new GameEntry("Ariel", 300);
		entry5 			= new GameEntry("Cristina", 200);
		entry6 			= new GameEntry("Cristina-baby", 100);
		entry7 			= new GameEntry("Master", 1000);
	}

	@Test
	public void testGameEntryClass1() {
		assertEquals("Entry should be named Joseph", "Joseph", entry1.getName());
		assertEquals("Entry should be have score 600", 600, entry1.getScore());
	}
	@Test
	public void testGameEntryClass2() {
		assertEquals("Entry should be named Luis", "Luis", entry3.getName());
		assertEquals("Entry should be have score 400", 400, entry3.getScore());
	}
	@Test
	public void testGameEntryClass3() {
		assertEquals("Entry should be named Ariel", "Ariel", entry4.getName());
		assertEquals("Entry should be have score 300", 300, entry4.getScore());
	}
	@Test
	public void testtoString() {
		String correctAnswer = "(name: Vicki, score: 500)";
		assertEquals("", correctAnswer, entry2.toString());
	}
	@Test
	public void testCompareTo1() {
		GameEntry[] array = new GameEntry[4];
		array[0] = entry5;
		array[1] = entry1;
		array[2] = entry3;
		array[3] = entry1_version2;
		Arrays.sort(array);
		assertEquals("", entry1, array[0]);
		assertEquals("", entry1_version2, array[1]);
		assertEquals("", entry3, array[2]);
		assertEquals("", entry5, array[3]);
	}
	@Test
	public void testComparator1() {
		GameEntry[] array = new GameEntry[6];
		array[0] = null;
		array[1] = null;
		array[2] = null;
		array[3] = null;
		array[4] = null;
		Arrays.sort(array, GameEntry.GameEntryComparator);
		assertEquals("", null, array[0]);
		assertEquals("", null, array[1]);
		assertEquals("", null, array[2]);
		assertEquals("", null, array[3]);
		assertEquals("", null, array[4]);
		assertEquals("", null, array[5]);
	}
	@Test
	public void testComparator2() {
		GameEntry[] array = new GameEntry[6];
		array[0] = entry5;
		array[1] = null;
		array[2] = entry1;
		array[3] = entry3;
		array[4] = entry1_version2;
		Arrays.sort(array, GameEntry.GameEntryComparator);
		assertEquals("", entry1, array[0]);
		assertEquals("", entry1_version2, array[1]);
		assertEquals("", entry3, array[2]);
		assertEquals("", entry5, array[3]);
		assertEquals("", null, array[4]);
		assertEquals("", null, array[5]);
	}
	@Test
	public void testComparator3() {
		GameEntry[] array = new GameEntry[6];
		array[0] = null;
		array[1] = null;
		array[2] = entry1;
		array[3] = entry3;
		array[4] = entry1_version2;
		array[5] = entry1_version2;
		Arrays.sort(array, GameEntry.GameEntryComparator);
		assertEquals("", entry1, array[0]);
		assertEquals("", entry1_version2, array[1]);
		assertEquals("", entry1_version2, array[2]);
		assertEquals("", entry3, array[3]);
		assertEquals("", null, array[4]);
		assertEquals("", null, array[5]);
	}
}
