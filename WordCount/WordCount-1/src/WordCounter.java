import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> phrase(String phrase) {

        Map<String, Integer> wordsWithCount = new HashMap<>();

        String[] words = phrase.split(" ");

        for (String word : words) {
            Integer count = 0;
            if (wordsWithCount.containsKey(word)) {
                count = wordsWithCount.get(word);
            }
            wordsWithCount.put(word, ++count);
        }
        return wordsWithCount;
    }
}
