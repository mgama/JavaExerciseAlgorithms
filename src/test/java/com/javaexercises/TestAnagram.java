package JavaExercises;
import org.testng.Assert;
import org.testng.annotations.Test;
import JavaExercises.AnagramFinder;

@Test
public class TestAnagram {
  @Test(groups = { "anagram" })
  public void checkAnagramIsFalseBecauseOfInvalidInput() {
	AnagramFinder anagramFinder = new AnagramFinder();
	Assert.assertFalse(anagramFinder.isAnagram("","help"), "Asserting the anagram is false since it had invalid input data (empty string)");
  }

  public void checkAnagramIsFalse() {
	AnagramFinder anagramFinder = new AnagramFinder();
	Assert.assertFalse(anagramFinder.isAnagram("hello","help"), "Asserting the anagram is false for hello and help");
  }

  public void checkAnagramIsTrue() {
	AnagramFinder anagramFinder = new AnagramFinder();
	Assert.assertTrue(anagramFinder.isAnagram("post","stop"), "Asserting the anagram is true for post and stop");
  }
}