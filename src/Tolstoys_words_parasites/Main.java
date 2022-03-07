package Tolstoys_words_parasites;

//        Подсчет частоты появления слов во входном потоке. Дать возможность указывать минимальную/максимальную длину слова,
//        участвующую в подсчёте частоты, для фильтрации предлогов и местоимений. Использовать Java8 Stream API.
//        Файл для анализа https://drive.google.com/open?id=1YnRy5H8Emx4kyA1-lLZkNuY8LDTplulu
//        * Выяснить самые популярные прилагательные в тексте.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {
    static String regexPunct = "(?<!\\S)\\p{Punct}+|\\p{Punct}+(?!\\S)";

    public static void main(String[] args) throws IOException {

        File file = new File("res/vim1.txt");

        System.out.println((wordCount(file,5,10)));


        System.out.println(wordCount_adject(wordCount(file,5,10)));

    }

    public static Map<String, Long> wordCount(File file, int minSize, int maxSize) throws IOException {

        return   Files.lines(Paths.get(file.getAbsolutePath()))
                .map(s -> s = s.replaceAll(regexPunct,""))
                .map(s->s.toLowerCase(Locale.ROOT))
                .flatMap( s -> Stream.of(s.split(" ")))
                .filter(e->e.length()>minSize)
                .filter(e->e.length()<maxSize)
                .collect(toMap(Function.identity(), v->1L,Long::sum))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static Map<String, Long> wordCount_adject(Map<String, Long> map){

        String[] adject = new String[]{ "ой", "ый","ая","яя","ую","юю","ые","ое","их","ый","им"};
        Set<String> adjectSet = Arrays.stream(adject).collect(Collectors.toSet());

        return map.entrySet().stream()
                .filter(s->adjectSet.contains(s.getKey()
                        .substring(s.getKey().length()-2)))
                .filter(s->!s.getKey().startsWith("котор"))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    }

}
