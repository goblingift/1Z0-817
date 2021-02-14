/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class CollectorsExample {

    public static void execute() {

        Stream<String> stringStream = Stream.of("Marc", "Anthony", "Jack", "Mandy");
        List<String> resultList = stringStream.collect(Collectors.toList());
        System.out.println(resultList);

        Stream<String> stringStream2 = Stream.of("Marc", "Anthony", "Jack", "Mandy");
        String joinedString = stringStream2.collect(Collectors.joining("-"));
        System.out.println(joinedString);
        
        Comparator<String> compareByLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        
        Stream<String> stringStream3 = Stream.of("Marc-Andre", "Anthony", "Jack", "Tim");
        Optional<String> collectorsMaxBy = stringStream3.collect(Collectors.maxBy(compareByLength));
        System.out.println(collectorsMaxBy);
        
        Stream<String> stringStream4 = Stream.of("Marc-Andre", "Anthony", "Jack", "Tim");
        Optional<String> max = stringStream4.max(compareByLength);
        System.out.println(max);
        
    }

}
