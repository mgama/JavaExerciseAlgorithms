package JavaExercises;
import org.testng.Assert;
import org.testng.annotations.Test;
import JavaExercises.AnagramFinder;

@Test
public class TestAnagram {
  @Test(groups = { "anagram" })
  public void checkAnagramIsFalse() {
	AnagramFinder anagramFinder = new AnagramFinder("hello","help");
	Assert.assertFalse(anagramFinder.isAnagram(), "Asserting the anagram is false for hello and help");
  }

  public void checkAnagramIsTrue() {
	AnagramFinder anagramFinder = new AnagramFinder("post","stop");
	Assert.assertTrue(anagramFinder.isAnagram(), "Asserting the anagram is true for post and stop");
  }
}