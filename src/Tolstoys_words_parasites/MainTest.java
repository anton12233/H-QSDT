package Tolstoys_words_parasites;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Tolstoys_words_parasites.Main.wordCount;

class MainTest {

    @Test
    void wordCountTest() throws IOException {
        File file = new File("res/test1.txt");

        HashMap<String, Long> test1 = new HashMap<>();
        test1.put("красивый",3L);
        test1.put("красивой",3L);

        Map<String, Long> abc = wordCount(file,3,10);
    }

}