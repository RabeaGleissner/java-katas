import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCounterTest {
    private final WordCounter wordCounter = new WordCounter();
    private Map<String, Integer> actualWordCount;
    Map<String, Integer> expectedWordCount;

    @Before
    public void setup() {
        actualWordCount = new HashMap<>();
        expectedWordCount = new HashMap<>();
    }


    @Test
    public void countOneWord() {
        expectedWordCount.put("word", 1);
        actualWordCount = wordCounter.phrase("word");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void countsOneOfEach() {
        expectedWordCount.put("one", 1);
        expectedWordCount.put("of", 1);
        expectedWordCount.put("each", 1);
        actualWordCount = wordCounter.phrase("one of each");
        assertEquals(expectedWordCount, actualWordCount);

    }

    @Test
    public void countsMultipleOccurences() {
        expectedWordCount.put("fish", 4);
        expectedWordCount.put("one", 1);
        expectedWordCount.put("two", 1);
        expectedWordCount.put("three", 1);
        expectedWordCount.put("fried", 1);
        actualWordCount = wordCounter.phrase("one fish two fish three fish fried fish");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void ignoresPunctuation() {
        expectedWordCount.put("car", 1);
        expectedWordCount.put("carpet", 1);
        expectedWordCount.put("as", 1);
        expectedWordCount.put("java", 1);
        expectedWordCount.put("javascript", 1);
        actualWordCount = wordCounter.phrase("car : carpet as java : javascript!!&@$%^&");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void includeNumbers() {
        expectedWordCount.put("testing", 2);
        expectedWordCount.put("1", 1);
        expectedWordCount.put("2", 1);
        actualWordCount = wordCounter.phrase("testing 1, 2 testing");
        assertEquals(expectedWordCount, actualWordCount);
    }
}