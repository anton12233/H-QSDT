package Tolstoys_words_parasites;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Tolstoys_words_parasites.Main.wordCount;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    File file = new File("res/test1.txt");

    @Test
    void wordCountTest() throws IOException {
        //List<Map.Entry<String, Long>> test1 = new List<Map.Entry<String, Long>>();
        //test1.add("abc",3L);

        //List<Map.Entry<String, Long>> abc = wordCount(file,3,5);
    }

}