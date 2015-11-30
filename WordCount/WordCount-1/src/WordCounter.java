import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> phrase(String word) {
        Map<String, Integer> wordsWithCount = new HashMap<>();
        wordsWithCount.put(word, 1);
        return wordsWithCount;
    }
}
