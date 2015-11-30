import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCounterTest {
    private final WordCounter wordCounter = new WordCounter();

    @Test
    public void countOneWord() {
        Map<String, Integer> actualWordCount = new HashMap<>();
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("word", 1);
        actualWordCount = wordCounter.phrase("word");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void countsOneOfEach() {
        Map<String, Integer> actualWordCount = new HashMap<>();
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("of", 1);
        expectedWordCount.put("each", 1);
        actualWordCount = wordCounter.phrase("one of each");
        assertEquals(expectedWordCount, actualWordCount);

    }
}