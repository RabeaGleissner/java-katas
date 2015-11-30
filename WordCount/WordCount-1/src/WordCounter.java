import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> phrase(String phrase) {
        Map<String, Integer> wordsWithCount = new HashMap<>();
        String[] words = phrase.split(" ");
        for (String word : words) {
            wordsWithCount.put(word, 1);
        }
        return wordsWithCount;
    }
}
