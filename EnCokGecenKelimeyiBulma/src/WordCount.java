import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private Map<String, Integer> wordCount;

    //Kelimeleri ve kelime sayılarını saymak için   HashMap tanımlanır.
    public WordCount() {
        wordCount = new HashMap<>();
    }

    //Kullanıcıdan alınan metin kelimelere ayrılır.
    public void metniIsle(String text) {
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
    }

    //En çok tekrar eden kelimeyi bulur
    public void findthemostfrequentword() {
        String mostFrequentlyUsedWord = null;
        int mostFrequentlyUsedWordCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > mostFrequentlyUsedWordCount) {
                mostFrequentlyUsedWord = entry.getKey();
                mostFrequentlyUsedWordCount = entry.getValue();
            }
        }
        //Sonuç ekrana yazdırılır.
        System.out.println("En çok geçen kelime: " + mostFrequentlyUsedWord + " (" + mostFrequentlyUsedWordCount + " kez)");
    }

}
