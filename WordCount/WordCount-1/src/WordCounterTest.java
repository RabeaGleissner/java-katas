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

}