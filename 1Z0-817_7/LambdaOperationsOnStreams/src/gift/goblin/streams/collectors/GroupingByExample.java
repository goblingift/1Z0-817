/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class GroupingByExample {

    public static void execute() {

        Stream<String> nameStream = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<String, List<String>> groupedMap = nameStream
                .collect(Collectors.groupingBy(s -> String.valueOf(s.charAt(2))));
        System.out.println(groupedMap);

        Stream<String> nameStream2 = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<String, Long> resultMap2 = nameStream2
                .collect(Collectors.groupingBy(s -> String.valueOf(s.charAt(2)), Collectors.counting()));
        System.out.println(resultMap2);

        Stream<String> nameStream3 = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<Boolean, List<String>> splittedByBig3 = nameStream3.collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println(splittedByBig3);

        Stream<String> nameStream4 = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<Boolean, String> splittedAndJoined = nameStream4.collect(Collectors.partitioningBy(s -> s.length() > 3,
                Collectors.joining("_")));
        System.out.println(splittedAndJoined);

        anotherExample();
    }

    private static void anotherExample() {

        Predicate<String> predicate = (s) -> s.length() > 6;

        Stream<String> cities = Stream.of("Berlin", "New York", "Amsterdam", "Munich");
        Set<String> result = cities.collect(Collectors.filtering((s) -> s.length() > 6, Collectors.toSet()));
        System.out.println(result);

        Stream<String> cities2 = Stream.of("Berlin", "New York", "Amsterdam", "Munich");
        Set<Integer> citiesLength = cities2.collect(Collectors.mapping((String s) -> s.length(), Collectors.toSet()));
        System.out.println(citiesLength);

        
    }
    
}
