package tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import root.GameEntry;
import root.Scores;

public class ScoresTest {
	static Scores scores;
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
		scores = new Scores(5);
		entry1 = new GameEntry("Joseph", 600);
		entry1_version2 = new GameEntry("Jose", 600);
		entry2 = new GameEntry("Vicki", 500);
		entry3 = new GameEntry("Luis", 400);
		entry4 = new GameEntry("Ariel", 300);
		entry5 = new GameEntry("Cristina", 200);
		entry6 = new GameEntry("Cristina-baby", 100);
		entry7 = new GameEntry("Master", 1000);
	}
	@Before
	public void beforeEach() {
		scores.clearAll();
	}
	@Test
	public void testAdd1() {
		scores.add(entry1);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testAdd2() {
		scores.add(entry1);
		scores.add(entry2);
		assertEquals("", 2, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testAdd3() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		assertEquals("", 3, scores.getSize() );	
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testAdd4() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		assertEquals("", 4, scores.getSize() );	
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );		
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testAdd5() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		assertEquals("", 5, scores.getSize() );	
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );
		assertEquals("", "Cristina", scores.getScores()[4].getName() );
		assertEquals("", 200, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd6() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.add(entry5);
		assertEquals("", 5, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );
		assertEquals("", "Cristina", scores.getScores()[4].getName() );
		assertEquals("", 200, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd7() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.add(entry1);
		assertEquals("", 5, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Joseph", scores.getScores()[1].getName() );
		assertEquals("", 600, scores.getScores()[1].getScore() );
		assertEquals("", "Vicki", scores.getScores()[2].getName() );
		assertEquals("", 500, scores.getScores()[2].getScore() );
		assertEquals("", "Luis", scores.getScores()[3].getName() );
		assertEquals("", 400, scores.getScores()[3].getScore() );
		assertEquals("", "Ariel", scores.getScores()[4].getName() );
		assertEquals("", 300, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd8() {
		scores.add(entry5);
		scores.add(entry4);
		scores.add(entry3);
		scores.add(entry2);
		scores.add(entry1);		
		assertEquals("", 5, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );
		assertEquals("", "Cristina", scores.getScores()[4].getName() );
		assertEquals("", 200, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd9() {
		scores.add(entry2);
		scores.add(entry4);
		scores.add(entry3);
		scores.add(entry5);
		scores.add(entry1);		
		assertEquals("", 5, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );
		assertEquals("", "Cristina", scores.getScores()[4].getName() );
		assertEquals("", 200, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd10() {
		scores.add(entry2);
		scores.add(entry4);
		scores.add(entry3);
		scores.add(entry5);
		scores.add(entry6);
		scores.add(entry1);
		assertEquals("", 5, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );
		assertEquals("", "Cristina", scores.getScores()[4].getName() );
		assertEquals("", 200, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd11() {
		scores.add(entry2);
		scores.add(entry4);
		scores.add(entry3);
		scores.add(entry5);
		scores.add(entry1);
		scores.add(entry6);
		assertEquals("", 5, scores.getSize() );
		assertEquals("", "Joseph", scores.getScores()[0].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", "Vicki", scores.getScores()[1].getName() );
		assertEquals("", 500, scores.getScores()[1].getScore() );
		assertEquals("", "Luis", scores.getScores()[2].getName() );
		assertEquals("", 400, scores.getScores()[2].getScore() );
		assertEquals("", "Ariel", scores.getScores()[3].getName() );
		assertEquals("", 300, scores.getScores()[3].getScore() );
		assertEquals("", "Cristina", scores.getScores()[4].getName() );
		assertEquals("", 200, scores.getScores()[4].getScore() );
	}
	@Test
	public void testAdd12() {
		scores.add(entry6);
		scores.add(entry5);
		scores.add(entry7);
		assertEquals("", 3, scores.getSize() );
		assertEquals("", "Master", scores.getScores()[0].getName() );
		assertEquals("", 1000, scores.getScores()[0].getScore() );
		assertEquals("", "Cristina", scores.getScores()[1].getName() );
		assertEquals("", 200, scores.getScores()[1].getScore() );
		assertEquals("", "Cristina-baby", scores.getScores()[2].getName() );
		assertEquals("", 100, scores.getScores()[2].getScore() );
		assertEquals("", null, scores.getScores()[3]);
		assertEquals("", null, scores.getScores()[4]);
	}
	@Test
	public void testAdd13() {
		scores.add(entry1);
		scores.add(entry1_version2);
		assertEquals("", 2, scores.getSize() );
		assertEquals("", "Jose", scores.getScores()[0].getName() );
		assertEquals("", "Joseph", scores.getScores()[1].getName() );
		assertEquals("", 600, scores.getScores()[0].getScore() );
		assertEquals("", 600, scores.getScores()[1].getScore() );
	}
	@Test
	public void testClearAll1() {
		scores.clearAll();
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testClearAll2() {
		scores.clearAll();
		scores.clearAll();
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testClearAll3() {
		scores.add(entry6);
		scores.add(entry5);
		scores.add(entry7);
		scores.clearAll();
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testClearAll4() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.add(entry6);
		scores.clearAll();
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject1() {
		scores.add(entry1);
		scores.remove(null);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject2() {
		scores.remove(entry1);
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject2_1() {
		scores.add(entry1);
		scores.remove(entry2);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject3() {
		scores.add(entry1);
		scores.remove(entry1);
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject4() {
		scores.add(entry1);
		scores.add(entry2);
		scores.remove(entry1);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry2, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject5() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(entry3);
		assertEquals("", 4, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", entry2, scores.getScores()[1] );
		assertEquals("", entry4, scores.getScores()[2] );
		assertEquals("", entry5, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject6() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(entry1);
		scores.remove(entry2);
		scores.remove(entry5);
		assertEquals("", 2, scores.getSize() );
		assertEquals("", entry3, scores.getScores()[0] );
		assertEquals("", entry4, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject7() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(entry5);
		assertEquals("", 4, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", entry2, scores.getScores()[1] );
		assertEquals("", entry3, scores.getScores()[2] );
		assertEquals("", entry4, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject8() {
		scores.add(entry1);
		scores.add(entry1);
		scores.add(entry1);
		scores.add(entry1);
		scores.add(entry1);
		scores.remove(entry2);
		assertEquals("", 5, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", entry1, scores.getScores()[1] );
		assertEquals("", entry1, scores.getScores()[2] );
		assertEquals("", entry1, scores.getScores()[3] );
		assertEquals("", entry1, scores.getScores()[4] );
	}
	@Test
	public void testRemoveObject9() {
		scores.add(entry1);
		scores.add(entry1);
		scores.add(entry1);
		scores.add(entry1);
		scores.add(entry1);
		scores.remove(entry1);
		assertEquals("", 4, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", entry1, scores.getScores()[1] );
		assertEquals("", entry1, scores.getScores()[2] );
		assertEquals("", entry1, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex1() {
		scores.add(entry1);
		scores.remove(null);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex2() {
		scores.add(entry1);
		scores.remove(-1);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex3() {
		scores.add(entry1);
		scores.remove(6);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex4() {
		scores.add(entry1);
		scores.remove(0);
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex5() {
		scores.add(entry1);
		scores.add(entry2);
		scores.remove(0);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry2, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex6() {
		scores.add(entry1);
		scores.add(entry2);
		scores.remove(1);
		assertEquals("", 1, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex7() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.remove(0);
		assertEquals("", 2, scores.getSize() );
		assertEquals("", entry2, scores.getScores()[0] );
		assertEquals("", entry3, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex8() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(4);
		assertEquals("", 4, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", entry2, scores.getScores()[1] );
		assertEquals("", entry3, scores.getScores()[2] );
		assertEquals("", entry4, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex9() {
		//System.out.println("9");
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(1);
		assertEquals("", 4, scores.getSize() );
		assertEquals("", entry1, scores.getScores()[0] );
		assertEquals("", entry3, scores.getScores()[1] );
		assertEquals("", entry4, scores.getScores()[2] );
		assertEquals("", entry5, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex10() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(0);
		assertEquals("", 4, scores.getSize() );
		assertEquals("", entry2, scores.getScores()[0] );
		assertEquals("", entry3, scores.getScores()[1] );
		assertEquals("", entry4, scores.getScores()[2] );
		assertEquals("", entry5, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex11() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(0);
		scores.remove(0);
		scores.remove(0);
		scores.remove(0);
		scores.remove(0);
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex12() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(4);
		scores.remove(1);
		scores.remove(0);
		scores.remove(1);
		scores.remove(0);
		assertEquals("", 0, scores.getSize() );
		assertEquals("", null, scores.getScores()[0] );
		assertEquals("", null, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testRemoveIndex13() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		scores.remove(4);
		scores.remove(0);
		scores.remove(2);
		assertEquals("", 2, scores.getSize() );
		assertEquals("", entry2, scores.getScores()[0] );
		assertEquals("", entry3, scores.getScores()[1] );
		assertEquals("", null, scores.getScores()[2] );
		assertEquals("", null, scores.getScores()[3] );
		assertEquals("", null, scores.getScores()[4] );
	}
	@Test
	public void testtoString1() {
		scores.add(entry1);
		scores.add(entry2);
		scores.add(entry3);
		scores.add(entry4);
		scores.add(entry5);
		String correctAnswer = "[(name: Joseph, score: 600), (name: Vicki, score: 500), (name: Luis, score: 400), (name: Ariel, score: 300), (name: Cristina, score: 200)]";
		assertEquals("", correctAnswer, scores.toString());
	}
}