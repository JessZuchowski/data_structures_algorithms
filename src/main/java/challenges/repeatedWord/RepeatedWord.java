package challenges.repeatedWord;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    public static Set<String> repeatedWord(String input) {
        if (input == null) {
            return Collections.emptySet();
        }
        Set<String> repeats = new HashSet<>();
        String[] words = input.split(" ");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!Set.add(word)) {
                repeats.add(word);
            }
        }
        return repeats;
    }
}
