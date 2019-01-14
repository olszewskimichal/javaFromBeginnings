package dzien8.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "asdasdsa", "121312", "a", "a");
        List<String> result = list.stream()
                .filter(v -> v.length() > 4)
                .map(v -> v.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(result);

        List<String> list1 = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list1);

        Set<String> set = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(v -> v.length(), Collectors.toList()));
        System.out.println(collect);

        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
        IntSummaryStatistics intSummaryStatistics1 = Stream.of(1, 2, 3, 4, 5).mapToInt(v -> v).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
    }
}
