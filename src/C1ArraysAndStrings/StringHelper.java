package C1ArraysAndStrings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringHelper {

    public static List<Character> String2ListCharacter(String str) {
        char[] chars = str.toCharArray();

        Stream<Character> stream = IntStream.range(0, chars.length)
                                            .mapToObj(i -> chars[i]);

        List<Character> list = stream.collect(Collectors.toList());

        return list;
    }
}
