package Tolstoys_words_parasites;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Tolstoys_words_parasites.Main.wordCount;
import static Tolstoys_words_parasites.Main.wordCount_adject;

class MainTest {

    @Test
    void wordCountAdjectTest() throws IOException {
        File file1 = new File("res/test1.txt");

        HashMap<String, Long> testFromTest1 = new HashMap<>();
        testFromTest1.put("красивый",3L);
        testFromTest1.put("красивой",3L);

        Map<String, Long> dataFromTest1 = wordCount_adject(wordCount(file1,3,10));
        HashMap<String, Long> dataFromTest1_HashMap = new HashMap<>(dataFromTest1);

        Assertions.assertEquals(dataFromTest1_HashMap, testFromTest1);

        File file2 = new File("res/test2.txt");

        HashMap<String, Long> testFromTest2 = new HashMap<>();
        testFromTest2.put("красивый",3L);
        testFromTest2.put("красивой",2L);

        Map<String, Long> dataFromTest2 = wordCount_adject(wordCount(file2,3,10));
        HashMap<String, Long> dataFromTest2_HashMap = new HashMap<>(dataFromTest2);

        Assertions.assertEquals(dataFromTest2_HashMap, testFromTest2);

    }


    @Test
    void wordCountTest() throws IOException {
        File file1 = new File("res/test1.txt");

        HashMap<String, Long> testFromTest1 = new HashMap<>();
        testFromTest1.put("интелеге", 3L);
        testFromTest1.put("текст", 3L);
        testFromTest1.put("красивый",3L);
        testFromTest1.put("красивой",3L);
        testFromTest1.put("пишу",3L);
        testFromTest1.put("привет",3L);

        Map<String, Long> dataFromTest1 = wordCount(file1,3,10);
        HashMap<String, Long> dataFromTest1_HashMap = new HashMap<>(dataFromTest1);

        Assertions.assertEquals(dataFromTest1_HashMap, testFromTest1);

        File file2 = new File("res/test2.txt");

        HashMap<String, Long> testFromTest2 = new HashMap<>();
        testFromTest2.put("интелеге",3L);
        testFromTest2.put("текст",3L);
        testFromTest2.put("красивый",3L);
        testFromTest2.put("красивой",2L);
        testFromTest2.put("пишу",3L);
        testFromTest2.put("привет",3L);
        testFromTest2.put("краси",1L);

        Map<String, Long> dataFromTest2 = wordCount(file2,3,10);
        HashMap<String, Long> dataFromTest2_HashMap = new HashMap<>(dataFromTest2);

        Assertions.assertEquals(dataFromTest2_HashMap, testFromTest2);

    }

}